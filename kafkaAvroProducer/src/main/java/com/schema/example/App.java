package com.schema.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

import com.flink.schema.Code;
import com.flink.schema.Coding;
import com.flink.schema.High;
import com.flink.schema.Low;
import com.flink.schema.ObservationTest;
import com.flink.schema.Performer;
import com.flink.schema.ReferenceRange;
import com.flink.schema.ValueQuantity;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import io.confluent.kafka.serializers.AbstractKafkaSchemaSerDeConfig;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import java.util.List;
/**
 * Hello world!
 *
 */
public class App 
{

    private ObservationTest prepareObj()
    {
        CharSequence charSequence = new StringBuffer("123456");
        CharSequence status = new StringBuffer("active");

        List<Performer> flinkList = new ArrayList<>(); 
        Performer performer = new Performer();
        performer.setDisplay("practioner");
        flinkList.add(performer);
        Random randomGenerator=new Random();
        
        High high = new High("g/dl", "http://unitsofmeasure.org","g/dl" ,randomGenerator.nextInt(10)+7);
        Low low = new Low("g/dl", "http://unitsofmeasure.org","g/dl" ,(double) (randomGenerator.nextInt(7)+4));
        ReferenceRange referenceRange = new ReferenceRange(high, low);

        return ObservationTest.newBuilder().setCode(new Code())
        .setId(charSequence)
        .setStatus(status)
        .setPerformer(flinkList)
        .setReferenceRange(Collections.singletonList(referenceRange))
        
        .build();
    }

    public void sendDataToTopic1(Map<String, Object> properties)
    {
        Producer<String, ObservationTest> producer = new KafkaProducer<String, ObservationTest>(properties);
        ProducerRecord<String,ObservationTest> producerRecord = new ProducerRecord<String,ObservationTest>("input_topic_1", "testKey",prepareObj()); 
        producer.send(producerRecord);
        producer.flush();
    }
    
    public static void main( String[] args ) throws InterruptedException
    {
        Map<String,Object> properties = new HashMap<String,Object>();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,KafkaAvroSerializer.class.getName());
        properties.put(AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG,"http://localhost:8081");
        App app = new App();
        
        while(true)
        {
            app.sendDataToTopic1(properties);
            Thread.sleep(1000);
        }
        
    }
}

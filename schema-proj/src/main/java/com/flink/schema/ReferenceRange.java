/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.flink.schema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ReferenceRange extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4876564092659311672L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ReferenceRange\",\"namespace\":\"com.flink.schema\",\"fields\":[{\"name\":\"high\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"High\",\"fields\":[{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"unit\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",\"int\"],\"default\":null}]}],\"default\":null},{\"name\":\"low\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Low\",\"fields\":[{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"unit\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ReferenceRange> ENCODER =
      new BinaryMessageEncoder<ReferenceRange>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ReferenceRange> DECODER =
      new BinaryMessageDecoder<ReferenceRange>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ReferenceRange> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ReferenceRange> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ReferenceRange> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ReferenceRange>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ReferenceRange to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ReferenceRange from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ReferenceRange instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ReferenceRange fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public com.flink.schema.High high;
  @Deprecated public com.flink.schema.Low low;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ReferenceRange() {}

  /**
   * All-args constructor.
   * @param high The new value for high
   * @param low The new value for low
   */
  public ReferenceRange(com.flink.schema.High high, com.flink.schema.Low low) {
    this.high = high;
    this.low = low;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return high;
    case 1: return low;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: high = (com.flink.schema.High)value$; break;
    case 1: low = (com.flink.schema.Low)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'high' field.
   * @return The value of the 'high' field.
   */
  public com.flink.schema.High getHigh() {
    return high;
  }


  /**
   * Sets the value of the 'high' field.
   * @param value the value to set.
   */
  public void setHigh(com.flink.schema.High value) {
    this.high = value;
  }

  /**
   * Gets the value of the 'low' field.
   * @return The value of the 'low' field.
   */
  public com.flink.schema.Low getLow() {
    return low;
  }


  /**
   * Sets the value of the 'low' field.
   * @param value the value to set.
   */
  public void setLow(com.flink.schema.Low value) {
    this.low = value;
  }

  /**
   * Creates a new ReferenceRange RecordBuilder.
   * @return A new ReferenceRange RecordBuilder
   */
  public static com.flink.schema.ReferenceRange.Builder newBuilder() {
    return new com.flink.schema.ReferenceRange.Builder();
  }

  /**
   * Creates a new ReferenceRange RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ReferenceRange RecordBuilder
   */
  public static com.flink.schema.ReferenceRange.Builder newBuilder(com.flink.schema.ReferenceRange.Builder other) {
    if (other == null) {
      return new com.flink.schema.ReferenceRange.Builder();
    } else {
      return new com.flink.schema.ReferenceRange.Builder(other);
    }
  }

  /**
   * Creates a new ReferenceRange RecordBuilder by copying an existing ReferenceRange instance.
   * @param other The existing instance to copy.
   * @return A new ReferenceRange RecordBuilder
   */
  public static com.flink.schema.ReferenceRange.Builder newBuilder(com.flink.schema.ReferenceRange other) {
    if (other == null) {
      return new com.flink.schema.ReferenceRange.Builder();
    } else {
      return new com.flink.schema.ReferenceRange.Builder(other);
    }
  }

  /**
   * RecordBuilder for ReferenceRange instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ReferenceRange>
    implements org.apache.avro.data.RecordBuilder<ReferenceRange> {

    private com.flink.schema.High high;
    private com.flink.schema.High.Builder highBuilder;
    private com.flink.schema.Low low;
    private com.flink.schema.Low.Builder lowBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.flink.schema.ReferenceRange.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.high)) {
        this.high = data().deepCopy(fields()[0].schema(), other.high);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasHighBuilder()) {
        this.highBuilder = com.flink.schema.High.newBuilder(other.getHighBuilder());
      }
      if (isValidValue(fields()[1], other.low)) {
        this.low = data().deepCopy(fields()[1].schema(), other.low);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasLowBuilder()) {
        this.lowBuilder = com.flink.schema.Low.newBuilder(other.getLowBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing ReferenceRange instance
     * @param other The existing instance to copy.
     */
    private Builder(com.flink.schema.ReferenceRange other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.high)) {
        this.high = data().deepCopy(fields()[0].schema(), other.high);
        fieldSetFlags()[0] = true;
      }
      this.highBuilder = null;
      if (isValidValue(fields()[1], other.low)) {
        this.low = data().deepCopy(fields()[1].schema(), other.low);
        fieldSetFlags()[1] = true;
      }
      this.lowBuilder = null;
    }

    /**
      * Gets the value of the 'high' field.
      * @return The value.
      */
    public com.flink.schema.High getHigh() {
      return high;
    }


    /**
      * Sets the value of the 'high' field.
      * @param value The value of 'high'.
      * @return This builder.
      */
    public com.flink.schema.ReferenceRange.Builder setHigh(com.flink.schema.High value) {
      validate(fields()[0], value);
      this.highBuilder = null;
      this.high = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'high' field has been set.
      * @return True if the 'high' field has been set, false otherwise.
      */
    public boolean hasHigh() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'high' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.flink.schema.High.Builder getHighBuilder() {
      if (highBuilder == null) {
        if (hasHigh()) {
          setHighBuilder(com.flink.schema.High.newBuilder(high));
        } else {
          setHighBuilder(com.flink.schema.High.newBuilder());
        }
      }
      return highBuilder;
    }

    /**
     * Sets the Builder instance for the 'high' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.flink.schema.ReferenceRange.Builder setHighBuilder(com.flink.schema.High.Builder value) {
      clearHigh();
      highBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'high' field has an active Builder instance
     * @return True if the 'high' field has an active Builder instance
     */
    public boolean hasHighBuilder() {
      return highBuilder != null;
    }

    /**
      * Clears the value of the 'high' field.
      * @return This builder.
      */
    public com.flink.schema.ReferenceRange.Builder clearHigh() {
      high = null;
      highBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'low' field.
      * @return The value.
      */
    public com.flink.schema.Low getLow() {
      return low;
    }


    /**
      * Sets the value of the 'low' field.
      * @param value The value of 'low'.
      * @return This builder.
      */
    public com.flink.schema.ReferenceRange.Builder setLow(com.flink.schema.Low value) {
      validate(fields()[1], value);
      this.lowBuilder = null;
      this.low = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'low' field has been set.
      * @return True if the 'low' field has been set, false otherwise.
      */
    public boolean hasLow() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'low' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.flink.schema.Low.Builder getLowBuilder() {
      if (lowBuilder == null) {
        if (hasLow()) {
          setLowBuilder(com.flink.schema.Low.newBuilder(low));
        } else {
          setLowBuilder(com.flink.schema.Low.newBuilder());
        }
      }
      return lowBuilder;
    }

    /**
     * Sets the Builder instance for the 'low' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.flink.schema.ReferenceRange.Builder setLowBuilder(com.flink.schema.Low.Builder value) {
      clearLow();
      lowBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'low' field has an active Builder instance
     * @return True if the 'low' field has an active Builder instance
     */
    public boolean hasLowBuilder() {
      return lowBuilder != null;
    }

    /**
      * Clears the value of the 'low' field.
      * @return This builder.
      */
    public com.flink.schema.ReferenceRange.Builder clearLow() {
      low = null;
      lowBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ReferenceRange build() {
      try {
        ReferenceRange record = new ReferenceRange();
        if (highBuilder != null) {
          try {
            record.high = this.highBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("high"));
            throw e;
          }
        } else {
          record.high = fieldSetFlags()[0] ? this.high : (com.flink.schema.High) defaultValue(fields()[0]);
        }
        if (lowBuilder != null) {
          try {
            record.low = this.lowBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("low"));
            throw e;
          }
        } else {
          record.low = fieldSetFlags()[1] ? this.low : (com.flink.schema.Low) defaultValue(fields()[1]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ReferenceRange>
    WRITER$ = (org.apache.avro.io.DatumWriter<ReferenceRange>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ReferenceRange>
    READER$ = (org.apache.avro.io.DatumReader<ReferenceRange>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.high == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.high.customEncode(out);
    }

    if (this.low == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.low.customEncode(out);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.high = null;
      } else {
        if (this.high == null) {
          this.high = new com.flink.schema.High();
        }
        this.high.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.low = null;
      } else {
        if (this.low == null) {
          this.low = new com.flink.schema.Low();
        }
        this.low.customDecode(in);
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.high = null;
          } else {
            if (this.high == null) {
              this.high = new com.flink.schema.High();
            }
            this.high.customDecode(in);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.low = null;
          } else {
            if (this.low == null) {
              this.low = new com.flink.schema.Low();
            }
            this.low.customDecode(in);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}











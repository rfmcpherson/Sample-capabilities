/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.x.service.marketplace.message;  
@SuppressWarnings("all")
public class FailedCancelListingMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"FailedCancelListingMessage\",\"namespace\":\"com.x.service.marketplace.message\",\"fields\":[{\"name\":\"merchantItemId\",\"type\":\"string\"},{\"name\":\"xProfileId\",\"type\":\"string\"},{\"name\":\"log\",\"type\":\"string\"}],\"topic\":\"/listing/cancel/fail\"}");
  public java.lang.CharSequence merchantItemId;
  public java.lang.CharSequence xProfileId;
  public java.lang.CharSequence log;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return merchantItemId;
    case 1: return xProfileId;
    case 2: return log;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: merchantItemId = (java.lang.CharSequence)value$; break;
    case 1: xProfileId = (java.lang.CharSequence)value$; break;
    case 2: log = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
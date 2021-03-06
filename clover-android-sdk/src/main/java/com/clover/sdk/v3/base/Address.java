/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2013 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.base;

@SuppressWarnings("all")
public final class Address implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getAddress1() {
    return cacheGet(CacheKey.address1);
  }
  public java.lang.String getAddress2() {
    return cacheGet(CacheKey.address2);
  }
  public java.lang.String getAddress3() {
    return cacheGet(CacheKey.address3);
  }
  public java.lang.String getCity() {
    return cacheGet(CacheKey.city);
  }
  public java.lang.String getCountry() {
    return cacheGet(CacheKey.country);
  }
  public java.lang.String getPhoneNumber() {
    return cacheGet(CacheKey.phoneNumber);
  }
  public java.lang.String getState() {
    return cacheGet(CacheKey.state);
  }
  public java.lang.String getZip() {
    return cacheGet(CacheKey.zip);
  }


  private enum CacheKey {
    address1 {
      @Override
      public Object extractValue(Address instance) {
        return instance.extractAddress1();
      }
    },
    address2 {
      @Override
      public Object extractValue(Address instance) {
        return instance.extractAddress2();
      }
    },
    address3 {
      @Override
      public Object extractValue(Address instance) {
        return instance.extractAddress3();
      }
    },
    city {
      @Override
      public Object extractValue(Address instance) {
        return instance.extractCity();
      }
    },
    country {
      @Override
      public Object extractValue(Address instance) {
        return instance.extractCountry();
      }
    },
    phoneNumber {
      @Override
      public Object extractValue(Address instance) {
        return instance.extractPhoneNumber();
      }
    },
    state {
      @Override
      public Object extractValue(Address instance) {
        return instance.extractState();
      }
    },
    zip {
      @Override
      public Object extractValue(Address instance) {
        return instance.extractZip();
      }
    },
    ;

    public abstract Object extractValue(Address instance);
  }

  private org.json.JSONObject jsonObject = null;
  private android.os.Bundle bundle = null;
  private android.os.Bundle changeLog = null;
  private Object[] cache = null;
  private byte[] cacheState = null;

  private static final byte STATE_NOT_CACHED = 0;
  private static final byte STATE_CACHED_NO_VALUE = 1;
  private static final byte STATE_CACHED_VALUE = 2;

  /**
   * Constructs a new empty instance.
   */
  public Address() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Address(String json) throws java.lang.IllegalArgumentException {
    try {
      this.jsonObject = new org.json.JSONObject(json);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public Address(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Address(Address src) {
    if (src.jsonObject != null) {
      this.jsonObject = com.clover.sdk.v3.JsonHelper.deepCopy(src.getJSONObject());
    }
  }

  private <T> T cacheGet(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return (T) cache[index];
  }

  private boolean cacheValueIsNotNull(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cache[index] != null;
  }

  private boolean cacheHasKey(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cacheState[index] == STATE_CACHED_VALUE;
  }

  private void cacheRemoveValue(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    cache[index] = null;
    cacheState[index] = STATE_CACHED_NO_VALUE;
  }

  private void cacheMarkDirty(CacheKey key) {
    if (cache != null) {
      int index = key.ordinal();
      cache[index] = null;
      cacheState[index] = STATE_NOT_CACHED;
    }
  }

  private void populateCache(int index) {
    if (cache == null) {
      int size = CacheKey.values().length;
      cache = new Object[size];
      cacheState = new byte[size];
    }

    if (cacheState[index] == STATE_NOT_CACHED) {
      CacheKey key = CacheKey.values()[index];

      if (getJSONObject().has(key.name())) {
        cache[index] = key.extractValue(this);
        cacheState[index] = STATE_CACHED_VALUE;
      } else {
        cacheState[index] = STATE_CACHED_NO_VALUE;
      }
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    if (jsonObject == null) {
      jsonObject = new org.json.JSONObject();
    }
    return jsonObject;
  }


  @Override
  public void validate() {
    java.lang.String address1 = getAddress1();
    if (address1 != null && address1.length() > 255) { throw new IllegalArgumentException("Maximum string length exceeded for 'address1'");}

    java.lang.String address2 = getAddress2();
    if (address2 != null && address2.length() > 255) { throw new IllegalArgumentException("Maximum string length exceeded for 'address2'");}

    java.lang.String address3 = getAddress3();
    if (address3 != null && address3.length() > 255) { throw new IllegalArgumentException("Maximum string length exceeded for 'address3'");}

    java.lang.String city = getCity();
    if (city != null && city.length() > 127) { throw new IllegalArgumentException("Maximum string length exceeded for 'city'");}

    java.lang.String country = getCountry();
    if (country != null && country.length() > 127) { throw new IllegalArgumentException("Maximum string length exceeded for 'country'");}

    java.lang.String phoneNumber = getPhoneNumber();
    if (phoneNumber != null && phoneNumber.length() > 21) { throw new IllegalArgumentException("Maximum string length exceeded for 'phoneNumber'");}

    java.lang.String state = getState();
    if (state != null && state.length() > 127) { throw new IllegalArgumentException("Maximum string length exceeded for 'state'");}

    java.lang.String zip = getZip();
    if (zip != null && zip.length() > 127) { throw new IllegalArgumentException("Maximum string length exceeded for 'zip'");}
  }



  private java.lang.String extractAddress1() {
    return getJSONObject().isNull("address1") ? null :
      getJSONObject().optString("address1");
  }


  private java.lang.String extractAddress2() {
    return getJSONObject().isNull("address2") ? null :
      getJSONObject().optString("address2");
  }


  private java.lang.String extractAddress3() {
    return getJSONObject().isNull("address3") ? null :
      getJSONObject().optString("address3");
  }


  private java.lang.String extractCity() {
    return getJSONObject().isNull("city") ? null :
      getJSONObject().optString("city");
  }


  private java.lang.String extractCountry() {
    return getJSONObject().isNull("country") ? null :
      getJSONObject().optString("country");
  }


  private java.lang.String extractPhoneNumber() {
    return getJSONObject().isNull("phoneNumber") ? null :
      getJSONObject().optString("phoneNumber");
  }


  private java.lang.String extractState() {
    return getJSONObject().isNull("state") ? null :
      getJSONObject().optString("state");
  }


  private java.lang.String extractZip() {
    return getJSONObject().isNull("zip") ? null :
      getJSONObject().optString("zip");
  }


  /** Checks whether the 'address1' field is set and is not null */
  public boolean isNotNullAddress1() {
    return cacheValueIsNotNull(CacheKey.address1);
  }

  /** Checks whether the 'address2' field is set and is not null */
  public boolean isNotNullAddress2() {
    return cacheValueIsNotNull(CacheKey.address2);
  }

  /** Checks whether the 'address3' field is set and is not null */
  public boolean isNotNullAddress3() {
    return cacheValueIsNotNull(CacheKey.address3);
  }

  /** Checks whether the 'city' field is set and is not null */
  public boolean isNotNullCity() {
    return cacheValueIsNotNull(CacheKey.city);
  }

  /** Checks whether the 'country' field is set and is not null */
  public boolean isNotNullCountry() {
    return cacheValueIsNotNull(CacheKey.country);
  }

  /** Checks whether the 'phoneNumber' field is set and is not null */
  public boolean isNotNullPhoneNumber() {
    return cacheValueIsNotNull(CacheKey.phoneNumber);
  }

  /** Checks whether the 'state' field is set and is not null */
  public boolean isNotNullState() {
    return cacheValueIsNotNull(CacheKey.state);
  }

  /** Checks whether the 'zip' field is set and is not null */
  public boolean isNotNullZip() {
    return cacheValueIsNotNull(CacheKey.zip);
  }


  /** Checks whether the 'address1' field has been set, however the value could be null */
  public boolean hasAddress1() {
    return cacheHasKey(CacheKey.address1);
  }

  /** Checks whether the 'address2' field has been set, however the value could be null */
  public boolean hasAddress2() {
    return cacheHasKey(CacheKey.address2);
  }

  /** Checks whether the 'address3' field has been set, however the value could be null */
  public boolean hasAddress3() {
    return cacheHasKey(CacheKey.address3);
  }

  /** Checks whether the 'city' field has been set, however the value could be null */
  public boolean hasCity() {
    return cacheHasKey(CacheKey.city);
  }

  /** Checks whether the 'country' field has been set, however the value could be null */
  public boolean hasCountry() {
    return cacheHasKey(CacheKey.country);
  }

  /** Checks whether the 'phoneNumber' field has been set, however the value could be null */
  public boolean hasPhoneNumber() {
    return cacheHasKey(CacheKey.phoneNumber);
  }

  /** Checks whether the 'state' field has been set, however the value could be null */
  public boolean hasState() {
    return cacheHasKey(CacheKey.state);
  }

  /** Checks whether the 'zip' field has been set, however the value could be null */
  public boolean hasZip() {
    return cacheHasKey(CacheKey.zip);
  }


  /**
   * Sets the field 'address1'.
   */
  public Address setAddress1(java.lang.String address1) {
    logChange("address1");

    try {
      getJSONObject().put("address1", address1 == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(address1));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.address1);
    return this;
  }

  /**
   * Sets the field 'address2'.
   */
  public Address setAddress2(java.lang.String address2) {
    logChange("address2");

    try {
      getJSONObject().put("address2", address2 == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(address2));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.address2);
    return this;
  }

  /**
   * Sets the field 'address3'.
   */
  public Address setAddress3(java.lang.String address3) {
    logChange("address3");

    try {
      getJSONObject().put("address3", address3 == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(address3));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.address3);
    return this;
  }

  /**
   * Sets the field 'city'.
   */
  public Address setCity(java.lang.String city) {
    logChange("city");

    try {
      getJSONObject().put("city", city == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(city));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.city);
    return this;
  }

  /**
   * Sets the field 'country'.
   */
  public Address setCountry(java.lang.String country) {
    logChange("country");

    try {
      getJSONObject().put("country", country == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(country));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.country);
    return this;
  }

  /**
   * Sets the field 'phoneNumber'.
   */
  public Address setPhoneNumber(java.lang.String phoneNumber) {
    logChange("phoneNumber");

    try {
      getJSONObject().put("phoneNumber", phoneNumber == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(phoneNumber));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.phoneNumber);
    return this;
  }

  /**
   * Sets the field 'state'.
   */
  public Address setState(java.lang.String state) {
    logChange("state");

    try {
      getJSONObject().put("state", state == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(state));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.state);
    return this;
  }

  /**
   * Sets the field 'zip'.
   */
  public Address setZip(java.lang.String zip) {
    logChange("zip");

    try {
      getJSONObject().put("zip", zip == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(zip));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.zip);
    return this;
  }


  /** Clears the 'address1' field, the 'has' method for this field will now return false */
  public void clearAddress1() {
    unlogChange("address1");
    getJSONObject().remove("address1");
    cacheRemoveValue(CacheKey.address1);
  }

  /** Clears the 'address2' field, the 'has' method for this field will now return false */
  public void clearAddress2() {
    unlogChange("address2");
    getJSONObject().remove("address2");
    cacheRemoveValue(CacheKey.address2);
  }

  /** Clears the 'address3' field, the 'has' method for this field will now return false */
  public void clearAddress3() {
    unlogChange("address3");
    getJSONObject().remove("address3");
    cacheRemoveValue(CacheKey.address3);
  }

  /** Clears the 'city' field, the 'has' method for this field will now return false */
  public void clearCity() {
    unlogChange("city");
    getJSONObject().remove("city");
    cacheRemoveValue(CacheKey.city);
  }

  /** Clears the 'country' field, the 'has' method for this field will now return false */
  public void clearCountry() {
    unlogChange("country");
    getJSONObject().remove("country");
    cacheRemoveValue(CacheKey.country);
  }

  /** Clears the 'phoneNumber' field, the 'has' method for this field will now return false */
  public void clearPhoneNumber() {
    unlogChange("phoneNumber");
    getJSONObject().remove("phoneNumber");
    cacheRemoveValue(CacheKey.phoneNumber);
  }

  /** Clears the 'state' field, the 'has' method for this field will now return false */
  public void clearState() {
    unlogChange("state");
    getJSONObject().remove("state");
    cacheRemoveValue(CacheKey.state);
  }

  /** Clears the 'zip' field, the 'has' method for this field will now return false */
  public void clearZip() {
    unlogChange("zip");
    getJSONObject().remove("zip");
    cacheRemoveValue(CacheKey.zip);
  }


  private void logChange(java.lang.String field) {
    if (changeLog == null) {
      changeLog = new android.os.Bundle();
    }
    changeLog.putString(field, null);
  }

  private void unlogChange(java.lang.String field) {
    if (changeLog != null) {
      changeLog.remove(field);
    }
  }

  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return changeLog != null;
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    changeLog = null;
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public Address copyChanges() {
    Address copy = new Address();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Address src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new Address(src).getJSONObject();
        org.json.JSONObject dstObj = getJSONObject();
        for (java.lang.String field : src.changeLog.keySet()) {
          dstObj.put(field, srcObj.get(field));
          logChange(field);
        }
      } catch (org.json.JSONException e) {
        throw new java.lang.IllegalArgumentException(e);
      }
    }
  }


  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    if (bundle == null) {
      bundle = new android.os.Bundle();
    }
    return bundle;
  }

  @Override
  public String toString() {
    String json = getJSONObject().toString();

    if (bundle != null) {
      bundle.isEmpty(); // Triggers unparcel
    }

    if (changeLog != null) {
      changeLog.isEmpty(); // Triggers unparcel
    }

    return "Address{" +
        "json='" + json + "'" +
        ", bundle=" + bundle +
        ", changeLog=" + changeLog +
        '}';
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
	  com.clover.sdk.v3.JsonParcelHelper.wrap(getJSONObject()).writeToParcel(dest, 0);
    dest.writeBundle(bundle);
    dest.writeBundle(changeLog);
  }

  public static final android.os.Parcelable.Creator<Address> CREATOR = new android.os.Parcelable.Creator<Address>() {
    @Override
    public Address createFromParcel(android.os.Parcel in) {
      Address instance = new Address(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public Address[] newArray(int size) {
      return new Address[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Address> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Address>() {
    @Override
    public Address create(org.json.JSONObject jsonObject) {
      return new Address(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ADDRESS1_IS_REQUIRED = false;
    public static final long ADDRESS1_MAX_LEN = 255;

    public static final boolean ADDRESS2_IS_REQUIRED = false;
    public static final long ADDRESS2_MAX_LEN = 255;

    public static final boolean ADDRESS3_IS_REQUIRED = false;
    public static final long ADDRESS3_MAX_LEN = 255;

    public static final boolean CITY_IS_REQUIRED = false;
    public static final long CITY_MAX_LEN = 127;

    public static final boolean COUNTRY_IS_REQUIRED = false;
    public static final long COUNTRY_MAX_LEN = 127;

    public static final boolean PHONENUMBER_IS_REQUIRED = false;
    public static final long PHONENUMBER_MAX_LEN = 21;

    public static final boolean STATE_IS_REQUIRED = false;
    public static final long STATE_MAX_LEN = 127;

    public static final boolean ZIP_IS_REQUIRED = false;
    public static final long ZIP_MAX_LEN = 127;

  }

}

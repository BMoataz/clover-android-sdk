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

package com.clover.sdk.v3.inventory;

@SuppressWarnings("all")
public final class Option implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {


  private enum CacheKey {
    id {
      @Override
      public Object extractValue(Option instance) {
        return instance.extractId();
      }
    },
    name {
      @Override
      public Object extractValue(Option instance) {
        return instance.extractName();
      }
    },
    attribute {
      @Override
      public Object extractValue(Option instance) {
        return instance.extractAttribute();
      }
    },
    ;

    public abstract Object extractValue(Option instance);
  }

  private String jsonString = null;
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
  public Option() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Option(String json) {
    this.jsonString = json;
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public Option(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Option(Option src) {
    if (src.jsonString != null) {
      this.jsonString = src.jsonString;
    } else {
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
    try {
      if (jsonObject == null) {
        if (jsonString != null) {
          jsonObject = new org.json.JSONObject(jsonString);
          jsonString = null; // null this so it will be recreated if jsonObject is modified
        } else {
          jsonObject = new org.json.JSONObject();
        }
      }
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }
    return jsonObject;
  }


  @Override
  public void validate() {
    java.lang.String id = getId();
    if (id != null && id.length() > 13) throw new IllegalArgumentException("Maximum string length exceeded for 'id'");

    java.lang.String name = getName();
    if (name == null) throw new java.lang.IllegalArgumentException("'name' is required to be non-null");
    if (name != null && name.length() > 255) throw new IllegalArgumentException("Maximum string length exceeded for 'name'");
  }


  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return cacheGet(CacheKey.id);
  }

  private java.lang.String extractId() {
    return getJSONObject().isNull("id") ? null :
      getJSONObject().optString("id");
  }

  /**
   * Name of the option
   */
  public java.lang.String getName() {
    return cacheGet(CacheKey.name);
  }

  private java.lang.String extractName() {
    return getJSONObject().isNull("name") ? null :
      getJSONObject().optString("name");
  }

  /**
   *
   * The returned object is not a copy so changes to it will be reflected in this instance and vice-versa.
   */
  public com.clover.sdk.v3.base.Reference getAttribute() {
    return cacheGet(CacheKey.attribute);
  }

  private com.clover.sdk.v3.base.Reference extractAttribute() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("attribute");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.base.Reference(getJSONObject().optJSONObject("attribute"));
    }
    return null;
  }


  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'attribute' field is set and is not null */
  public boolean isNotNullAttribute() {
    return cacheValueIsNotNull(CacheKey.attribute);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'attribute' field has been set, however the value could be null */
  public boolean hasAttribute() {
    return cacheHasKey(CacheKey.attribute);
  }


  /**
   * Sets the field 'id'.
   */
  public Option setId(java.lang.String id) {
    logChange("id");

    try {
      getJSONObject().put("id", id == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(id));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.id);
    return this;
  }

  /**
   * Sets the field 'name'.
   */
  public Option setName(java.lang.String name) {
    logChange("name");

    try {
      getJSONObject().put("name", name == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(name));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.name);
    return this;
  }

  /**
   * Sets the field 'attribute'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Option setAttribute(com.clover.sdk.v3.base.Reference attribute) {
    logChange("attribute");

    try {
      getJSONObject().put("attribute",
          attribute == null ? org.json.JSONObject.NULL : attribute.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.attribute);
    return this;
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    unlogChange("id");
    getJSONObject().remove("id");
    cacheRemoveValue(CacheKey.id);
  }

  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    unlogChange("name");
    getJSONObject().remove("name");
    cacheRemoveValue(CacheKey.name);
  }

  /** Clears the 'attribute' field, the 'has' method for this field will now return false */
  public void clearAttribute() {
    unlogChange("attribute");
    getJSONObject().remove("attribute");
    cacheRemoveValue(CacheKey.attribute);
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
  public Option copyChanges() {
    Option copy = new Option();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Option src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new Option(src).getJSONObject();
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
    String json = jsonString != null ? jsonString : getJSONObject().toString();

    if (bundle != null) {
      bundle.isEmpty(); // Triggers unparcel
    }

    if (changeLog != null) {
      changeLog.isEmpty(); // Triggers unparcel
    }

    return "Option{" +
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

  public static final android.os.Parcelable.Creator<Option> CREATOR = new android.os.Parcelable.Creator<Option>() {
    @Override
    public Option createFromParcel(android.os.Parcel in) {
      Option instance = new Option(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public Option[] newArray(int size) {
      return new Option[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Option> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Option>() {
    @Override
    public Option create(org.json.JSONObject jsonObject) {
      return new Option(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean NAME_IS_REQUIRED = true;
    public static final long NAME_MAX_LEN = 255;

    public static final boolean ATTRIBUTE_IS_REQUIRED = false;

  }

}

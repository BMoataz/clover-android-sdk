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

package com.clover.sdk.v3.merchant;

@SuppressWarnings("all")
public final class TipSuggestion implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {


  private enum CacheKey {
    id {
      @Override
      public Object extractValue(TipSuggestion instance) {
        return instance.extractId();
      }
    },
    name {
      @Override
      public Object extractValue(TipSuggestion instance) {
        return instance.extractName();
      }
    },
    percentage {
      @Override
      public Object extractValue(TipSuggestion instance) {
        return instance.extractPercentage();
      }
    },
    isEnabled {
      @Override
      public Object extractValue(TipSuggestion instance) {
        return instance.extractIsEnabled();
      }
    },
    ;

    public abstract Object extractValue(TipSuggestion instance);
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
  public TipSuggestion() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public TipSuggestion(String json) {
    this.jsonString = json;
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public TipSuggestion(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public TipSuggestion(TipSuggestion src) {
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
    if (name != null && name.length() > 24) throw new IllegalArgumentException("Maximum string length exceeded for 'name'");
  }


  /**
   */
  public java.lang.String getId() {
    return cacheGet(CacheKey.id);
  }

  private java.lang.String extractId() {
    return getJSONObject().isNull("id") ? null :
      getJSONObject().optString("id");
  }

  /**
   * Name of the tip
   */
  public java.lang.String getName() {
    return cacheGet(CacheKey.name);
  }

  private java.lang.String extractName() {
    return getJSONObject().isNull("name") ? null :
      getJSONObject().optString("name");
  }

  /**
   * Suggested tip percentage
   */
  public java.lang.Long getPercentage() {
    return cacheGet(CacheKey.percentage);
  }

  private java.lang.Long extractPercentage() {
    return getJSONObject().isNull("percentage") ? null :
      getJSONObject().optLong("percentage");
  }

  /**
   */
  public java.lang.Boolean getIsEnabled() {
    return cacheGet(CacheKey.isEnabled);
  }

  private java.lang.Boolean extractIsEnabled() {
    return getJSONObject().isNull("isEnabled") ? null :
      getJSONObject().optBoolean("isEnabled");
  }


  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'percentage' field is set and is not null */
  public boolean isNotNullPercentage() {
    return cacheValueIsNotNull(CacheKey.percentage);
  }

  /** Checks whether the 'isEnabled' field is set and is not null */
  public boolean isNotNullIsEnabled() {
    return cacheValueIsNotNull(CacheKey.isEnabled);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'percentage' field has been set, however the value could be null */
  public boolean hasPercentage() {
    return cacheHasKey(CacheKey.percentage);
  }

  /** Checks whether the 'isEnabled' field has been set, however the value could be null */
  public boolean hasIsEnabled() {
    return cacheHasKey(CacheKey.isEnabled);
  }


  /**
   * Sets the field 'id'.
   */
  public TipSuggestion setId(java.lang.String id) {
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
  public TipSuggestion setName(java.lang.String name) {
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
   * Sets the field 'percentage'.
   */
  public TipSuggestion setPercentage(java.lang.Long percentage) {
    logChange("percentage");

    try {
      getJSONObject().put("percentage", percentage == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(percentage));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.percentage);
    return this;
  }

  /**
   * Sets the field 'isEnabled'.
   */
  public TipSuggestion setIsEnabled(java.lang.Boolean isEnabled) {
    logChange("isEnabled");

    try {
      getJSONObject().put("isEnabled", isEnabled == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(isEnabled));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.isEnabled);
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

  /** Clears the 'percentage' field, the 'has' method for this field will now return false */
  public void clearPercentage() {
    unlogChange("percentage");
    getJSONObject().remove("percentage");
    cacheRemoveValue(CacheKey.percentage);
  }

  /** Clears the 'isEnabled' field, the 'has' method for this field will now return false */
  public void clearIsEnabled() {
    unlogChange("isEnabled");
    getJSONObject().remove("isEnabled");
    cacheRemoveValue(CacheKey.isEnabled);
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
  public TipSuggestion copyChanges() {
    TipSuggestion copy = new TipSuggestion();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(TipSuggestion src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new TipSuggestion(src).getJSONObject();
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

    return "TipSuggestion{" +
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

  public static final android.os.Parcelable.Creator<TipSuggestion> CREATOR = new android.os.Parcelable.Creator<TipSuggestion>() {
    @Override
    public TipSuggestion createFromParcel(android.os.Parcel in) {
      TipSuggestion instance = new TipSuggestion(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public TipSuggestion[] newArray(int size) {
      return new TipSuggestion[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<TipSuggestion> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<TipSuggestion>() {
    @Override
    public TipSuggestion create(org.json.JSONObject jsonObject) {
      return new TipSuggestion(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean NAME_IS_REQUIRED = true;
    public static final long NAME_MAX_LEN = 24;

    public static final boolean PERCENTAGE_IS_REQUIRED = false;

    public static final boolean ISENABLED_IS_REQUIRED = false;

  }

}

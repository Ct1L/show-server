/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package one.show.manage.thrift.view;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VersionControlView implements org.apache.thrift.TBase<VersionControlView, VersionControlView._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("VersionControlView");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField COERCION_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("coercionVersion", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ADVICE_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("adviceVersion", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DOWNLOAD_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("downloadUrl", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField AGENT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("agentType", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("msg", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new VersionControlViewStandardSchemeFactory());
    schemes.put(TupleScheme.class, new VersionControlViewTupleSchemeFactory());
  }

  public long id; // required
  public String coercionVersion; // required
  public String adviceVersion; // required
  public String downloadUrl; // required
  public int agentType; // required
  public String title; // required
  public String msg; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    COERCION_VERSION((short)2, "coercionVersion"),
    ADVICE_VERSION((short)3, "adviceVersion"),
    DOWNLOAD_URL((short)4, "downloadUrl"),
    AGENT_TYPE((short)5, "agentType"),
    TITLE((short)6, "title"),
    MSG((short)7, "msg");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // COERCION_VERSION
          return COERCION_VERSION;
        case 3: // ADVICE_VERSION
          return ADVICE_VERSION;
        case 4: // DOWNLOAD_URL
          return DOWNLOAD_URL;
        case 5: // AGENT_TYPE
          return AGENT_TYPE;
        case 6: // TITLE
          return TITLE;
        case 7: // MSG
          return MSG;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private static final int __AGENTTYPE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.COERCION_VERSION, new org.apache.thrift.meta_data.FieldMetaData("coercionVersion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ADVICE_VERSION, new org.apache.thrift.meta_data.FieldMetaData("adviceVersion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DOWNLOAD_URL, new org.apache.thrift.meta_data.FieldMetaData("downloadUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AGENT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("agentType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MSG, new org.apache.thrift.meta_data.FieldMetaData("msg", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(VersionControlView.class, metaDataMap);
  }

  public VersionControlView() {
  }

  public VersionControlView(
    long id,
    String coercionVersion,
    String adviceVersion,
    String downloadUrl,
    int agentType,
    String title,
    String msg)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.coercionVersion = coercionVersion;
    this.adviceVersion = adviceVersion;
    this.downloadUrl = downloadUrl;
    this.agentType = agentType;
    setAgentTypeIsSet(true);
    this.title = title;
    this.msg = msg;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public VersionControlView(VersionControlView other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetCoercionVersion()) {
      this.coercionVersion = other.coercionVersion;
    }
    if (other.isSetAdviceVersion()) {
      this.adviceVersion = other.adviceVersion;
    }
    if (other.isSetDownloadUrl()) {
      this.downloadUrl = other.downloadUrl;
    }
    this.agentType = other.agentType;
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetMsg()) {
      this.msg = other.msg;
    }
  }

  public VersionControlView deepCopy() {
    return new VersionControlView(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.coercionVersion = null;
    this.adviceVersion = null;
    this.downloadUrl = null;
    setAgentTypeIsSet(false);
    this.agentType = 0;
    this.title = null;
    this.msg = null;
  }

  public long getId() {
    return this.id;
  }

  public VersionControlView setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public String getCoercionVersion() {
    return this.coercionVersion;
  }

  public VersionControlView setCoercionVersion(String coercionVersion) {
    this.coercionVersion = coercionVersion;
    return this;
  }

  public void unsetCoercionVersion() {
    this.coercionVersion = null;
  }

  /** Returns true if field coercionVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetCoercionVersion() {
    return this.coercionVersion != null;
  }

  public void setCoercionVersionIsSet(boolean value) {
    if (!value) {
      this.coercionVersion = null;
    }
  }

  public String getAdviceVersion() {
    return this.adviceVersion;
  }

  public VersionControlView setAdviceVersion(String adviceVersion) {
    this.adviceVersion = adviceVersion;
    return this;
  }

  public void unsetAdviceVersion() {
    this.adviceVersion = null;
  }

  /** Returns true if field adviceVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetAdviceVersion() {
    return this.adviceVersion != null;
  }

  public void setAdviceVersionIsSet(boolean value) {
    if (!value) {
      this.adviceVersion = null;
    }
  }

  public String getDownloadUrl() {
    return this.downloadUrl;
  }

  public VersionControlView setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  public void unsetDownloadUrl() {
    this.downloadUrl = null;
  }

  /** Returns true if field downloadUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetDownloadUrl() {
    return this.downloadUrl != null;
  }

  public void setDownloadUrlIsSet(boolean value) {
    if (!value) {
      this.downloadUrl = null;
    }
  }

  public int getAgentType() {
    return this.agentType;
  }

  public VersionControlView setAgentType(int agentType) {
    this.agentType = agentType;
    setAgentTypeIsSet(true);
    return this;
  }

  public void unsetAgentType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AGENTTYPE_ISSET_ID);
  }

  /** Returns true if field agentType is set (has been assigned a value) and false otherwise */
  public boolean isSetAgentType() {
    return EncodingUtils.testBit(__isset_bitfield, __AGENTTYPE_ISSET_ID);
  }

  public void setAgentTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AGENTTYPE_ISSET_ID, value);
  }

  public String getTitle() {
    return this.title;
  }

  public VersionControlView setTitle(String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public String getMsg() {
    return this.msg;
  }

  public VersionControlView setMsg(String msg) {
    this.msg = msg;
    return this;
  }

  public void unsetMsg() {
    this.msg = null;
  }

  /** Returns true if field msg is set (has been assigned a value) and false otherwise */
  public boolean isSetMsg() {
    return this.msg != null;
  }

  public void setMsgIsSet(boolean value) {
    if (!value) {
      this.msg = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Long)value);
      }
      break;

    case COERCION_VERSION:
      if (value == null) {
        unsetCoercionVersion();
      } else {
        setCoercionVersion((String)value);
      }
      break;

    case ADVICE_VERSION:
      if (value == null) {
        unsetAdviceVersion();
      } else {
        setAdviceVersion((String)value);
      }
      break;

    case DOWNLOAD_URL:
      if (value == null) {
        unsetDownloadUrl();
      } else {
        setDownloadUrl((String)value);
      }
      break;

    case AGENT_TYPE:
      if (value == null) {
        unsetAgentType();
      } else {
        setAgentType((Integer)value);
      }
      break;

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case MSG:
      if (value == null) {
        unsetMsg();
      } else {
        setMsg((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Long.valueOf(getId());

    case COERCION_VERSION:
      return getCoercionVersion();

    case ADVICE_VERSION:
      return getAdviceVersion();

    case DOWNLOAD_URL:
      return getDownloadUrl();

    case AGENT_TYPE:
      return Integer.valueOf(getAgentType());

    case TITLE:
      return getTitle();

    case MSG:
      return getMsg();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case COERCION_VERSION:
      return isSetCoercionVersion();
    case ADVICE_VERSION:
      return isSetAdviceVersion();
    case DOWNLOAD_URL:
      return isSetDownloadUrl();
    case AGENT_TYPE:
      return isSetAgentType();
    case TITLE:
      return isSetTitle();
    case MSG:
      return isSetMsg();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof VersionControlView)
      return this.equals((VersionControlView)that);
    return false;
  }

  public boolean equals(VersionControlView that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_coercionVersion = true && this.isSetCoercionVersion();
    boolean that_present_coercionVersion = true && that.isSetCoercionVersion();
    if (this_present_coercionVersion || that_present_coercionVersion) {
      if (!(this_present_coercionVersion && that_present_coercionVersion))
        return false;
      if (!this.coercionVersion.equals(that.coercionVersion))
        return false;
    }

    boolean this_present_adviceVersion = true && this.isSetAdviceVersion();
    boolean that_present_adviceVersion = true && that.isSetAdviceVersion();
    if (this_present_adviceVersion || that_present_adviceVersion) {
      if (!(this_present_adviceVersion && that_present_adviceVersion))
        return false;
      if (!this.adviceVersion.equals(that.adviceVersion))
        return false;
    }

    boolean this_present_downloadUrl = true && this.isSetDownloadUrl();
    boolean that_present_downloadUrl = true && that.isSetDownloadUrl();
    if (this_present_downloadUrl || that_present_downloadUrl) {
      if (!(this_present_downloadUrl && that_present_downloadUrl))
        return false;
      if (!this.downloadUrl.equals(that.downloadUrl))
        return false;
    }

    boolean this_present_agentType = true;
    boolean that_present_agentType = true;
    if (this_present_agentType || that_present_agentType) {
      if (!(this_present_agentType && that_present_agentType))
        return false;
      if (this.agentType != that.agentType)
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_msg = true && this.isSetMsg();
    boolean that_present_msg = true && that.isSetMsg();
    if (this_present_msg || that_present_msg) {
      if (!(this_present_msg && that_present_msg))
        return false;
      if (!this.msg.equals(that.msg))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(VersionControlView other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    VersionControlView typedOther = (VersionControlView)other;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCoercionVersion()).compareTo(typedOther.isSetCoercionVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCoercionVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.coercionVersion, typedOther.coercionVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdviceVersion()).compareTo(typedOther.isSetAdviceVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdviceVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.adviceVersion, typedOther.adviceVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDownloadUrl()).compareTo(typedOther.isSetDownloadUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDownloadUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.downloadUrl, typedOther.downloadUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAgentType()).compareTo(typedOther.isSetAgentType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAgentType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.agentType, typedOther.agentType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(typedOther.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, typedOther.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMsg()).compareTo(typedOther.isSetMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.msg, typedOther.msg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("VersionControlView(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("coercionVersion:");
    if (this.coercionVersion == null) {
      sb.append("null");
    } else {
      sb.append(this.coercionVersion);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("adviceVersion:");
    if (this.adviceVersion == null) {
      sb.append("null");
    } else {
      sb.append(this.adviceVersion);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("downloadUrl:");
    if (this.downloadUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.downloadUrl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("agentType:");
    sb.append(this.agentType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("title:");
    if (this.title == null) {
      sb.append("null");
    } else {
      sb.append(this.title);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("msg:");
    if (this.msg == null) {
      sb.append("null");
    } else {
      sb.append(this.msg);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class VersionControlViewStandardSchemeFactory implements SchemeFactory {
    public VersionControlViewStandardScheme getScheme() {
      return new VersionControlViewStandardScheme();
    }
  }

  private static class VersionControlViewStandardScheme extends StandardScheme<VersionControlView> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, VersionControlView struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COERCION_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.coercionVersion = iprot.readString();
              struct.setCoercionVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ADVICE_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.adviceVersion = iprot.readString();
              struct.setAdviceVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DOWNLOAD_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.downloadUrl = iprot.readString();
              struct.setDownloadUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // AGENT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.agentType = iprot.readI32();
              struct.setAgentTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.msg = iprot.readString();
              struct.setMsgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, VersionControlView struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI64(struct.id);
      oprot.writeFieldEnd();
      if (struct.coercionVersion != null) {
        oprot.writeFieldBegin(COERCION_VERSION_FIELD_DESC);
        oprot.writeString(struct.coercionVersion);
        oprot.writeFieldEnd();
      }
      if (struct.adviceVersion != null) {
        oprot.writeFieldBegin(ADVICE_VERSION_FIELD_DESC);
        oprot.writeString(struct.adviceVersion);
        oprot.writeFieldEnd();
      }
      if (struct.downloadUrl != null) {
        oprot.writeFieldBegin(DOWNLOAD_URL_FIELD_DESC);
        oprot.writeString(struct.downloadUrl);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(AGENT_TYPE_FIELD_DESC);
      oprot.writeI32(struct.agentType);
      oprot.writeFieldEnd();
      if (struct.title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(struct.title);
        oprot.writeFieldEnd();
      }
      if (struct.msg != null) {
        oprot.writeFieldBegin(MSG_FIELD_DESC);
        oprot.writeString(struct.msg);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class VersionControlViewTupleSchemeFactory implements SchemeFactory {
    public VersionControlViewTupleScheme getScheme() {
      return new VersionControlViewTupleScheme();
    }
  }

  private static class VersionControlViewTupleScheme extends TupleScheme<VersionControlView> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, VersionControlView struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetCoercionVersion()) {
        optionals.set(1);
      }
      if (struct.isSetAdviceVersion()) {
        optionals.set(2);
      }
      if (struct.isSetDownloadUrl()) {
        optionals.set(3);
      }
      if (struct.isSetAgentType()) {
        optionals.set(4);
      }
      if (struct.isSetTitle()) {
        optionals.set(5);
      }
      if (struct.isSetMsg()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetCoercionVersion()) {
        oprot.writeString(struct.coercionVersion);
      }
      if (struct.isSetAdviceVersion()) {
        oprot.writeString(struct.adviceVersion);
      }
      if (struct.isSetDownloadUrl()) {
        oprot.writeString(struct.downloadUrl);
      }
      if (struct.isSetAgentType()) {
        oprot.writeI32(struct.agentType);
      }
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetMsg()) {
        oprot.writeString(struct.msg);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, VersionControlView struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.coercionVersion = iprot.readString();
        struct.setCoercionVersionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.adviceVersion = iprot.readString();
        struct.setAdviceVersionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.downloadUrl = iprot.readString();
        struct.setDownloadUrlIsSet(true);
      }
      if (incoming.get(4)) {
        struct.agentType = iprot.readI32();
        struct.setAgentTypeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(6)) {
        struct.msg = iprot.readString();
        struct.setMsgIsSet(true);
      }
    }
  }

}


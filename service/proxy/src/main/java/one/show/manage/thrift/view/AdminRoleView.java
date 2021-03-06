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

public class AdminRoleView implements org.apache.thrift.TBase<AdminRoleView, AdminRoleView._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AdminRoleView");

  private static final org.apache.thrift.protocol.TField ROLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("roleId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ROLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("roleName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ROLE_DESC_FIELD_DESC = new org.apache.thrift.protocol.TField("roleDesc", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createTime", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField FUNCS_FIELD_DESC = new org.apache.thrift.protocol.TField("funcs", org.apache.thrift.protocol.TType.LIST, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AdminRoleViewStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AdminRoleViewTupleSchemeFactory());
  }

  public int roleId; // required
  public String roleName; // required
  public String roleDesc; // required
  public int status; // required
  public int createTime; // required
  public List<String> funcs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROLE_ID((short)1, "roleId"),
    ROLE_NAME((short)2, "roleName"),
    ROLE_DESC((short)3, "roleDesc"),
    STATUS((short)4, "status"),
    CREATE_TIME((short)5, "createTime"),
    FUNCS((short)6, "funcs");

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
        case 1: // ROLE_ID
          return ROLE_ID;
        case 2: // ROLE_NAME
          return ROLE_NAME;
        case 3: // ROLE_DESC
          return ROLE_DESC;
        case 4: // STATUS
          return STATUS;
        case 5: // CREATE_TIME
          return CREATE_TIME;
        case 6: // FUNCS
          return FUNCS;
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
  private static final int __ROLEID_ISSET_ID = 0;
  private static final int __STATUS_ISSET_ID = 1;
  private static final int __CREATETIME_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROLE_ID, new org.apache.thrift.meta_data.FieldMetaData("roleId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ROLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("roleName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ROLE_DESC, new org.apache.thrift.meta_data.FieldMetaData("roleDesc", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("createTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FUNCS, new org.apache.thrift.meta_data.FieldMetaData("funcs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AdminRoleView.class, metaDataMap);
  }

  public AdminRoleView() {
  }

  public AdminRoleView(
    int roleId,
    String roleName,
    String roleDesc,
    int status,
    int createTime,
    List<String> funcs)
  {
    this();
    this.roleId = roleId;
    setRoleIdIsSet(true);
    this.roleName = roleName;
    this.roleDesc = roleDesc;
    this.status = status;
    setStatusIsSet(true);
    this.createTime = createTime;
    setCreateTimeIsSet(true);
    this.funcs = funcs;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AdminRoleView(AdminRoleView other) {
    __isset_bitfield = other.__isset_bitfield;
    this.roleId = other.roleId;
    if (other.isSetRoleName()) {
      this.roleName = other.roleName;
    }
    if (other.isSetRoleDesc()) {
      this.roleDesc = other.roleDesc;
    }
    this.status = other.status;
    this.createTime = other.createTime;
    if (other.isSetFuncs()) {
      List<String> __this__funcs = new ArrayList<String>();
      for (String other_element : other.funcs) {
        __this__funcs.add(other_element);
      }
      this.funcs = __this__funcs;
    }
  }

  public AdminRoleView deepCopy() {
    return new AdminRoleView(this);
  }

  @Override
  public void clear() {
    setRoleIdIsSet(false);
    this.roleId = 0;
    this.roleName = null;
    this.roleDesc = null;
    setStatusIsSet(false);
    this.status = 0;
    setCreateTimeIsSet(false);
    this.createTime = 0;
    this.funcs = null;
  }

  public int getRoleId() {
    return this.roleId;
  }

  public AdminRoleView setRoleId(int roleId) {
    this.roleId = roleId;
    setRoleIdIsSet(true);
    return this;
  }

  public void unsetRoleId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ROLEID_ISSET_ID);
  }

  /** Returns true if field roleId is set (has been assigned a value) and false otherwise */
  public boolean isSetRoleId() {
    return EncodingUtils.testBit(__isset_bitfield, __ROLEID_ISSET_ID);
  }

  public void setRoleIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ROLEID_ISSET_ID, value);
  }

  public String getRoleName() {
    return this.roleName;
  }

  public AdminRoleView setRoleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  public void unsetRoleName() {
    this.roleName = null;
  }

  /** Returns true if field roleName is set (has been assigned a value) and false otherwise */
  public boolean isSetRoleName() {
    return this.roleName != null;
  }

  public void setRoleNameIsSet(boolean value) {
    if (!value) {
      this.roleName = null;
    }
  }

  public String getRoleDesc() {
    return this.roleDesc;
  }

  public AdminRoleView setRoleDesc(String roleDesc) {
    this.roleDesc = roleDesc;
    return this;
  }

  public void unsetRoleDesc() {
    this.roleDesc = null;
  }

  /** Returns true if field roleDesc is set (has been assigned a value) and false otherwise */
  public boolean isSetRoleDesc() {
    return this.roleDesc != null;
  }

  public void setRoleDescIsSet(boolean value) {
    if (!value) {
      this.roleDesc = null;
    }
  }

  public int getStatus() {
    return this.status;
  }

  public AdminRoleView setStatus(int status) {
    this.status = status;
    setStatusIsSet(true);
    return this;
  }

  public void unsetStatus() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return EncodingUtils.testBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  public void setStatusIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STATUS_ISSET_ID, value);
  }

  public int getCreateTime() {
    return this.createTime;
  }

  public AdminRoleView setCreateTime(int createTime) {
    this.createTime = createTime;
    setCreateTimeIsSet(true);
    return this;
  }

  public void unsetCreateTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATETIME_ISSET_ID);
  }

  /** Returns true if field createTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreateTime() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATETIME_ISSET_ID);
  }

  public void setCreateTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATETIME_ISSET_ID, value);
  }

  public int getFuncsSize() {
    return (this.funcs == null) ? 0 : this.funcs.size();
  }

  public java.util.Iterator<String> getFuncsIterator() {
    return (this.funcs == null) ? null : this.funcs.iterator();
  }

  public void addToFuncs(String elem) {
    if (this.funcs == null) {
      this.funcs = new ArrayList<String>();
    }
    this.funcs.add(elem);
  }

  public List<String> getFuncs() {
    return this.funcs;
  }

  public AdminRoleView setFuncs(List<String> funcs) {
    this.funcs = funcs;
    return this;
  }

  public void unsetFuncs() {
    this.funcs = null;
  }

  /** Returns true if field funcs is set (has been assigned a value) and false otherwise */
  public boolean isSetFuncs() {
    return this.funcs != null;
  }

  public void setFuncsIsSet(boolean value) {
    if (!value) {
      this.funcs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROLE_ID:
      if (value == null) {
        unsetRoleId();
      } else {
        setRoleId((Integer)value);
      }
      break;

    case ROLE_NAME:
      if (value == null) {
        unsetRoleName();
      } else {
        setRoleName((String)value);
      }
      break;

    case ROLE_DESC:
      if (value == null) {
        unsetRoleDesc();
      } else {
        setRoleDesc((String)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((Integer)value);
      }
      break;

    case CREATE_TIME:
      if (value == null) {
        unsetCreateTime();
      } else {
        setCreateTime((Integer)value);
      }
      break;

    case FUNCS:
      if (value == null) {
        unsetFuncs();
      } else {
        setFuncs((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROLE_ID:
      return Integer.valueOf(getRoleId());

    case ROLE_NAME:
      return getRoleName();

    case ROLE_DESC:
      return getRoleDesc();

    case STATUS:
      return Integer.valueOf(getStatus());

    case CREATE_TIME:
      return Integer.valueOf(getCreateTime());

    case FUNCS:
      return getFuncs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROLE_ID:
      return isSetRoleId();
    case ROLE_NAME:
      return isSetRoleName();
    case ROLE_DESC:
      return isSetRoleDesc();
    case STATUS:
      return isSetStatus();
    case CREATE_TIME:
      return isSetCreateTime();
    case FUNCS:
      return isSetFuncs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AdminRoleView)
      return this.equals((AdminRoleView)that);
    return false;
  }

  public boolean equals(AdminRoleView that) {
    if (that == null)
      return false;

    boolean this_present_roleId = true;
    boolean that_present_roleId = true;
    if (this_present_roleId || that_present_roleId) {
      if (!(this_present_roleId && that_present_roleId))
        return false;
      if (this.roleId != that.roleId)
        return false;
    }

    boolean this_present_roleName = true && this.isSetRoleName();
    boolean that_present_roleName = true && that.isSetRoleName();
    if (this_present_roleName || that_present_roleName) {
      if (!(this_present_roleName && that_present_roleName))
        return false;
      if (!this.roleName.equals(that.roleName))
        return false;
    }

    boolean this_present_roleDesc = true && this.isSetRoleDesc();
    boolean that_present_roleDesc = true && that.isSetRoleDesc();
    if (this_present_roleDesc || that_present_roleDesc) {
      if (!(this_present_roleDesc && that_present_roleDesc))
        return false;
      if (!this.roleDesc.equals(that.roleDesc))
        return false;
    }

    boolean this_present_status = true;
    boolean that_present_status = true;
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (this.status != that.status)
        return false;
    }

    boolean this_present_createTime = true;
    boolean that_present_createTime = true;
    if (this_present_createTime || that_present_createTime) {
      if (!(this_present_createTime && that_present_createTime))
        return false;
      if (this.createTime != that.createTime)
        return false;
    }

    boolean this_present_funcs = true && this.isSetFuncs();
    boolean that_present_funcs = true && that.isSetFuncs();
    if (this_present_funcs || that_present_funcs) {
      if (!(this_present_funcs && that_present_funcs))
        return false;
      if (!this.funcs.equals(that.funcs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(AdminRoleView other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    AdminRoleView typedOther = (AdminRoleView)other;

    lastComparison = Boolean.valueOf(isSetRoleId()).compareTo(typedOther.isSetRoleId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoleId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roleId, typedOther.roleId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoleName()).compareTo(typedOther.isSetRoleName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoleName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roleName, typedOther.roleName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoleDesc()).compareTo(typedOther.isSetRoleDesc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoleDesc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roleDesc, typedOther.roleDesc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(typedOther.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreateTime()).compareTo(typedOther.isSetCreateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createTime, typedOther.createTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFuncs()).compareTo(typedOther.isSetFuncs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFuncs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.funcs, typedOther.funcs);
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
    StringBuilder sb = new StringBuilder("AdminRoleView(");
    boolean first = true;

    sb.append("roleId:");
    sb.append(this.roleId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("roleName:");
    if (this.roleName == null) {
      sb.append("null");
    } else {
      sb.append(this.roleName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("roleDesc:");
    if (this.roleDesc == null) {
      sb.append("null");
    } else {
      sb.append(this.roleDesc);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    sb.append(this.status);
    first = false;
    if (!first) sb.append(", ");
    sb.append("createTime:");
    sb.append(this.createTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("funcs:");
    if (this.funcs == null) {
      sb.append("null");
    } else {
      sb.append(this.funcs);
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

  private static class AdminRoleViewStandardSchemeFactory implements SchemeFactory {
    public AdminRoleViewStandardScheme getScheme() {
      return new AdminRoleViewStandardScheme();
    }
  }

  private static class AdminRoleViewStandardScheme extends StandardScheme<AdminRoleView> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AdminRoleView struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.roleId = iprot.readI32();
              struct.setRoleIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.roleName = iprot.readString();
              struct.setRoleNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ROLE_DESC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.roleDesc = iprot.readString();
              struct.setRoleDescIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = iprot.readI32();
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CREATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.createTime = iprot.readI32();
              struct.setCreateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // FUNCS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.funcs = new ArrayList<String>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  String _elem2; // required
                  _elem2 = iprot.readString();
                  struct.funcs.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setFuncsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AdminRoleView struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ROLE_ID_FIELD_DESC);
      oprot.writeI32(struct.roleId);
      oprot.writeFieldEnd();
      if (struct.roleName != null) {
        oprot.writeFieldBegin(ROLE_NAME_FIELD_DESC);
        oprot.writeString(struct.roleName);
        oprot.writeFieldEnd();
      }
      if (struct.roleDesc != null) {
        oprot.writeFieldBegin(ROLE_DESC_FIELD_DESC);
        oprot.writeString(struct.roleDesc);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeI32(struct.status);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CREATE_TIME_FIELD_DESC);
      oprot.writeI32(struct.createTime);
      oprot.writeFieldEnd();
      if (struct.funcs != null) {
        oprot.writeFieldBegin(FUNCS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.funcs.size()));
          for (String _iter3 : struct.funcs)
          {
            oprot.writeString(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AdminRoleViewTupleSchemeFactory implements SchemeFactory {
    public AdminRoleViewTupleScheme getScheme() {
      return new AdminRoleViewTupleScheme();
    }
  }

  private static class AdminRoleViewTupleScheme extends TupleScheme<AdminRoleView> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AdminRoleView struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRoleId()) {
        optionals.set(0);
      }
      if (struct.isSetRoleName()) {
        optionals.set(1);
      }
      if (struct.isSetRoleDesc()) {
        optionals.set(2);
      }
      if (struct.isSetStatus()) {
        optionals.set(3);
      }
      if (struct.isSetCreateTime()) {
        optionals.set(4);
      }
      if (struct.isSetFuncs()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetRoleId()) {
        oprot.writeI32(struct.roleId);
      }
      if (struct.isSetRoleName()) {
        oprot.writeString(struct.roleName);
      }
      if (struct.isSetRoleDesc()) {
        oprot.writeString(struct.roleDesc);
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status);
      }
      if (struct.isSetCreateTime()) {
        oprot.writeI32(struct.createTime);
      }
      if (struct.isSetFuncs()) {
        {
          oprot.writeI32(struct.funcs.size());
          for (String _iter4 : struct.funcs)
          {
            oprot.writeString(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AdminRoleView struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.roleId = iprot.readI32();
        struct.setRoleIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.roleName = iprot.readString();
        struct.setRoleNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.roleDesc = iprot.readString();
        struct.setRoleDescIsSet(true);
      }
      if (incoming.get(3)) {
        struct.status = iprot.readI32();
        struct.setStatusIsSet(true);
      }
      if (incoming.get(4)) {
        struct.createTime = iprot.readI32();
        struct.setCreateTimeIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.funcs = new ArrayList<String>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            String _elem7; // required
            _elem7 = iprot.readString();
            struct.funcs.add(_elem7);
          }
        }
        struct.setFuncsIsSet(true);
      }
    }
  }

}


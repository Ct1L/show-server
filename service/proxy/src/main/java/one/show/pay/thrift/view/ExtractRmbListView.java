/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package one.show.pay.thrift.view;

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

public class ExtractRmbListView implements org.apache.thrift.TBase<ExtractRmbListView, ExtractRmbListView._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExtractRmbListView");

  private static final org.apache.thrift.protocol.TField EXTRACT_RMB_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("extractRmbList", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("count", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ExtractRmbListViewStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ExtractRmbListViewTupleSchemeFactory());
  }

  public List<one.show.pay.thrift.view.ExtractRmbView> extractRmbList; // required
  public int count; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXTRACT_RMB_LIST((short)1, "extractRmbList"),
    COUNT((short)2, "count");

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
        case 1: // EXTRACT_RMB_LIST
          return EXTRACT_RMB_LIST;
        case 2: // COUNT
          return COUNT;
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
  private static final int __COUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXTRACT_RMB_LIST, new org.apache.thrift.meta_data.FieldMetaData("extractRmbList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, one.show.pay.thrift.view.ExtractRmbView.class))));
    tmpMap.put(_Fields.COUNT, new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExtractRmbListView.class, metaDataMap);
  }

  public ExtractRmbListView() {
  }

  public ExtractRmbListView(
    List<one.show.pay.thrift.view.ExtractRmbView> extractRmbList,
    int count)
  {
    this();
    this.extractRmbList = extractRmbList;
    this.count = count;
    setCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExtractRmbListView(ExtractRmbListView other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetExtractRmbList()) {
      List<one.show.pay.thrift.view.ExtractRmbView> __this__extractRmbList = new ArrayList<one.show.pay.thrift.view.ExtractRmbView>();
      for (one.show.pay.thrift.view.ExtractRmbView other_element : other.extractRmbList) {
        __this__extractRmbList.add(new one.show.pay.thrift.view.ExtractRmbView(other_element));
      }
      this.extractRmbList = __this__extractRmbList;
    }
    this.count = other.count;
  }

  public ExtractRmbListView deepCopy() {
    return new ExtractRmbListView(this);
  }

  @Override
  public void clear() {
    this.extractRmbList = null;
    setCountIsSet(false);
    this.count = 0;
  }

  public int getExtractRmbListSize() {
    return (this.extractRmbList == null) ? 0 : this.extractRmbList.size();
  }

  public java.util.Iterator<one.show.pay.thrift.view.ExtractRmbView> getExtractRmbListIterator() {
    return (this.extractRmbList == null) ? null : this.extractRmbList.iterator();
  }

  public void addToExtractRmbList(one.show.pay.thrift.view.ExtractRmbView elem) {
    if (this.extractRmbList == null) {
      this.extractRmbList = new ArrayList<one.show.pay.thrift.view.ExtractRmbView>();
    }
    this.extractRmbList.add(elem);
  }

  public List<one.show.pay.thrift.view.ExtractRmbView> getExtractRmbList() {
    return this.extractRmbList;
  }

  public ExtractRmbListView setExtractRmbList(List<one.show.pay.thrift.view.ExtractRmbView> extractRmbList) {
    this.extractRmbList = extractRmbList;
    return this;
  }

  public void unsetExtractRmbList() {
    this.extractRmbList = null;
  }

  /** Returns true if field extractRmbList is set (has been assigned a value) and false otherwise */
  public boolean isSetExtractRmbList() {
    return this.extractRmbList != null;
  }

  public void setExtractRmbListIsSet(boolean value) {
    if (!value) {
      this.extractRmbList = null;
    }
  }

  public int getCount() {
    return this.count;
  }

  public ExtractRmbListView setCount(int count) {
    this.count = count;
    setCountIsSet(true);
    return this;
  }

  public void unsetCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  /** Returns true if field count is set (has been assigned a value) and false otherwise */
  public boolean isSetCount() {
    return EncodingUtils.testBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  public void setCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXTRACT_RMB_LIST:
      if (value == null) {
        unsetExtractRmbList();
      } else {
        setExtractRmbList((List<one.show.pay.thrift.view.ExtractRmbView>)value);
      }
      break;

    case COUNT:
      if (value == null) {
        unsetCount();
      } else {
        setCount((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXTRACT_RMB_LIST:
      return getExtractRmbList();

    case COUNT:
      return Integer.valueOf(getCount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXTRACT_RMB_LIST:
      return isSetExtractRmbList();
    case COUNT:
      return isSetCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExtractRmbListView)
      return this.equals((ExtractRmbListView)that);
    return false;
  }

  public boolean equals(ExtractRmbListView that) {
    if (that == null)
      return false;

    boolean this_present_extractRmbList = true && this.isSetExtractRmbList();
    boolean that_present_extractRmbList = true && that.isSetExtractRmbList();
    if (this_present_extractRmbList || that_present_extractRmbList) {
      if (!(this_present_extractRmbList && that_present_extractRmbList))
        return false;
      if (!this.extractRmbList.equals(that.extractRmbList))
        return false;
    }

    boolean this_present_count = true;
    boolean that_present_count = true;
    if (this_present_count || that_present_count) {
      if (!(this_present_count && that_present_count))
        return false;
      if (this.count != that.count)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ExtractRmbListView other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ExtractRmbListView typedOther = (ExtractRmbListView)other;

    lastComparison = Boolean.valueOf(isSetExtractRmbList()).compareTo(typedOther.isSetExtractRmbList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtractRmbList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extractRmbList, typedOther.extractRmbList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCount()).compareTo(typedOther.isSetCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.count, typedOther.count);
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
    StringBuilder sb = new StringBuilder("ExtractRmbListView(");
    boolean first = true;

    sb.append("extractRmbList:");
    if (this.extractRmbList == null) {
      sb.append("null");
    } else {
      sb.append(this.extractRmbList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("count:");
    sb.append(this.count);
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

  private static class ExtractRmbListViewStandardSchemeFactory implements SchemeFactory {
    public ExtractRmbListViewStandardScheme getScheme() {
      return new ExtractRmbListViewStandardScheme();
    }
  }

  private static class ExtractRmbListViewStandardScheme extends StandardScheme<ExtractRmbListView> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExtractRmbListView struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXTRACT_RMB_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.extractRmbList = new ArrayList<one.show.pay.thrift.view.ExtractRmbView>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  one.show.pay.thrift.view.ExtractRmbView _elem2; // required
                  _elem2 = new one.show.pay.thrift.view.ExtractRmbView();
                  _elem2.read(iprot);
                  struct.extractRmbList.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setExtractRmbListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.count = iprot.readI32();
              struct.setCountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExtractRmbListView struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.extractRmbList != null) {
        oprot.writeFieldBegin(EXTRACT_RMB_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.extractRmbList.size()));
          for (one.show.pay.thrift.view.ExtractRmbView _iter3 : struct.extractRmbList)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(COUNT_FIELD_DESC);
      oprot.writeI32(struct.count);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExtractRmbListViewTupleSchemeFactory implements SchemeFactory {
    public ExtractRmbListViewTupleScheme getScheme() {
      return new ExtractRmbListViewTupleScheme();
    }
  }

  private static class ExtractRmbListViewTupleScheme extends TupleScheme<ExtractRmbListView> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ExtractRmbListView struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetExtractRmbList()) {
        optionals.set(0);
      }
      if (struct.isSetCount()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetExtractRmbList()) {
        {
          oprot.writeI32(struct.extractRmbList.size());
          for (one.show.pay.thrift.view.ExtractRmbView _iter4 : struct.extractRmbList)
          {
            _iter4.write(oprot);
          }
        }
      }
      if (struct.isSetCount()) {
        oprot.writeI32(struct.count);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ExtractRmbListView struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.extractRmbList = new ArrayList<one.show.pay.thrift.view.ExtractRmbView>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            one.show.pay.thrift.view.ExtractRmbView _elem7; // required
            _elem7 = new one.show.pay.thrift.view.ExtractRmbView();
            _elem7.read(iprot);
            struct.extractRmbList.add(_elem7);
          }
        }
        struct.setExtractRmbListIsSet(true);
      }
      if (incoming.get(1)) {
        struct.count = iprot.readI32();
        struct.setCountIsSet(true);
      }
    }
  }

}


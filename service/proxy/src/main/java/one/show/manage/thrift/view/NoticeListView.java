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

public class NoticeListView implements org.apache.thrift.TBase<NoticeListView, NoticeListView._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NoticeListView");

  private static final org.apache.thrift.protocol.TField NOTICE_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("noticeList", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("count", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NoticeListViewStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NoticeListViewTupleSchemeFactory());
  }

  public List<one.show.manage.thrift.view.NoticeView> noticeList; // required
  public int count; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NOTICE_LIST((short)1, "noticeList"),
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
        case 1: // NOTICE_LIST
          return NOTICE_LIST;
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
    tmpMap.put(_Fields.NOTICE_LIST, new org.apache.thrift.meta_data.FieldMetaData("noticeList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, one.show.manage.thrift.view.NoticeView.class))));
    tmpMap.put(_Fields.COUNT, new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NoticeListView.class, metaDataMap);
  }

  public NoticeListView() {
  }

  public NoticeListView(
    List<one.show.manage.thrift.view.NoticeView> noticeList,
    int count)
  {
    this();
    this.noticeList = noticeList;
    this.count = count;
    setCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NoticeListView(NoticeListView other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetNoticeList()) {
      List<one.show.manage.thrift.view.NoticeView> __this__noticeList = new ArrayList<one.show.manage.thrift.view.NoticeView>();
      for (one.show.manage.thrift.view.NoticeView other_element : other.noticeList) {
        __this__noticeList.add(new one.show.manage.thrift.view.NoticeView(other_element));
      }
      this.noticeList = __this__noticeList;
    }
    this.count = other.count;
  }

  public NoticeListView deepCopy() {
    return new NoticeListView(this);
  }

  @Override
  public void clear() {
    this.noticeList = null;
    setCountIsSet(false);
    this.count = 0;
  }

  public int getNoticeListSize() {
    return (this.noticeList == null) ? 0 : this.noticeList.size();
  }

  public java.util.Iterator<one.show.manage.thrift.view.NoticeView> getNoticeListIterator() {
    return (this.noticeList == null) ? null : this.noticeList.iterator();
  }

  public void addToNoticeList(one.show.manage.thrift.view.NoticeView elem) {
    if (this.noticeList == null) {
      this.noticeList = new ArrayList<one.show.manage.thrift.view.NoticeView>();
    }
    this.noticeList.add(elem);
  }

  public List<one.show.manage.thrift.view.NoticeView> getNoticeList() {
    return this.noticeList;
  }

  public NoticeListView setNoticeList(List<one.show.manage.thrift.view.NoticeView> noticeList) {
    this.noticeList = noticeList;
    return this;
  }

  public void unsetNoticeList() {
    this.noticeList = null;
  }

  /** Returns true if field noticeList is set (has been assigned a value) and false otherwise */
  public boolean isSetNoticeList() {
    return this.noticeList != null;
  }

  public void setNoticeListIsSet(boolean value) {
    if (!value) {
      this.noticeList = null;
    }
  }

  public int getCount() {
    return this.count;
  }

  public NoticeListView setCount(int count) {
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
    case NOTICE_LIST:
      if (value == null) {
        unsetNoticeList();
      } else {
        setNoticeList((List<one.show.manage.thrift.view.NoticeView>)value);
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
    case NOTICE_LIST:
      return getNoticeList();

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
    case NOTICE_LIST:
      return isSetNoticeList();
    case COUNT:
      return isSetCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NoticeListView)
      return this.equals((NoticeListView)that);
    return false;
  }

  public boolean equals(NoticeListView that) {
    if (that == null)
      return false;

    boolean this_present_noticeList = true && this.isSetNoticeList();
    boolean that_present_noticeList = true && that.isSetNoticeList();
    if (this_present_noticeList || that_present_noticeList) {
      if (!(this_present_noticeList && that_present_noticeList))
        return false;
      if (!this.noticeList.equals(that.noticeList))
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

  public int compareTo(NoticeListView other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    NoticeListView typedOther = (NoticeListView)other;

    lastComparison = Boolean.valueOf(isSetNoticeList()).compareTo(typedOther.isSetNoticeList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNoticeList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.noticeList, typedOther.noticeList);
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
    StringBuilder sb = new StringBuilder("NoticeListView(");
    boolean first = true;

    sb.append("noticeList:");
    if (this.noticeList == null) {
      sb.append("null");
    } else {
      sb.append(this.noticeList);
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

  private static class NoticeListViewStandardSchemeFactory implements SchemeFactory {
    public NoticeListViewStandardScheme getScheme() {
      return new NoticeListViewStandardScheme();
    }
  }

  private static class NoticeListViewStandardScheme extends StandardScheme<NoticeListView> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NoticeListView struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NOTICE_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.noticeList = new ArrayList<one.show.manage.thrift.view.NoticeView>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  one.show.manage.thrift.view.NoticeView _elem2; // required
                  _elem2 = new one.show.manage.thrift.view.NoticeView();
                  _elem2.read(iprot);
                  struct.noticeList.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setNoticeListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, NoticeListView struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.noticeList != null) {
        oprot.writeFieldBegin(NOTICE_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.noticeList.size()));
          for (one.show.manage.thrift.view.NoticeView _iter3 : struct.noticeList)
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

  private static class NoticeListViewTupleSchemeFactory implements SchemeFactory {
    public NoticeListViewTupleScheme getScheme() {
      return new NoticeListViewTupleScheme();
    }
  }

  private static class NoticeListViewTupleScheme extends TupleScheme<NoticeListView> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NoticeListView struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNoticeList()) {
        optionals.set(0);
      }
      if (struct.isSetCount()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetNoticeList()) {
        {
          oprot.writeI32(struct.noticeList.size());
          for (one.show.manage.thrift.view.NoticeView _iter4 : struct.noticeList)
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
    public void read(org.apache.thrift.protocol.TProtocol prot, NoticeListView struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.noticeList = new ArrayList<one.show.manage.thrift.view.NoticeView>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            one.show.manage.thrift.view.NoticeView _elem7; // required
            _elem7 = new one.show.manage.thrift.view.NoticeView();
            _elem7.read(iprot);
            struct.noticeList.add(_elem7);
          }
        }
        struct.setNoticeListIsSet(true);
      }
      if (incoming.get(1)) {
        struct.count = iprot.readI32();
        struct.setCountIsSet(true);
      }
    }
  }

}


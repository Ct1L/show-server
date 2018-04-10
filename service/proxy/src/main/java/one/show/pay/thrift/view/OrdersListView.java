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

public class OrdersListView implements org.apache.thrift.TBase<OrdersListView, OrdersListView._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OrdersListView");

  private static final org.apache.thrift.protocol.TField ORDERS_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("ordersList", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("count", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new OrdersListViewStandardSchemeFactory());
    schemes.put(TupleScheme.class, new OrdersListViewTupleSchemeFactory());
  }

  public List<one.show.pay.thrift.view.OrdersView> ordersList; // required
  public int count; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ORDERS_LIST((short)1, "ordersList"),
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
        case 1: // ORDERS_LIST
          return ORDERS_LIST;
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
    tmpMap.put(_Fields.ORDERS_LIST, new org.apache.thrift.meta_data.FieldMetaData("ordersList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, one.show.pay.thrift.view.OrdersView.class))));
    tmpMap.put(_Fields.COUNT, new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OrdersListView.class, metaDataMap);
  }

  public OrdersListView() {
  }

  public OrdersListView(
    List<one.show.pay.thrift.view.OrdersView> ordersList,
    int count)
  {
    this();
    this.ordersList = ordersList;
    this.count = count;
    setCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OrdersListView(OrdersListView other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetOrdersList()) {
      List<one.show.pay.thrift.view.OrdersView> __this__ordersList = new ArrayList<one.show.pay.thrift.view.OrdersView>();
      for (one.show.pay.thrift.view.OrdersView other_element : other.ordersList) {
        __this__ordersList.add(new one.show.pay.thrift.view.OrdersView(other_element));
      }
      this.ordersList = __this__ordersList;
    }
    this.count = other.count;
  }

  public OrdersListView deepCopy() {
    return new OrdersListView(this);
  }

  @Override
  public void clear() {
    this.ordersList = null;
    setCountIsSet(false);
    this.count = 0;
  }

  public int getOrdersListSize() {
    return (this.ordersList == null) ? 0 : this.ordersList.size();
  }

  public java.util.Iterator<one.show.pay.thrift.view.OrdersView> getOrdersListIterator() {
    return (this.ordersList == null) ? null : this.ordersList.iterator();
  }

  public void addToOrdersList(one.show.pay.thrift.view.OrdersView elem) {
    if (this.ordersList == null) {
      this.ordersList = new ArrayList<one.show.pay.thrift.view.OrdersView>();
    }
    this.ordersList.add(elem);
  }

  public List<one.show.pay.thrift.view.OrdersView> getOrdersList() {
    return this.ordersList;
  }

  public OrdersListView setOrdersList(List<one.show.pay.thrift.view.OrdersView> ordersList) {
    this.ordersList = ordersList;
    return this;
  }

  public void unsetOrdersList() {
    this.ordersList = null;
  }

  /** Returns true if field ordersList is set (has been assigned a value) and false otherwise */
  public boolean isSetOrdersList() {
    return this.ordersList != null;
  }

  public void setOrdersListIsSet(boolean value) {
    if (!value) {
      this.ordersList = null;
    }
  }

  public int getCount() {
    return this.count;
  }

  public OrdersListView setCount(int count) {
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
    case ORDERS_LIST:
      if (value == null) {
        unsetOrdersList();
      } else {
        setOrdersList((List<one.show.pay.thrift.view.OrdersView>)value);
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
    case ORDERS_LIST:
      return getOrdersList();

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
    case ORDERS_LIST:
      return isSetOrdersList();
    case COUNT:
      return isSetCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof OrdersListView)
      return this.equals((OrdersListView)that);
    return false;
  }

  public boolean equals(OrdersListView that) {
    if (that == null)
      return false;

    boolean this_present_ordersList = true && this.isSetOrdersList();
    boolean that_present_ordersList = true && that.isSetOrdersList();
    if (this_present_ordersList || that_present_ordersList) {
      if (!(this_present_ordersList && that_present_ordersList))
        return false;
      if (!this.ordersList.equals(that.ordersList))
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

  public int compareTo(OrdersListView other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    OrdersListView typedOther = (OrdersListView)other;

    lastComparison = Boolean.valueOf(isSetOrdersList()).compareTo(typedOther.isSetOrdersList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrdersList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ordersList, typedOther.ordersList);
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
    StringBuilder sb = new StringBuilder("OrdersListView(");
    boolean first = true;

    sb.append("ordersList:");
    if (this.ordersList == null) {
      sb.append("null");
    } else {
      sb.append(this.ordersList);
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

  private static class OrdersListViewStandardSchemeFactory implements SchemeFactory {
    public OrdersListViewStandardScheme getScheme() {
      return new OrdersListViewStandardScheme();
    }
  }

  private static class OrdersListViewStandardScheme extends StandardScheme<OrdersListView> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, OrdersListView struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ORDERS_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.ordersList = new ArrayList<one.show.pay.thrift.view.OrdersView>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  one.show.pay.thrift.view.OrdersView _elem2; // required
                  _elem2 = new one.show.pay.thrift.view.OrdersView();
                  _elem2.read(iprot);
                  struct.ordersList.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setOrdersListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, OrdersListView struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ordersList != null) {
        oprot.writeFieldBegin(ORDERS_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.ordersList.size()));
          for (one.show.pay.thrift.view.OrdersView _iter3 : struct.ordersList)
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

  private static class OrdersListViewTupleSchemeFactory implements SchemeFactory {
    public OrdersListViewTupleScheme getScheme() {
      return new OrdersListViewTupleScheme();
    }
  }

  private static class OrdersListViewTupleScheme extends TupleScheme<OrdersListView> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, OrdersListView struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOrdersList()) {
        optionals.set(0);
      }
      if (struct.isSetCount()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetOrdersList()) {
        {
          oprot.writeI32(struct.ordersList.size());
          for (one.show.pay.thrift.view.OrdersView _iter4 : struct.ordersList)
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
    public void read(org.apache.thrift.protocol.TProtocol prot, OrdersListView struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.ordersList = new ArrayList<one.show.pay.thrift.view.OrdersView>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            one.show.pay.thrift.view.OrdersView _elem7; // required
            _elem7 = new one.show.pay.thrift.view.OrdersView();
            _elem7.read(iprot);
            struct.ordersList.add(_elem7);
          }
        }
        struct.setOrdersListIsSet(true);
      }
      if (incoming.get(1)) {
        struct.count = iprot.readI32();
        struct.setCountIsSet(true);
      }
    }
  }

}


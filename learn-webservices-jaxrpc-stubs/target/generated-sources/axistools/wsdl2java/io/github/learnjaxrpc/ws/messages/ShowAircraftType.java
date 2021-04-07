/**
 * ShowAircraftType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package io.github.learnjaxrpc.ws.messages;

public class ShowAircraftType  implements java.io.Serializable {
    private io.github.learnjaxrpc.ws.schemas.AircraftType[] aircrafts;

    public ShowAircraftType() {
    }

    public ShowAircraftType(
           io.github.learnjaxrpc.ws.schemas.AircraftType[] aircrafts) {
           this.aircrafts = aircrafts;
    }


    /**
     * Gets the aircrafts value for this ShowAircraftType.
     * 
     * @return aircrafts
     */
    public io.github.learnjaxrpc.ws.schemas.AircraftType[] getAircrafts() {
        return aircrafts;
    }


    /**
     * Sets the aircrafts value for this ShowAircraftType.
     * 
     * @param aircrafts
     */
    public void setAircrafts(io.github.learnjaxrpc.ws.schemas.AircraftType[] aircrafts) {
        this.aircrafts = aircrafts;
    }

    public io.github.learnjaxrpc.ws.schemas.AircraftType getAircrafts(int i) {
        return this.aircrafts[i];
    }

    public void setAircrafts(int i, io.github.learnjaxrpc.ws.schemas.AircraftType _value) {
        this.aircrafts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowAircraftType)) return false;
        ShowAircraftType other = (ShowAircraftType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aircrafts==null && other.getAircrafts()==null) || 
             (this.aircrafts!=null &&
              java.util.Arrays.equals(this.aircrafts, other.getAircrafts())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAircrafts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAircrafts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAircrafts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShowAircraftType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://learnjaxrpc.github.io/learn/webservice/rpc/msg/1.0.0", "ShowAircraftType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aircrafts");
        elemField.setXmlName(new javax.xml.namespace.QName("https://learnjaxrpc.github.io/learn/webservice/rpc/msg/1.0.0", "aircrafts"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://learnjaxrpc.github.io/learn/webservice/rpc/aircraft/1.0.0", "AircraftType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

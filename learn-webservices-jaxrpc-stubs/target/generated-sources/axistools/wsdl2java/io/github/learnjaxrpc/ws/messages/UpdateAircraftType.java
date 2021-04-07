/**
 * UpdateAircraftType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package io.github.learnjaxrpc.ws.messages;

public class UpdateAircraftType  implements java.io.Serializable {
    private io.github.learnjaxrpc.ws.schemas.AircraftType aircraft;

    public UpdateAircraftType() {
    }

    public UpdateAircraftType(
           io.github.learnjaxrpc.ws.schemas.AircraftType aircraft) {
           this.aircraft = aircraft;
    }


    /**
     * Gets the aircraft value for this UpdateAircraftType.
     * 
     * @return aircraft
     */
    public io.github.learnjaxrpc.ws.schemas.AircraftType getAircraft() {
        return aircraft;
    }


    /**
     * Sets the aircraft value for this UpdateAircraftType.
     * 
     * @param aircraft
     */
    public void setAircraft(io.github.learnjaxrpc.ws.schemas.AircraftType aircraft) {
        this.aircraft = aircraft;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateAircraftType)) return false;
        UpdateAircraftType other = (UpdateAircraftType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aircraft==null && other.getAircraft()==null) || 
             (this.aircraft!=null &&
              this.aircraft.equals(other.getAircraft())));
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
        if (getAircraft() != null) {
            _hashCode += getAircraft().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateAircraftType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://learnjaxrpc.github.io/learn/webservice/rpc/msg/1.0.0", "UpdateAircraftType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aircraft");
        elemField.setXmlName(new javax.xml.namespace.QName("https://learnjaxrpc.github.io/learn/webservice/rpc/msg/1.0.0", "aircraft"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://learnjaxrpc.github.io/learn/webservice/rpc/aircraft/1.0.0", "AircraftType"));
        elemField.setNillable(false);
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

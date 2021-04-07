/**
 * AircraftType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package io.github.learnjaxrpc.ws.schemas;

public class AircraftType  implements java.io.Serializable {
    private io.github.learnjaxrpc.ws.schemas.ManufacturerType manufacturer;

    private java.lang.String designation;

    private java.lang.String name;

    private java.lang.String nickname;

    private java.util.Date firstFlight;

    private int produced;

    public AircraftType() {
    }

    public AircraftType(
           io.github.learnjaxrpc.ws.schemas.ManufacturerType manufacturer,
           java.lang.String designation,
           java.lang.String name,
           java.lang.String nickname,
           java.util.Date firstFlight,
           int produced) {
           this.manufacturer = manufacturer;
           this.designation = designation;
           this.name = name;
           this.nickname = nickname;
           this.firstFlight = firstFlight;
           this.produced = produced;
    }


    /**
     * Gets the manufacturer value for this AircraftType.
     * 
     * @return manufacturer
     */
    public io.github.learnjaxrpc.ws.schemas.ManufacturerType getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this AircraftType.
     * 
     * @param manufacturer
     */
    public void setManufacturer(io.github.learnjaxrpc.ws.schemas.ManufacturerType manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the designation value for this AircraftType.
     * 
     * @return designation
     */
    public java.lang.String getDesignation() {
        return designation;
    }


    /**
     * Sets the designation value for this AircraftType.
     * 
     * @param designation
     */
    public void setDesignation(java.lang.String designation) {
        this.designation = designation;
    }


    /**
     * Gets the name value for this AircraftType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AircraftType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nickname value for this AircraftType.
     * 
     * @return nickname
     */
    public java.lang.String getNickname() {
        return nickname;
    }


    /**
     * Sets the nickname value for this AircraftType.
     * 
     * @param nickname
     */
    public void setNickname(java.lang.String nickname) {
        this.nickname = nickname;
    }


    /**
     * Gets the firstFlight value for this AircraftType.
     * 
     * @return firstFlight
     */
    public java.util.Date getFirstFlight() {
        return firstFlight;
    }


    /**
     * Sets the firstFlight value for this AircraftType.
     * 
     * @param firstFlight
     */
    public void setFirstFlight(java.util.Date firstFlight) {
        this.firstFlight = firstFlight;
    }


    /**
     * Gets the produced value for this AircraftType.
     * 
     * @return produced
     */
    public int getProduced() {
        return produced;
    }


    /**
     * Sets the produced value for this AircraftType.
     * 
     * @param produced
     */
    public void setProduced(int produced) {
        this.produced = produced;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AircraftType)) return false;
        AircraftType other = (AircraftType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              this.manufacturer.equals(other.getManufacturer()))) &&
            ((this.designation==null && other.getDesignation()==null) || 
             (this.designation!=null &&
              this.designation.equals(other.getDesignation()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nickname==null && other.getNickname()==null) || 
             (this.nickname!=null &&
              this.nickname.equals(other.getNickname()))) &&
            ((this.firstFlight==null && other.getFirstFlight()==null) || 
             (this.firstFlight!=null &&
              this.firstFlight.equals(other.getFirstFlight()))) &&
            this.produced == other.getProduced();
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
        if (getManufacturer() != null) {
            _hashCode += getManufacturer().hashCode();
        }
        if (getDesignation() != null) {
            _hashCode += getDesignation().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNickname() != null) {
            _hashCode += getNickname().hashCode();
        }
        if (getFirstFlight() != null) {
            _hashCode += getFirstFlight().hashCode();
        }
        _hashCode += getProduced();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AircraftType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://learnjaxrpc.github.io/learn/webservice/rpc/aircraft/1.0.0", "AircraftType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://learnjaxrpc.github.io/learn/webservice/rpc/aircraft/1.0.0", "manufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://learnjaxrpc.github.io/learn/webservice/rpc/aircraft/1.0.0", "ManufacturerType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://learnjaxrpc.github.io/learn/webservice/rpc/aircraft/1.0.0", "designation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://learnjaxrpc.github.io/learn/webservice/rpc/aircraft/1.0.0", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nickname");
        elemField.setXmlName(new javax.xml.namespace.QName("https://learnjaxrpc.github.io/learn/webservice/rpc/aircraft/1.0.0", "nickname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstFlight");
        elemField.setXmlName(new javax.xml.namespace.QName("https://learnjaxrpc.github.io/learn/webservice/rpc/aircraft/1.0.0", "firstFlight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("produced");
        elemField.setXmlName(new javax.xml.namespace.QName("https://learnjaxrpc.github.io/learn/webservice/rpc/aircraft/1.0.0", "produced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

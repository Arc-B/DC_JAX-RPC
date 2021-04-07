/**
 * AircraftServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package io.github.learnjaxrpc.ws;

public class AircraftServiceLocator extends org.apache.axis.client.Service implements io.github.learnjaxrpc.ws.AircraftService {

    public AircraftServiceLocator() {
    }


    public AircraftServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AircraftServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AircraftInterfaceBinding
    private java.lang.String AircraftInterfaceBinding_address = "http://localhost:8080/ws/aircraft";

    public java.lang.String getAircraftInterfaceBindingAddress() {
        return AircraftInterfaceBinding_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AircraftInterfaceBindingWSDDServiceName = "AircraftInterfaceBinding";

    public java.lang.String getAircraftInterfaceBindingWSDDServiceName() {
        return AircraftInterfaceBindingWSDDServiceName;
    }

    public void setAircraftInterfaceBindingWSDDServiceName(java.lang.String name) {
        AircraftInterfaceBindingWSDDServiceName = name;
    }

    public io.github.learnjaxrpc.ws.AircraftInterface getAircraftInterfaceBinding() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AircraftInterfaceBinding_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAircraftInterfaceBinding(endpoint);
    }

    public io.github.learnjaxrpc.ws.AircraftInterface getAircraftInterfaceBinding(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            io.github.learnjaxrpc.ws.AircraftInterfaceBindingStub _stub = new io.github.learnjaxrpc.ws.AircraftInterfaceBindingStub(portAddress, this);
            _stub.setPortName(getAircraftInterfaceBindingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAircraftInterfaceBindingEndpointAddress(java.lang.String address) {
        AircraftInterfaceBinding_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (io.github.learnjaxrpc.ws.AircraftInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                io.github.learnjaxrpc.ws.AircraftInterfaceBindingStub _stub = new io.github.learnjaxrpc.ws.AircraftInterfaceBindingStub(new java.net.URL(AircraftInterfaceBinding_address), this);
                _stub.setPortName(getAircraftInterfaceBindingWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AircraftInterfaceBinding".equals(inputPortName)) {
            return getAircraftInterfaceBinding();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://learnjaxrpc.github.io/learn/webservice/rpc", "AircraftService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://learnjaxrpc.github.io/learn/webservice/rpc", "AircraftInterfaceBinding"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AircraftInterfaceBinding".equals(portName)) {
            setAircraftInterfaceBindingEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

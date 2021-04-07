/**
 * AircraftService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package io.github.learnjaxrpc.ws;

public interface AircraftService extends javax.xml.rpc.Service {
    public java.lang.String getAircraftInterfaceBindingAddress();

    public io.github.learnjaxrpc.ws.AircraftInterface getAircraftInterfaceBinding() throws javax.xml.rpc.ServiceException;

    public io.github.learnjaxrpc.ws.AircraftInterface getAircraftInterfaceBinding(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

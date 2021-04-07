/**
 * AircraftInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package io.github.learnjaxrpc.ws;

public interface AircraftInterface extends java.rmi.Remote {
    public java.lang.String ping(java.lang.String pingRequest) throws java.rmi.RemoteException;
    public io.github.learnjaxrpc.ws.messages.ShowAircraftType getAircraft(io.github.learnjaxrpc.ws.messages.GetAircraftType getAircraftType) throws java.rmi.RemoteException;
    public io.github.learnjaxrpc.ws.messages.AcknowledgeAircraftType updateAircraft(io.github.learnjaxrpc.ws.messages.UpdateAircraftType updateAircraftType) throws java.rmi.RemoteException;
}

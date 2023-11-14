package com.example.deviceconnectivity.dto;

public class OrangeApiRequest {
    private UeId ueId;
    private int uePort;
    private String eventType;

    public OrangeApiRequest() {
    }

    public OrangeApiRequest(UeId ueId, int uePort, String eventType) {
        this.ueId = ueId;
        this.uePort = uePort;
        this.eventType = eventType;
    }

    public UeId getUeId() {
        return ueId;
    }

    public void setUeId(UeId ueId) {
        this.ueId = ueId;
    }

    public int getUePort() {
        return uePort;
    }

    public void setUePort(int uePort) {
        this.uePort = uePort;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}

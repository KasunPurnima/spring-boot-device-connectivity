package com.example.deviceconnectivity.dto;

public class OrangeApiResponse {
    private UeId ueId;
    private int uePort;
    private String eventType;
    private String eventStatus;

    public OrangeApiResponse() {
    }

    public OrangeApiResponse(UeId ueId, int uePort, String eventType, String eventStatus) {
        this.ueId = ueId;
        this.uePort = uePort;
        this.eventType = eventType;
        this.eventStatus = eventStatus;
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

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }
}

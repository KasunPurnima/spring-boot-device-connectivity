package com.example.deviceconnectivity.dto;

public class UeId {
    private String externalId;
    private String msisdn;
    private String ipv4Addr;
    private String ipv6Addr;

    public UeId() {
    }

    public UeId(String externalId, String msisdn, String ipv4Addr, String ipv6Addr) {
        this.externalId = externalId;
        this.msisdn = msisdn;
        this.ipv4Addr = ipv4Addr;
        this.ipv6Addr = ipv6Addr;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getIpv4Addr() {
        return ipv4Addr;
    }

    public void setIpv4Addr(String ipv4Addr) {
        this.ipv4Addr = ipv4Addr;
    }

    public String getIpv6Addr() {
        return ipv6Addr;
    }

    public void setIpv6Addr(String ipv6Addr) {
        this.ipv6Addr = ipv6Addr;
    }
}

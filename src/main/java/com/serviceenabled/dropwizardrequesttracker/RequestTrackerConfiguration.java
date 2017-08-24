package com.serviceenabled.dropwizardrequesttracker;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestTrackerConfiguration {

    private String headerName = "X-Request-Tracker";
    private String mdcKey = "Request-Tracker";
    private Boolean addResponseHeader = false;

    public RequestTrackerConfiguration() {
    }

    public RequestTrackerConfiguration(String headerName, String mdcKey) {
        setHeaderName(headerName);
        setMdcKey(mdcKey);
    }

    @JsonProperty
    public Boolean getAddResponseHeader() {
        return this.addResponseHeader;
    }

    @JsonProperty
    public void setAddResponseHeader(Boolean val) {
        this.addResponseHeader = val;
    }

    @JsonProperty
    public String getHeaderName() {
        return headerName;
    }

    @JsonProperty
    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    @JsonProperty
    public String getMdcKey() {
        return mdcKey;
    }

    @JsonProperty
    public void setMdcKey(String mdcKey) {
        this.mdcKey = mdcKey;
    }
}

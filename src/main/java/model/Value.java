package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Value {

    @JsonProperty("ServiceNo")
    private String serviceNo;
    @JsonProperty("Operator")
    private String operator;
    @JsonProperty("Direction")
    private int direction;
    @JsonProperty("StopSequence")
    private String stopSequence;
    @JsonProperty("BusStopCode")
    private String busStopCode;
    @JsonProperty("Distance")
    private String distance;
    @JsonProperty("WD_FirstBus")
    private String wd_FirstBus;
    @JsonProperty("WD_LastBus")
    private String wd_LastBus;
    @JsonProperty("SAT_FirstBus")
    private String sat_FirstBus;
    @JsonProperty("SAT_LastBus")
    private String sat_LastBus;
    @JsonProperty("SUN_FirstBus")
    private String sun_FirstBus;
    @JsonProperty("SUN_LastBus")
    private String sun_LastBus;

    public String getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public String getStopSequence() {
        return stopSequence;
    }

    public void setStopSequence(String stopSequence) {
        this.stopSequence = stopSequence;
    }

    public String getBusStopCode() {
        return busStopCode;
    }

    public void setBusStopCode(String busStopCode) {
        this.busStopCode = busStopCode;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getWd_FirstBus() {
        return wd_FirstBus;
    }

    public void setWd_FirstBus(String wd_FirstBus) {
        this.wd_FirstBus = wd_FirstBus;
    }

    public String getWd_LastBus() {
        return wd_LastBus;
    }

    public void setWd_LastBus(String wd_LastBus) {
        this.wd_LastBus = wd_LastBus;
    }
}

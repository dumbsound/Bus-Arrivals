package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Services {

    @JsonProperty("ServiceNo")
    private String serviceNo;
    @JsonProperty("Operator")
    private String operator;
    @JsonProperty("NextBus")
    private NextBus nextBus;
    @JsonProperty("NextBus2")
    private NextBus nextBus2;
    @JsonProperty("NextBus3")
    private NextBus nextBus3;

    public Services() {
    }

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

    public NextBus getNextBus() {
        return nextBus;
    }

    public void setNextBus(NextBus nextBus) {
        this.nextBus = nextBus;
    }

    public NextBus getNextBus2() {
        return nextBus2;
    }

    public void setNextBus2(NextBus nextBus2) {
        this.nextBus2 = nextBus2;
    }

    public NextBus getNextBus3() {
        return nextBus3;
    }

    public void setNextBus3(NextBus nextBus3) {
        this.nextBus3 = nextBus3;
    }
}

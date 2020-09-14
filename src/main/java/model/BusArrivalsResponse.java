package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BusArrivalsResponse {

    @JsonProperty("odata.metadata")
    private String data;
    @JsonProperty("BusStopCode")
    private String busStop;
    @JsonProperty("Services")
    private List<Services> service;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getBusStop() {
        return busStop;
    }

    public void setBusStop(String busStop) {
        this.busStop = busStop;
    }

    public List<Services> getService() {
        return service;
    }

    public void setService(List<Services> service) {
        this.service = service;
    }
}

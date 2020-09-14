package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BusRoutes {

    @JsonProperty("odata.metadata")
    private String data;
    private List<Value> value;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Value> getValue() {
        return value;
    }

    public void setValue(List<Value> value) {
        this.value = value;
    }


}

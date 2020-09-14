package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PassengerVolResponse {

    @JsonProperty("odata.metadata")
    private String data;
    @JsonProperty("value")
    private List<Link> value;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Link> getValue() {
        return value;
    }

    public void setValue(List<Link> value) {
        this.value = value;
    }
}

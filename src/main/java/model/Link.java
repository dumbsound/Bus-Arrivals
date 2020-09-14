package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Link {

    @JsonProperty("Link")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

package model

import com.fasterxml.jackson.annotation.JsonProperty

class BusArrivalsResponse {
    @JsonProperty("odata.metadata")
    var data: String? = null

    @JsonProperty("BusStopCode")
    var busStop: String? = null

    @JsonProperty("Services")
    var service: List<Services>? = null
}
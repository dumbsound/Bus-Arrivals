package model

import com.fasterxml.jackson.annotation.JsonProperty

class BusRoutes {
    @JsonProperty("odata.metadata")
    var data: String? = null
    var value: List<Value>? = null
}
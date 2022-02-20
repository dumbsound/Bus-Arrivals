package examples

import kotlin.jvm.JvmStatic
import service.APIHandler
import com.fasterxml.jackson.databind.ObjectMapper
import model.BusArrivalsResponse
import java.lang.Exception

object BusArrivalsExample {
    @JvmStatic
    fun main(args: Array<String>) {
        val apiHandler = APIHandler()
        val objectMapper = ObjectMapper()
        try {
            val busArrivalsResponse = apiHandler.busArrivalsResponse
            println(
                """Bus Routes is 
 ${objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(busArrivalsResponse)}"""
            )
        } catch (e: Exception) {
            e.printStackTrace()
            println("Error Bus Routes is " + e.message)
        }
    }
}
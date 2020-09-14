package examples;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.BusArrivalsResponse;
import service.APIHandler;

public class BusArrivalsExample {

    public static void main(String[] args) {

        APIHandler apiHandler=new APIHandler();

        ObjectMapper objectMapper=new ObjectMapper();

        try {
            BusArrivalsResponse busArrivalsResponse = apiHandler.getBusArrivalsResponse();
            System.out.println("Bus Routes is \n " + objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(busArrivalsResponse));
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Error Bus Routes is "+e.getMessage());
        }
    }
}

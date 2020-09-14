package examples;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.BusRoutes;
import service.APIHandler;

public class BusRoutesExample {

    public static void main(String[] args) {

        APIHandler apiHandler=new APIHandler();

        ObjectMapper objectMapper=new ObjectMapper();

        try {
            BusRoutes busRoutes = apiHandler.getBusRoutesValueResponse();
            System.out.println("Bus Routes Example is \n " + objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(busRoutes));
        } catch(Exception e){
                e.printStackTrace();
            System.out.println("Error Bus Routes Example is "+e.getMessage());
            }
        }
    }


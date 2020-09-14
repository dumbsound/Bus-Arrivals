package examples;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.PassengerVolResponse;
import service.APIHandler;

public class PassengerVolExample {

    public static void main(String[] args) {

        APIHandler apiHandler=new APIHandler();

        ObjectMapper objectMapper=new ObjectMapper();

        try {
            PassengerVolResponse passengerVolResponse = apiHandler.getPassengerVolResponse();
            System.out.println("Example is \n " + objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(passengerVolResponse));

//            apiHandler.downloadFile();

        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Error is "+e.getMessage());
        }
    }
}

package service;

import model.Account;
import model.BusArrivalsResponse;
import model.BusRoutes;
import model.PassengerVolResponse;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class APIHandler {

    private RestTemplate restTemplate = new RestTemplate();

    public BusRoutes getBusRoutesValueResponse() throws Exception {

        String url = Account.URL+"BusRoutes";

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("AccountKey", Account.AccountKey);
        HttpEntity httpEntity = new HttpEntity(httpHeaders);

        try {
            ResponseEntity<BusRoutes> responseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, BusRoutes.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    public BusArrivalsResponse getBusArrivalsResponse() throws Exception {

        String url = Account.URL+"BusArrivalv2";

        UriComponentsBuilder uriComponentsBuilder=UriComponentsBuilder.fromUriString(url)
                .queryParam("BusStopCode",Account.BUS_STOP)
                .queryParam("BusArrivalsResponse",Account.BUS_SERVICE_NO);


        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("AccountKey", Account.AccountKey);
        HttpEntity httpEntity = new HttpEntity(httpHeaders);

        try {
            ResponseEntity<BusArrivalsResponse> responseEntity = restTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.GET, httpEntity, BusArrivalsResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    public PassengerVolResponse getPassengerVolResponse() throws Exception {

        String url = Account.URL+"PV/ODBus";

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("AccountKey", Account.AccountKey);
        HttpEntity httpEntity = new HttpEntity(httpHeaders);

        try {
            ResponseEntity<PassengerVolResponse> responseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, PassengerVolResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());


        }
    }

    public void downloadFile(){

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_OCTET_STREAM));
            HttpEntity<String> entity = new HttpEntity<>(headers);
            ResponseEntity<byte[]> response = restTemplate.exchange("https://www.bbcgoodfood.com/sites/default/files/recipe/recipe-image/2013/04/perfect-pancakes.jpg", HttpMethod.GET, entity, byte[].class);
            Files.write(Paths.get("C:\\Users\\Saleh Basharahil\\Desktop\\attachment.jpg"), response.getBody());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

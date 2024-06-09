import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BusquedaAPi {

    public Moneda CambioDivisa(String baseCode, String targetCode,Double AMOUNT){

        URI dirreccion = URI.create("https://v6.exchangerate-api.com/v6/21ac52aa31a9293cded622f9/pair/"+
                        baseCode+
                        "/"+
                        targetCode +
                        "/"+
                        AMOUNT);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(dirreccion)
                .build();


        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("Error, rectifique los datos ingresados");
        }


    }

}

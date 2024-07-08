import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Requisicao {
    public Conversor conversor  (String moedaBase, String moedaAlvo, Double valor) {

        Gson gson = new Gson();
        try {
        String apiKey = "37d984e380d9d5e185167e28";
        String url = "https://v6.exchangerate-api.com/v6/"
        + apiKey + "/pair/" + moedaBase + "/" + moedaAlvo  + "/"  + valor ;




        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();


            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Conversor.class);

        } catch (Exception  e) {
            throw new RuntimeException("Erro na conversão");
        }
    }
}
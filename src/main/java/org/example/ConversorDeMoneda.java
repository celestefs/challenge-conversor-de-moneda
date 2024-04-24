package org.example;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDeMoneda {
    public Moneda convertirMoneda(String monedaDeOrigen, String monedaDeDestino, double monto) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/d76c055b9df09b5b9aebab6d/pair/" + monedaDeOrigen + "/" + monedaDeDestino + "/" + monto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = null;

        try {
           response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new RuntimeException("No se pudo realizar la conversión.");
        }
        return new Gson().fromJson(response.body(), Moneda.class);
    }
}

package alura.converter;

import com.google.gson.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Request {


        public Request(String typeOfCurrency, String currency, double cantidad) {
            String url_str = "https://v6.exchangerate-api.com/v6/36e9070c86998f5a8477d41f/pair/" + typeOfCurrency + "/" + currency + "/" + cantidad;

            try {
                URL url = new URL(url_str);
                HttpURLConnection request = (HttpURLConnection) url.openConnection();
                request.connect();

                int responseCode = request.getResponseCode();
                if (responseCode == 200) {
                    // Convert to JSON
                    JsonParser jp = new JsonParser();
                    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
                    JsonObject jsonobj = root.getAsJsonObject();

// Accessing object
                    Gson gson = new GsonBuilder().setPrettyPrinting().create();
                    String prettyJson = gson.toJson(jsonobj);
                    double conversionRate = jsonobj.get ("conversion_rate").getAsDouble();

                    System.out.println("El valor de "+cantidad+" ["+typeOfCurrency+"] corresponde al valor final de "+ conversionRate + " ["+currency+"]\n");
                } else {
                    System.err.println("Error en la respuesta HTTP. Código de estado: " + responseCode);
                }
            } catch (IOException e) {
                System.err.println("Error al realizar la solicitud: " + e.getMessage());
                throw new RuntimeException(e);
            }
        }
    }


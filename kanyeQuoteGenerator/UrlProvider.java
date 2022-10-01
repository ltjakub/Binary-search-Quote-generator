package pl.envelo.kanyeQuoteGenerator;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlProvider {
    public static URL getUrl() {
        try {
            URL url = new URL("https://api.kanye.rest/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            return url;
        } catch (IOException e) {
            System.err.println("Invalid URL");
            throw new RuntimeException(e);
        }
    }
}

package pl.envelo.kanyeQuoteGenerator;
import org.json.JSONObject;
import java.util.Scanner;

public class QuoteProvider {
    public String getQuote(Scanner scanner) {
        String jsonString = scanner.nextLine();
        JSONObject obj = new JSONObject(jsonString);
        return obj.getString("quote");
    }

}

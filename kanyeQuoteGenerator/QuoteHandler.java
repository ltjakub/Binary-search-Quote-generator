package pl.envelo.kanyeQuoteGenerator;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class QuoteHandler {

    private boolean isDuplicate;

    public boolean isDuplicate() {
        return isDuplicate;
    }

    public void handleQuote(URL url, Quotes quotes) {
        QuoteProvider quoteProvider = new QuoteProvider();

        try (Scanner scanner = new Scanner(url.openStream())) {

            if (scanner.hasNext()) {
                String quote = quoteProvider.getQuote(scanner);

                isDuplicate = quotes.getQuotes().stream().anyMatch(s -> s.equals(quote));

                if (!isDuplicate) {
                    quotes.add(quote);
                } else {
                    System.err.println("Duplikat!");
                }
                System.out.println(quote);

            scanner.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}

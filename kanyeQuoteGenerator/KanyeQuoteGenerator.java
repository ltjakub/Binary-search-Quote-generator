package pl.envelo.kanyeQuoteGenerator;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import static pl.envelo.kanyeQuoteGenerator.UrlProvider.getUrl;

public class KanyeQuoteGenerator {
    public static void main(String[] args) {
        Quotes quotes = new Quotes(new ArrayList<>());
            mainLoop(quotes);

    }
    private static void mainLoop(Quotes quotes) {
        Scanner input = new Scanner(System.in);
        QuoteHandler quoteHandler = new QuoteHandler();
        do {
            URL url = getUrl();
            quoteHandler.handleQuote(url, quotes);
            System.out.println("Napisz \"next\", aby wygenerowac kolejny cytat, lub kliknij ENTER aby zakonczyc dzialanie programu.");
        } while (input.nextLine().equals("next"));

        input.close();
        quotes.printQuotes();
    }


}

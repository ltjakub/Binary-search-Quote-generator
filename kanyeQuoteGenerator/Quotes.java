package pl.envelo.kanyeQuoteGenerator;

import java.util.ArrayList;

public class Quotes {

    private ArrayList<String> quotes;

    public Quotes(ArrayList<String> quotes) {
        this.quotes = quotes;
    }

    public ArrayList<String> getQuotes() {
        return quotes;
    }

    public void add(String quote) {
       quotes.add(quote);
   }
   public void printQuotes() {
       System.out.println("Lista wygenerowanych cytatow:");
       System.out.println(quotes);
   }
}

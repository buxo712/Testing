package org.initializzation;

import java.util.HashMap;
import java.util.Map;
public class service {

    private Map<String, Double> rates;

    public service() {
        rates = new HashMap<>();
        // Example rates; normally these would be fetched from an API or database
        rates.put("USD/UGX", 2.85);
        rates.put("EUR/USD", 1.18);
        rates.put("USD/FC", 110.0);
        rates.put("JPY/USD", 0.0091);
    }

    public double getExchangeRate(String currencyPair) {
        return rates.getOrDefault(currencyPair, 1.0); // Default rate to 1.0 if not found
    }



}
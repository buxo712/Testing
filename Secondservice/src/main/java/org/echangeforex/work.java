package org.echangeforex;

public class work {
    private int exchangeRateManager;

    public void CurrencyConverter(String exchangeRateManager) {
      //  this.exchangeRateManager = Integer.parseInt(exchangeRateManager);
   }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        String currencyPair = fromCurrency + "/" + toCurrency;
        double exchangeRate = exchangeRateManager;
        return amount * exchangeRate;
    }
}


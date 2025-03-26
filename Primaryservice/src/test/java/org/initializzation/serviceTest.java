package org.initializzation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class serviceTest {

    private service exchangeRateService;


    }

   @Test
    public void testGetExchangeRateForValidCurrencyPair() {
        // Test known currency pairs
        double usdToUgxRate = exchangeRateService.getExchangeRate("USD/UGX");
        assertEquals(2.85, usdToUgxRate, 0.01);

        double eurToUsdRate = exchangeRateService.getExchangeRate("EUR/USD");
        assertEquals(1.18, eurToUsdRate, 0.01);

        double usdToFcRate = exchangeRateService.getExchangeRate("USD/FC");
        assertEquals(110.0, usdToFcRate, 0.01);
    }

    @Test
    public void testGetExchangeRateForUnknownCurrencyPair() {
        // Test for a currency pair that doesn't exist
        double unknownRate = exchangeRateService.getExchangeRate("GBP/USD");
        assertEquals(1.0, unknownRate, 0.01); // Default value
    }

    @Test
    public void testGetExchangeRateForAnotherUnknownCurrencyPair() {
        // Another test for a different unknown currency pair
        double anotherUnknownRate = exchangeRateService.getExchangeRate("AUD/JPY");
        assertEquals(1.0, anotherUnknownRate, 0.01); // Default value
    }
}
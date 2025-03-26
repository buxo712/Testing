package org.initializzation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class serviceTest {

    private service exchangeRateService;

    @BeforeEach
    public void setUp() {
        exchangeRateService = new service(); // Initialize the service instance
    }

   
}
package service;

import org.junit.Test;
import service.impl.FibCalculator;

import static org.junit.Assert.assertEquals;

public class FibCalcServiceTest {

    private FibCalcService fibService = new FibCalculator();

    @Test
    public void testFibSeqCalculator() {
        assertEquals(0L, fibService.calcFib(0));
        assertEquals(1L, fibService.calcFib(1));
        assertEquals(1L, fibService.calcFib(2));
        assertEquals(2L, fibService.calcFib(3));
        assertEquals(3L, fibService.calcFib(4));
        assertEquals(55L, fibService.calcFib(10));
    }

}

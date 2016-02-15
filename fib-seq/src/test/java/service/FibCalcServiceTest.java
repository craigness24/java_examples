package service;

import config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class FibCalcServiceTest {

    @Autowired
    private FibCalcService fibCalcService;

    @Test
    public void testFibSeqCalculator() {
        assertEquals(0L, fibCalcService.calcFib(0));
        assertEquals(1L, fibCalcService.calcFib(1));
        assertEquals(1L, fibCalcService.calcFib(2));
        assertEquals(2L, fibCalcService.calcFib(3));
        assertEquals(3L, fibCalcService.calcFib(4));
        assertEquals(55L, fibCalcService.calcFib(10));
    }

}

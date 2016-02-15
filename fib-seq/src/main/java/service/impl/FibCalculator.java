package service.impl;

import service.FibCalcService;

public class FibCalculator implements FibCalcService {

    public long calcFib(int elem) {
        if (elem == 0)
            return 0;

        if (elem == 1)
            return 1;

        return calcFib(elem - 1) + calcFib(elem - 2);
    }

}

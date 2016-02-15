package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.FibCalcService;
import service.impl.FibCalculator;

@Configuration
public class AppConfig {

    @Bean
    public FibCalcService fibCalcService() {
        return new FibCalculator();
    }

}

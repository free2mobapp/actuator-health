package uk.co.ksb.actuatorhealth.healthactuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SimpleHealthIndicator implements HealthIndicator {

    // always reports UP
    @Override
    public Health health() {
        Map<String,String> map = new HashMap<String,String>();
        map.put("foo","bar");
        map.put("my","value");
        return new Health.Builder().up().withDetail("simple", map).build();
        //return new Health.Builder().down().withDetail("simple", map).build();
    }

    private String dbHealthCheck() {
        return "UP";
    }

    private String kafkaHealthCheck() {
        return "UP";
    }

}

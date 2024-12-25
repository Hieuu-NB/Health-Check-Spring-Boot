package com.example.testhealthcheck.heathCheck;

import org.springframework.boot.actuate.health.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomHealthStatusAggregator {

    // file này để health luôn có status là UP khi có ít nhất 1 service là UP
    @Bean
    public StatusAggregator statusAggregator() {
        return statuses -> {
            if (statuses.contains(Status.UP)) {
                return Status.UP;
            }
            return Status.DOWN;
        };
    }
}

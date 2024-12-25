//package com.example.server;
//
//import org.springframework.boot.actuate.health.Health;
//import org.springframework.boot.actuate.health.HealthIndicator;
//import org.springframework.stereotype.Component;
//
//@Component
//public class HealthCheckClassSample implements HealthIndicator {
//    @Override
//    public Health health() {
//        boolean serviceUp = checkExternalService();
//        if (serviceUp) {
//            return Health.up()
//                    .withDetail("Service Status", "Available")
//                    .withDetail("Response Time", "120ms") // Ví dụ
//                    .build();
//        } else {
//            return Health.down()
//                    .withDetail("Service Status", "Unavailable")
//                    .withDetail("Error", "Timeout while connecting")
//                    .build();
//        }
//    }
//    private boolean checkExternalService() {
//        // Thực hiện logic kiểm tra (ví dụ: gọi API, ping server)
//        return true; // Thay đổi logic theo nhu cầu
//    }
//}

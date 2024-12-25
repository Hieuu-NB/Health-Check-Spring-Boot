package com.example.testhealthcheck.heathCheck;

import com.example.testhealthcheck.feign.FeignService_1;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

//@Component
@Component("SERVER_CASH_SERVICE")
public class Service_1 implements HealthIndicator {
    private final FeignService_1 feignService;

    public Service_1(FeignService_1 feignService) {
        this.feignService = feignService;
    }

    @Override
    public Health health() {
        try {
            // Gọi API của dịch vụ bên ngoài để kiểm tra trạng thái
            String response = feignService.hello();
//            Act
            if (response != null) {
                return Health.up().withDetail("Status ", "Api 1 done").build();
            } else {
                return Health.down().withDetail("Status", "Api 1 bị null").build();
            }
        } catch (Exception e) {
            // Xử lý ngoại lệ khi gọi API thất bại
            return Health.down()
                    .withDetail("External Service", "Api 1 bị lỗi")
                    .withException(e)
                    .build();
        }
    }
}

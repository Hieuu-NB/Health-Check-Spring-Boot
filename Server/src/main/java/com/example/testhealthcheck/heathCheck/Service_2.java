package com.example.testhealthcheck.heathCheck;

import com.example.testhealthcheck.feign.FeignService_1;
import com.example.testhealthcheck.feign.FeignService_2;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;


//@Component
@Component("SERVER_COMPOSITE_SERVICE")
public class Service_2 implements HealthIndicator {
    private final FeignService_2 feignService;

    public Service_2(FeignService_2 feignService) {
        this.feignService = feignService;
    }

    @Override
    public Health health() {
        try {
            // Gọi API của dịch vụ bên ngoài để kiểm tra trạng thái
            String response = feignService.hello2();
            if (response != null) {
                return Health.up().withDetail("Status ", "Api 2 done").build();
            } else {
                return Health.down().withDetail("Status", "Api 2 bị null").build();
            }
        } catch (Exception e) {
            // Xử lý ngoại lệ khi gọi API thất bại
            return Health.down()
                    .withDetail("External Service", "SERVER_LOANS_SERVICE bị lỗi")
                    .withException(e)
                    .build();
        }
    }
}

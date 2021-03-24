package com.hyl.springcloud.service;

import com.hyl.springcloud.entities.CommonResult;
import com.hyl.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author huyanlong
 * @Date 2021/3/24 17:05
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getProviderPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/feign/timeout")
    String providerPaymentFeignTimeout();
}

package springcloud.service;

import entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 王晋南
 * @CreateDate 2020/6/17 0017
 */
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}

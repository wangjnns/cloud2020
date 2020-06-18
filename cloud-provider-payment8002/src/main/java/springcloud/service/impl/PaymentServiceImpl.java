package springcloud.service.impl;


import entities.Payment;
import org.springframework.stereotype.Service;
import springcloud.dao.PaymentDao;
import springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author 王晋南
 * @CreateDate 2020/6/17 0017
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

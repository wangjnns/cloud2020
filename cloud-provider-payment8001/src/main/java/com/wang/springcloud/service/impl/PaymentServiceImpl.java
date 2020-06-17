package com.wang.springcloud.service.impl;

import com.wang.springcloud.dao.PaymentDao;
import com.wang.springcloud.entities.Payment;
import com.wang.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

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

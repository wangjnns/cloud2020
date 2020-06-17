package com.wang.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * @Author 王晋南
 * @CreateDate 2020/6/16 0016
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias(value = "Payment")
public class Payment implements Serializable {
    private Long id;
    private String serial;
}

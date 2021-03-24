package com.hyl.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author huyanlong
 * @Date 2021/3/22 13:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Integer id;
    private String serial;
}

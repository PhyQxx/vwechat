package com.phy.vwatchback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author PHY
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.phy.vwatchback.dao"})
public class VwechatBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(VwechatBackApplication.class, args);
    }

}

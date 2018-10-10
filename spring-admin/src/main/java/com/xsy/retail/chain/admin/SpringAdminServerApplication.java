package com.xsy.retail.chain.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务中心
 * Created with ai-parent
 * author hsj
 * DateTime 2018/1/30 - 11:32
 * version 1.0
 */
@SpringBootApplication(scanBasePackages = {"com.xsy.retail.chain","com.shinho"})
@EnableAdminServer
public class SpringAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAdminServerApplication.class);
    }
}

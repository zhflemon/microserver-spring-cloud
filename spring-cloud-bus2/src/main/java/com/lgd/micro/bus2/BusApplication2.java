package com.lgd.micro.bus2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Project: microserver-spring-cloud</p>
 * <p>Package: com.lgd.micro.bus</p>
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author guodong.li
 * @version 1.0.0
 * @date 2018/1/25 15:07 星期四
 */
@SpringBootApplication
@RestController
//不重启服务刷新
@RefreshScope
public class BusApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(BusApplication2.class, args);
    }

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}

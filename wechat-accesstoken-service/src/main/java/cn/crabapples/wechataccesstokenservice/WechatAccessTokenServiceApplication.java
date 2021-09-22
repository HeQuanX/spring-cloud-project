package cn.crabapples.wechataccesstokenservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WechatAccessTokenServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatAccessTokenServiceApplication.class, args);
    }

}

package icu.oo7.yyds.uaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 统一认证授权服务入口
 * @author peng.zhao
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("icu.oo7.yyds.uaa.feign")
public class UaaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UaaApplication.class, args);
    }

}

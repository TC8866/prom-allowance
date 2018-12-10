package com.netease.yanxuan.prom-allowance.assembly;

/**
 * Created by youzhihao on 2017/4/26.
 */
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * 项目启动类
 * 配置启动环境:
 * -Dspring.profiles.active=dev|test|pressure|release|online
 * @author youzhihao
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.netease.yanxuan.prom-allowance")
@EnableApolloConfig
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}

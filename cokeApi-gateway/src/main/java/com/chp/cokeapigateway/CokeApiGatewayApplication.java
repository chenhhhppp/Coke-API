package com.chp.cokeapigateway;

import com.chp.project.provider.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

@SpringBootApplication
@EnableDubbo
@Service
public class CokeApiGatewayApplication {

    @DubboReference
    private DemoService demoService;

    public static void main(String[] args) {
//        SpringApplication.run(CokeApiGatewayApplication.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(CokeApiGatewayApplication.class, args);
        CokeApiGatewayApplication application = context.getBean(CokeApiGatewayApplication.class);
        String result = application.doSayHello("kobe");
        String result2 = application.doSayHello2("KOBE");
        System.out.println("result:" + result);
        System.out.println("result2:" + result2);
    }

    public String doSayHello(String name) {
        return demoService.sayHello(name);
    }

    public String doSayHello2(String name) {
        return demoService.sayHello2(name);
    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("tobaidu", r -> r.path("/baidu")
//                        .uri("https://www.baidu.www"))
//                .route("tologi", r -> r.path("/logi")
//                        .uri("https://www.logitech.com/zh-cn"))
//                .build();
//    }
}

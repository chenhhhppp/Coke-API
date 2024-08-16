package com.chp.cokeapiinterface;

import com.chp.cokeapiclientsdk.client.cokeApiClient;
import com.chp.cokeapiclientsdk.model.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CokeApiInterfaceApplicationTests {

    // 注入一个名为 cokeApiClient 的 Bean
    @Resource
    private cokeApiClient cokeApiClient;

    // 表示这个一个测试方法
    @Test
    void contextLoads() throws Exception{
        // 调用cokeApiClient的getNameByGet方法，并传入参数"abc"，将返回的结果赋值给result变量
        String result = cokeApiClient.getNameByGet("abc");
        // 创建一个User对象
        User user = new User();
        // 设置User对象的username属性为"def"
        user.setUseranme("def");
        // 调用cokeApiClient的getUserNameByPost方法，并传入user对象作为参数，将返回的结果赋值给usernameByPost变量
        String usernameByPost = cokeApiClient.getUserNameByPost(user);
        // 打印result变量的值
        System.out.println(result);
        // 打印usernameByPost变量的值
        System.out.println(usernameByPost);
    }
}

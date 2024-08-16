package com.chp.cokeapiclientsdk;

import com.chp.cokeapiclientsdk.client.cokeApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("chp.client")
@Data
@ComponentScan
public class cokeApiClientConfig {

    private String accessKey;

    private String secretKey;

    // 创建一个名为 "cokeApiClient" 的 Bean
    @Bean
    public cokeApiClient cokeApiClient() {
        // 使用 ak 和 sk 创建一个cokeApiClient实例
        return new cokeApiClient(accessKey, secretKey);
    }
}

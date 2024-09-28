//package com.tyz.common.sys;
//
//import com.aliyun.dysmsapi20170525.Client;
//import com.aliyun.teaopenapi.models.Config;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class AliyunSmsClientConfiguration {
//
//    @Bean
//    public Client smsClient(AliyunSMSProperties properties) {
//        Config config = new Config();
//        config.setAccessKeyId(properties.getAccessKeyId());
//        config.setAccessKeySecret(properties.getAccessKeySecret());
//        config.setEndpoint(properties.getEndpoint());
//        try {
//            return new Client(config);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
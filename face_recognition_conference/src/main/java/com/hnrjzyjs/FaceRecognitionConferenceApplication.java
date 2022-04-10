package com.hnrjzyjs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @MapperScan: 找到Dao接口和Mapper文件
 *     basePackages：Dao接口所在的包名
 *
 * @EnableTransactionManagement:启用事务管理器
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages={"com.hnrjzyjs.dao"})
public class FaceRecognitionConferenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaceRecognitionConferenceApplication.class, args);
    }

}

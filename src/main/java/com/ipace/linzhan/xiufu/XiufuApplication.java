package com.ipace.linzhan.xiufu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@EnableScheduling
@MapperScan("com.ipace.linzhan.xiufu.xiuFu")
public class XiufuApplication {

	public static void main(String[] args) {
		SpringApplication.run(XiufuApplication.class, args);
	}
}

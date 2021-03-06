package com.casaba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableScheduling
@EnableAutoConfiguration
@SpringBootApplication
@MapperScan("com.casaba.dao.mapper")
public class App {
	public static void main(String[] args) throws Exception {
		
		SpringApplication.run(App.class, args);
	}


}
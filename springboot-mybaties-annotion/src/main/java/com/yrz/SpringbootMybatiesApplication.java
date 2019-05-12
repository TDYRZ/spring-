package com.yrz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yrz.mapper")
public class SpringbootMybatiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatiesApplication.class, args);
	}

}

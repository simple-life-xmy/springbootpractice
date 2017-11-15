package com.xmy.springbootpractice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xmy
 */
@SpringBootApplication
@MapperScan("com.xmy.springbootpractice.repository")
public class SpringbootpracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootpracticeApplication.class, args);
	}
}

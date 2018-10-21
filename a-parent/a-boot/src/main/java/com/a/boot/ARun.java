package com.a.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//一个@SpringBootApplication 注解相当于 @Configuration、@EnableAutoConfiguration、@ComponentScan三个注解
//@Configuration 声明这是一个配置类
//@EnableAutoConfiguration 启动自动加载配置
//@ComponentScan 扫描注册到spring容器的实例所在的包，默认全包扫描
//可以通过源码了解
@SpringBootApplication
public class ARun {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(ARun.class);
		application.run(args);
	}
}

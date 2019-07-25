package com.test.webApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages="com.test")
@EnableTransactionManagement //如果service实现类中加入事务注解@Transactional，需要此处添加该注解
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SpringApplication application = new SpringApplication(Application.class);
	        //设置启动时是否显示banner图
	        //application.setBannerMode(Banner.Mode.OFF);
	        application.run(args);
	}

}

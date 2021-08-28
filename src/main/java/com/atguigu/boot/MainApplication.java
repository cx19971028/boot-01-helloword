package com.atguigu.boot;

import com.atguigu.boot.bean.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序类
 * 这是一个Springboot应用
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        // 返回容器
        SpringApplication.run(MainApplication.class,args);
//        // 从容器中获取组件
//        Pet p1 = run.getBean("tom", Pet.class);
//        Pet p2 = run.getBean("tom", Pet.class);
//        System.out.println(p1 == p2);

    }
}

package com.atguigu.boot.config;

import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1。配hi类里边@Bean标注在方法上给容器注册组件，默认是单例
 * 2. 配置类本身也是组件
 * 3. proxyBeanMethods： 代理bean的方法
 *      Full(proxyBeanMethods = true)
 *      Lite(proxyBeanMethods = false)
 *      组件依赖
 * 配置类相当于配置文件
 */

@Configuration(proxyBeanMethods = true)  // 告诉StringBoot 这是一个配置类 == 配置文件
public class Myconfig {

    /**
     * 配置类中的注册方法返回是单例(proxyBeanMethods = true)
     * @return
     */
    @Bean // 给容器中添加组件, 以方法名作为组件的id，返回类型为组件类型。
    public User user01(){
        return new User("张三", "18");
    }

    @Bean("tom")
    public Pet tomecate(){
        return new Pet("name");
    }
}

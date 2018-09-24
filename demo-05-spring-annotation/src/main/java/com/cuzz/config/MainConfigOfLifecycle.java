package com.cuzz.config;

import com.cuzz.bean.Car;
import com.cuzz.bean.Cat;
import com.cuzz.bean.Dog;
import com.cuzz.bean.MyBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: cuzz
 * @Date: 2018/9/24 12:49
 * @Description: 配置类
 */
@Configuration
public class MainConfigOfLifecycle {

//    @Bean(initMethod = "init", destroyMethod = "destroy")
//    public Car car() {
//        return new Car();
//    }

    @Bean
    public Cat cat() {
        return new Cat();
    }

//    @Bean
//    public Dog dog() {
//        return new Dog();
//    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }
}

package com.test.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author shiguoqiang
 * 主类
 * @Description 这是一个springboot应用
 * @Date 2021/3/9 17:15
 * @Param
 * @return
 **/
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //查看容器里的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        //从容器中获取组件
        //@Configuration(proxyBeanMethods = true) 代理对象调用方法，springboot总会检查组件是否在容器中有，
        //保持组件单实例
//        User pet01 = run.getBean("user01", User.class);
//        Pet pet02 = run.getBean("tom",Pet.class);
////        System.out.println("组件名："+ (pet01==pet02));
//        System.out.println(pet01);
//
//        String[] beanNamesForType = run.getBeanNamesForType(Helpers.class);
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }

        boolean tom = run.containsBean("user01");
        System.out.println("是否包含组件"+tom);

    }
}

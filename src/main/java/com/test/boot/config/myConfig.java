package com.test.boot.config;

import com.sun.deploy.ref.Helpers;
import com.test.boot.bean.Pet;
import com.test.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author shiguoqiang
 * @Description 配置类里可以使用Bean标注在方法上来给容器注册组件，默认单实例
 * 配置类本来也是个组件
 * proxyBeanMethods 代理对象的方法，默认是true
 * @Import({User.class, Helpers.class}) 给容器自动创建出这两个类型的组件，默认组件名就是全类名
 *
 * @Date 2021/3/10 16:38
 * @Param
 * @return
 **/
@Import({User.class, Helpers.class})
@Configuration(proxyBeanMethods = true) //告诉springboot这是一个配置类
public class myConfig {

    /**
     * @Author shiguoqiang
     * @Description 外部无论对配置类中的这个组件注册方法调用多少次，获取的都是之前注册容器中的实例对象
     * @Date 2021/3/10 16:43
     * @Param com.test.boot.bean.User
     * @return
     **/

    @Bean //给容器添加组件 以方法名作为组件的id,返回类型就是组件类型，返回的值，就是组件在容器中的实例。
    public User user01(){
        User zhangsan = new User("zhangsan", 18);
        zhangsan.setPet(tomcatpet());
        return new User("zhangsan",18);
    }

//    @Bean("tom")//自定义组件名，默认方法名为组件名
    public Pet tomcatpet(){
        return new Pet("tomcatpet");
    }

}

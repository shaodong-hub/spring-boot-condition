package com.github.springbootcondition.config;

import com.github.springbootcondition.condition.ConditionClass;
import com.github.springbootcondition.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 满足当前条件,这个类中配置的所有的 bean 注册才能生效
 *
 * <p>
 * 创建时间为 17:29 2019-04-17
 * 项目名称 spring-boot-condition
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@Configuration
@Conditional(ConditionClass.class)
public class ConfigBeanClass {

    @Bean("Person1")
    public Person getPerson1() {
        return new Person("P11");
    }

    @Bean("Person2")
    public Person getPerson2() {
        return new Person("P12");
    }

}

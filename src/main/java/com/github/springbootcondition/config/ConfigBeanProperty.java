package com.github.springbootcondition.config;

import com.github.springbootcondition.condition.ConditionClass;
import com.github.springbootcondition.pojo.Person;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 满足当前条件,这个类中配置的所有的 bean 注册才能生效
 * //@Conditional 基于条件的自动配置,
 * 一般配置配合 Condition 接口一起使用, 只有接口(一个或者多个实现类)的实现类返回 true 才装配
 *
 * <p>
 * 创建时间为 17:32 2019-04-17
 * 项目名称 spring-boot-condition
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@Configuration
@Conditional(ConditionClass.class)
public class ConfigBeanProperty {

    @Bean("Person5")
    @ConditionalOnMissingBean
    public Person getPerson3() {
        return new Person("P3");
    }

    @Bean("Person6")
    @ConditionalOnProperty(name = "name.key1")
    public Person getPerson4() {
        return new Person("P4");
    }

    @Bean("Person7")
    @ConditionalOnProperty(name = "name.key2", havingValue = "123")
    public Person getPerson5() {
        return new Person("P5");
    }

    @Bean("Person8")
    @ConditionalOnProperty(prefix = "name", name = "key3", havingValue = "123")
    public Person getPerson6() {
        return new Person("P6");
    }

    @Bean("Person9")
    @ConditionalOnProperty(prefix = "name", name = {"key4", "key5"})
    public Person getPerson7() {
        return new Person("P7");
    }

    @Bean("Person10")
    @ConditionalOnProperty(prefix = "name", name = {"key6", "key7"}, havingValue = "123")
    public Person getPerson8() {
        return new Person("P8");
    }

    @Bean("Person11")
    @ConditionalOnProperty(prefix = "name", name = {"key8", "key9"}, havingValue = "123", matchIfMissing = true)
    public Person getPerson9() {
        return new Person("P9");
    }

}

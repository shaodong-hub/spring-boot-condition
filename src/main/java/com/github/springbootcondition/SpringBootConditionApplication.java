package com.github.springbootcondition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Set;

/**
 * @author shao
 * @see ConditionalOnBean （仅仅在当前上下文中存在某个对象时，才会实例化一个Bean）
 * @see ConditionalOnClass （某个class位于类路径上，才会实例化一个Bean）
 * @see ConditionalOnExpression （当表达式为true的时候，才会实例化一个Bean）
 * @see ConditionalOnMissingBean （仅仅在当前上下文中不存在某个对象时，才会实例化一个Bean）
 * @see ConditionalOnMissingClass （某个class类路径上不存在的时候，才会实例化一个Bean）
 * @see ConditionalOnNotWebApplication （不是web应用）
 * @see ConditionalOnProperty
 */
@SpringBootApplication
public class SpringBootConditionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootConditionApplication.class, args);
        Set<String> set = context.getBean(Set.class);
        for (Object o : set) {
            System.out.println(o);
        }


        context.close();

    }

}

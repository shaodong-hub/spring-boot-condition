package com.github.springbootcondition.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 在bean定义注册之前，条件会立即被检查，并且可以根据当时可以确定的任何标准自由地否决注册。
 * 条件必须遵循与 BeanFactoryPostProcessor 相同的限制，并且注意永远不要与 bean 实例交互。
 * 要对与配置 bean 交互的条件进行更细粒度的控制，请考虑 ConfigurationCondition 接口。
 *
 * <p>
 * 创建时间为 17:25 2019-04-17
 * 项目名称 spring-boot-condition
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public class ConditionDemonstration implements Condition {

    /**
     * 确定条件是否匹配。
     * 当函数返回 true 时才会生成 bean
     *
     * @param context  判断条件能使用的上下文(环境)
     * @param metadata 注释信息
     * @return 如果条件匹配且组件可以注册，或false否决带注释的组件的注册
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //1.能获取到 IOC 使用的 BeanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //2.获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        //3.获取当前环境信息
        Environment environment = context.getEnvironment();
        //4.获取到 Bean 定义的信息
        BeanDefinitionRegistry registry = context.getRegistry();
        //----------------------------------------
        String envName = environment.getProperty("os.name");
        assert envName != null;
        return envName.contains("Mac");
    }
}

package com.github.springbootcondition.config;

import com.github.springbootcondition.condition.ConditionMac;
import com.github.springbootcondition.condition.ConditionWin;
import com.github.springbootcondition.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 创建时间为 17:31 2019-04-17
 * 项目名称 spring-boot-condition
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@Configuration
public class ConfigBeanMethod {

    /**
     * 只有当 {@link ConditionMac#getMatchOutcome}返回为 true 时,才生成这个对象
     *
     * @return Person
     */
    @Conditional(ConditionMac.class)
    @Bean("Person3")
    public Person getPersonMac() {
        return new Person("PersonMac");
    }

    /**
     * 只有当 {@link ConditionWin#getMatchOutcome}返回为 true 时,才生成这个对象
     *
     * @return Person
     */
    @Conditional(ConditionWin.class)
    @Bean("Person4")
    public Person getPersonWin() {
        return new Person("PersonWin");
    }

}

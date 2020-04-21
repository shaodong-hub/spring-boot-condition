package com.github.springbootcondition.provider;

import com.github.springbootcondition.annotation.ConditionOnSystem;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * 创建时间为 下午10:32 2020/4/20
 * 项目名称 spring-boot-condition
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Component
public class ConditionProvider {

    @Bean
    @ConditionOnSystem(name = "user.name", value = "shaodong")
    public Set<String> set() {
        Set<String> set = new HashSet<>();
        set.add("1111");
        return set;
    }


}

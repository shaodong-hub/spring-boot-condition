package com.github.springbootcondition.condition;

import com.github.springbootcondition.annotation.ConditionOnSystem;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * <p>
 * 创建时间为 下午10:18 2020/4/20
 * 项目名称 spring-boot-condition
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */


public class OnConditionOnSystem implements Condition {
    @Override
    public boolean matches(@NotNull ConditionContext context, @NotNull AnnotatedTypeMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionOnSystem.class.getName());
        assert attributes != null;
        String name = String.valueOf(attributes.get("name"));
        String value = String.valueOf(attributes.get("value"));
        return StringUtils.equalsIgnoreCase(name, "user.name");
    }
}

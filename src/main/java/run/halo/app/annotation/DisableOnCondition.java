package run.halo.app.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.core.annotation.AliasFor;
import run.halo.app.model.enums.Mode;

/**
 * 该注解可以限制某些条件下禁止访问api
 * 这个切面的作用是，当一个方法上有DisableOnCondition注解，
 * 并且这个注解中的mode属性与应用的mode属性相同时，禁止访问这个方法。
 *
 * @author guqing
 * @date 2020-02-14 13:48
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DisableOnCondition {
    @AliasFor("mode")
    Mode value() default Mode.DEMO;

    @AliasFor("value")
    Mode mode() default Mode.DEMO;
}

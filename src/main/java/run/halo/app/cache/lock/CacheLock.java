package run.halo.app.cache.lock;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;
import org.springframework.core.annotation.AliasFor;

/**
 * 缓存锁注解.
 *
 * @author johnniang
 * @date 3/28/19
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface CacheLock {

    /**
     * 缓存前缀，默认为 ""
     *
     * @return cache prefix
     */
    @AliasFor("value")
    String prefix() default "";

    /**
     * 前缀别名，默认为 ""
     *
     * @return alias of prefix
     */
    @AliasFor("prefix")
    String value() default "";

    /**
     * 过期时间，默认值为 5.
     *
     * @return expired time
     */
    long expired() default 5;

    /**
     * Time unit, default is TimeUnit.SECONDS.
     *
     * @return time unit
     */
    TimeUnit timeUnit() default TimeUnit.SECONDS;

    /**
     * 分隔符，默认为 ':'
     *
     * @return delimiter
     */
    String delimiter() default ":";

    /**
     * 方法调用后是否删除缓存。默认为 true
     *
     * @return 如果在方法调用后删除缓存，则为 true;否则为 false
     */
    boolean autoDelete() default true;

    /**
     * 是否跟踪请求信息。默认为 false
     *
     * @return 如果跟踪请求信息，则为 true;否则为 false
     */
    boolean traceRequest() default false;
}

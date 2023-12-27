package run.halo.app.security.context;

import org.springframework.lang.Nullable;
import run.halo.app.security.authentication.Authentication;

/**
 * 安全上下文接口.
 *
 * @author johnniang
 */
public interface SecurityContext {

    /**
     * 获取当前经过身份验证的主体.
     *
     * @return 如果身份验证信息不可用，则返回身份验证或空值。
     */
    @Nullable
    Authentication getAuthentication();

    /**
     * 更改当前经过身份验证的主体，或删除身份验证信息。
     *
     * @param authentication 新的身份验证，如果不需要进一步的身份验证，则为null
     * not be stored
     */
    void setAuthentication(@Nullable Authentication authentication);

    /**
     * 检查当前上下文是否已经进行了身份验证
     *
     * @return 如果验证成功，则返回true；否则返回false。
     */
    default boolean isAuthenticated() {
        return getAuthentication() != null;
    }
}

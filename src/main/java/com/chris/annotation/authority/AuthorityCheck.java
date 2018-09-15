package com.chris.annotation.authority;

import java.lang.annotation.*;

/**
 * YuedaoApi
 * com.yuedao.library.annotation
 * Created by Chris Chen
 * 2017/9/20
 * Explain:验证身份权限
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface AuthorityCheck {
}

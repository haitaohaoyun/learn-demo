package com.cuzz.annotation;

import java.beans.Transient;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: cuzz
 * @Date: 2019/4/19 22:01
 * @Description:
 */
@Retention( RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface NotThreadSafe {
}

package com.lijie.webSite1;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by lj on 16-3-5.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Anot {
    public String value() default "";
}

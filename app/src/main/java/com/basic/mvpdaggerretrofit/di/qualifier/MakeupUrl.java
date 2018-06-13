package com.basic.mvpdaggerretrofit.di.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by manu on 6/12/2018.
 */

@Qualifier
@Documented
@Retention(RUNTIME)
public @interface MakeupUrl {

}
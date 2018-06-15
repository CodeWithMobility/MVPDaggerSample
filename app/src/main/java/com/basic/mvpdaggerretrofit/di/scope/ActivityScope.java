package com.basic.mvpdaggerretrofit.di.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 * Created by manu on 6/12/2018.
 */

@Scope
@Retention(RUNTIME)
public @interface ActivityScope {
}

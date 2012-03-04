package com.chetty.licence;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Babji, Chetty.
 */
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.METHOD)
public @interface LicenceRequired {}
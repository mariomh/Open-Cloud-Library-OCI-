package org.oci.data.tables;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface KeyElement {
	
	public boolean isPrimary() default true;
	
	public String keyName() default "";

}

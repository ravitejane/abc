package validator;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Documented
@Constraint(validatedBy=PhoneValidator.class)
@Target({java.lang.annotation.ElementType.FIELD,java.lang.annotation.ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {

	
	String message() default "{Phone}";
    
    Class<?>[] groups() default {};
     
    Class<? extends Payload>[] payload() default {};
	
}

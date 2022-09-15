package dsw.RCVeiculos.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = UniqueCPFValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueCPF {
    String message() default "CPF ja foi cadastrado.";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
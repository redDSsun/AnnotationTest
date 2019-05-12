import javax.annotation.Resource;
import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Validation {
    int min() default 0;
    int max() default 1000;
    String value() default "";
}

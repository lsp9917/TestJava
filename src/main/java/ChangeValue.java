import java.lang.annotation.*;

/**
 * @author laishaopeng_zz
 */

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ChangeValue {
    String value();
}

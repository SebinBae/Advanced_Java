package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 리플랙션을 이용해서 어노테이션 정보를 얻기 위해 RUNTIME 열거 상수를 사용함.
@Retention(RetentionPolicy.RUNTIME)
// 적용 대상으로 메소드를 지정함.
@Target({ElementType.METHOD})
public @interface Custom_Logging {
}

package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;

// 리플랙션을 이용해서 어노테이션 정보를 얻기 위해 RUNTIME 열거 상수를 사용함.
@Retention(RetentionPolicy.RUNTIME)
// 적용 대상으로 메소드를 지정함.
@Target({ElementType.METHOD})
@interface Custom_Logging {
}

class Service {

    @Custom_Logging
    public void method1(int v1,int v2){
        System.out.println("v1 + v2 = " + (v1 + v2));
    }

    @Custom_Logging
    public void method2(int v3, int v4, int v5){
        System.out.println("v3 + v4 + v5 = " + (v3 + v4 + v5));
    }
}

public class Custom_loggings {

    public static void main(String[] args){

        // 백엔드 40기 배세빈 4주차 2번 문제 제출
        // 위에서 작성한 Service 클래스의 메소드를 코드에서 자체적으로 가져와서 리플랙션함.
        Method[] method = Service.class.getDeclaredMethods();
        List<Parameter[]> parameters = new ArrayList<>();

            for(int i = 0; i< method.length; i++){
                System.out.print("메소드 이름 " + (i+1) + " :" + method[i]);
                System.out.println();
            }

            // 매개 변수를 가져옴
            for(int j = 0; j< method.length; j++){
                parameters.add(method[j].getParameters());
            }
            System.out.print("앞에서부터 각 메소드의 매개변수임. ");
            parameters.stream().forEach(s -> System.out.print(Arrays.toString(s)));
    }


    }

package java_version_changers;

import java.util.*;

public class Java_String_exercise {

    public static void main(String[] args){

        // String.join() - String의 정적 메소드로 문자열 배열이나 컬렉션을 하나의 문자열로 합칠 때(구분자 포함) 사용함
        String str1 = String.join(",", "a", "b", "c", "d");
        System.out.println(str1);

        String str2 = String.join(",", List.of("a","b","c"));
        System.out.println(str2);

        // isBlanked() - 문자열이 비어있거나 공백만 포함하는지 확인.
        System.out.println("".isBlank());        // true
        System.out.println("   ".isBlank());     // true
        System.out.println("Hello".isBlank());   // false

        // strip() - trim()의 개선판임. strip() 계열은 유니코드 공백도 제거가 가능함.

        System.out.println("   abc   ".strip());
        System.out.println("   abc   ".stripLeading());
        System.out.println("   abc   ".stripTrailing());
        // lines() - 문자열을 줄 단위로 나눠서 Stream<String> 반환, 개행 문자를 기준으로 split함.
        String text = "A\nB\nC";
        text.lines().forEach(System.out::println);

        // repeat()
        System.out.println("abc".repeat(3));

        // """ 등장!

        String textBlock = """
                Hello, \s
                world!
                world!
                """;

        // String.transform
        String str6 = "hello";
        String result = str6.transform(s -> s.toUpperCase());
        System.out.println(result);

        // String.transfrom chaining
        String result2 = str6.transform(s -> s.toUpperCase()).transform(s -> s + "world");
        System.out.println(result2);

        // String.formatted
        String formattedString = "My name is %s I am %d years old.".formatted("Join", 30);
        System.out.println(formattedString);

        Map<String, Integer> map = Map.of("apple", 1, "banana", 2, "cherry", 3);
        map.forEach((k, v) -> System.out.println("I'm %s : %d age".formatted(k,v)));
    }

}

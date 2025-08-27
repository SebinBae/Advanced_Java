package model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream_Exercise {

    public static void main(String[] args){

        // filter 예시(사용자 정의) -> 조건에 맞는 요소만 걸러냄
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> evennumbers = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());

        System.out.println(evennumbers);

        // filter 예시(IntStream의 rangeClose() 메소드 사용)
        List<Integer> numberss = IntStream.rangeClosed(1,10).boxed().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println(numberss);

        // map 예시 -> 기존의 요소를 조건에 맞는 새로운 요소로 대체함
        List<String> names = List.of("배세빈", "배서빈", "배수빈", "배거빈","배재빈", "배성빈");
        List<List<String>> name_Lengths = names.stream().map(s -> List.of((s.split("")))).toList();
        System.out.println(name_Lengths);

        // sorted() 예시
        List<String> nums = List.of("김세빈","나세빈","다세빈","라세빈","배세빈","다세빈");
        System.out.println(nums);

        List<String> numss = nums.stream().sorted().toList();
        System.out.println(numss);

        // forEach 예시
        nums.stream().forEach(s -> System.out.print(s));
        // 메소드 참조
        nums.stream().forEach(System.out :: println);

        // count() 예시
        Long stream_size = nums.stream().count();
        System.out.println(stream_size + "개 요소가 있음");

        // anymatch() 예시
        boolean anyMatch = nums.stream().anyMatch(name -> name.equals("배세빈"));
        System.out.println("이름이 배세빈인 요소가 하나라도 있나요? " + anyMatch);

        // noneMatch() 예시
        boolean noneMatch = nums.stream().noneMatch(name -> name.equals("배세빈"));
        System.out.println("이름이 배세빈인 요소가 하나라도 있으면 거짓이라고 말해주세요!" + noneMatch);

        // allMatch() 예시
        boolean allMatch = nums.stream().allMatch(name -> name.equals("배세빈"));
        System.out.println("이름이 배세빈인 요소로 요소가 전부 채워져 있으면 true라고 말해주세요! " + allMatch);

        // Optional 클래스 타입 가져오기
        int min = IntStream.rangeClosed(1,100).min().getAsInt();
        System.out.println("1부터 100중에서 최소값은 : " + min);


    }
}

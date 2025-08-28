package four_week_task;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class File_Stream_Control {

    // 백엔드 40기 배세빈 3번 문제 풀이

    public static void main(String[] args){

        // 파일 경로를 가져오기 위해서 Path 인터페이스를 선언하고 구현 객체로 Paths.get(절대 경로)를 대입
        Path filePath = Paths.get("src/king_sejong");

        try{
            // 스트림을 이용해서 대문자로 표시하기 위해서 Files.lines() 메소드 사용 -> Stream<String> 반환
            List<String> upperLines = Files.lines(filePath).map(String::toUpperCase).collect(Collectors.toList());

            // Files.write() 메소드 시그니처는 (Path 타입 객체 , Iterable 객체, OpenOption들임...)
            Files.write(filePath, upperLines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);


        } catch (IOException e) {
            e.printStackTrace();
        }

        // main 끝
    }


}

package four_week_task;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class File_Stream_Control {

    // 백엔드 40기 배세빈 3번 문제 풀이

    public static void main(String[] args){
        try(Stream<String> lines = Files.lines(Paths.get("king_sejong"))){
            lines.forEach(s -> s.toUpperCase());

        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}

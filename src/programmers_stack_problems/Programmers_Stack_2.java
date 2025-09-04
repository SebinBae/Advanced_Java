package programmers_stack_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_Stack_2 {

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        double[] end_progresses = new double[progresses.length];

        // 작업 종료일 계산하는 배열
        for(int i = 0; i < progresses.length; i++){
            end_progresses[i] = Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }

        // queue를 통해서 핵심 로직 작성
        // 앞에 있는 요소가 먼저 나가되, 요소 값 보다 뒤에 있는 요소값이 작다면 count 올림.

        int counter = 1;

        for(int i = 0; i< end_progresses.length-1; i++){
            for(int j = 1; j < end_progresses.length; j++){
                if(end_progresses[i] >= end_progresses[j]){
                    counter += 1;
                }
                else{
                    break;
                }
            }

            list.add(counter);
            counter = 1;
        }

        answer = list.stream().mapToInt(s -> s.intValue()).toArray();

        return answer;
    }

    public static void main(String[] args){

            int[] progresses = {95, 90, 99, 99, 80, 99};
            int[] speeds = {1, 1, 1, 1, 1, 1};
            System.out.println(Arrays.toString(solution(progresses, speeds)));
    }

}

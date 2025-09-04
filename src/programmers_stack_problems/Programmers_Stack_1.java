package programmers_stack_problems;

import java.util.Arrays;
import java.util.Stack;

public class Programmers_Stack_1 {
    public static int[] solution(int []arr) {
        int[] answer = {};

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i< arr.length; i++){
            if(!stack.isEmpty() && stack.peek() == arr[i]) continue;
            else stack.push(arr[i]);
        }

        answer = stack.stream().mapToInt(s -> s.intValue()).toArray();

        return answer;
    }

    public static void main(String[] args){

        int[] arr = {4,4,4,3,3};
        System.out.println(Arrays.toString(solution(arr)));
    }
}

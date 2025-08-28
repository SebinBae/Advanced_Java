package three_week_optional_task;

import java.util.*;
import java.util.stream.Collectors;

public class Lotto_Program {

    public static void main(String[] args){

        // 백엔드 40기 배세빈 3주차 선택 과제 1번

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        // 결과적으로 당첨된 복권은 하나임으로 List를 이용해서 미리 뽑아놓음
        List<Integer> first_lotto_list = new ArrayList<>();
        while(first_lotto_list.size() < 6){
            first_lotto_list.add(random.nextInt(45) +1);
            first_lotto_list = first_lotto_list.stream().sorted().distinct().collect(Collectors.toList());
        }

        System.out.println("[로또 당첨 프로그램]");
        System.out.println();

        System.out.print("로또 개수를 입력해 주세요. (숫자 1 ~ 10):");
        String lotto_num = scanner.nextLine();
        int int_lotto_num = Integer.parseInt(lotto_num);
        // 일치하는 로또 번호를 저장할 배열 선언
        int correct_lotto_num = 0;

        StringBuffer sb = new StringBuffer();
        StringBuffer sd = new StringBuffer();

        for(int i = 0; i< int_lotto_num; i++){
            List<Integer> temp_lotto = new ArrayList<>();

            while(temp_lotto.size() < 6){
                temp_lotto.add(random.nextInt(45) + 1);
                temp_lotto = temp_lotto.stream().sorted().distinct().collect(Collectors.toList());
            }
                for (int j = 0; j < 6; j++) {
                    int compare_num = first_lotto_list.get(j);
                    for (int k = 0; k < 6; k++) {
                        if (compare_num == temp_lotto.get(k))
                            correct_lotto_num++;
                    }
                }
                String s = "";
                for(int w = 0; w < temp_lotto.size(); w++){
                    if(w == (temp_lotto.size() - 1)) {
                        s = (s + temp_lotto.get(w));
                        break;
                    }
                    s = s + temp_lotto.get(w) + ", ";
                }
                int sequence = 65;
                sb.append((char)(sequence+ i) + "\t" + s).append("\n");
                sd.append((char)(sequence+ i) + "\t" + s + " => " + correct_lotto_num + "개 일치").append("\n");

            correct_lotto_num = 0;
        }
        System.out.println(sb.toString());
        System.out.println("[로또 발표]");
        System.out.println(first_lotto_list);
        System.out.println();
        System.out.println("[내 로또 결과]");
        System.out.println(sd.toString());

        // main 메소드 끝
        }


    }


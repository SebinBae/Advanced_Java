package three_week_optional_task;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Annual_Income_Tax_calculator {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        int annual_income = Integer.parseInt(scanner.nextLine());

        int tax_from_tax_ratio = 0;
        // 세금 계산 방법 switch Expression
        int tax_from_Progressive_deduction = 0;

        // 1200만원 이하인 경우 6%
        if(annual_income <= 12000000){
            under_12million(annual_income);
        }

        // 1200만원 초과 4600원 이하인 경우 15%
        else if((12000000 < annual_income) && (annual_income <= 46000000)){
            over_12million_under_46million(annual_income);
        }

        // 4600만원 초과 8800만원 이하인 경우 24%
        else if((46000000 < annual_income) && (annual_income <= 88000000)){
            over_46million_under_88million(annual_income);
        }

        // 8800만원 초과 1억5천만원 이하인 경우 세율 : 35%
        else if((88000000 < annual_income) && (annual_income <= 150000000)){
            over_88million_under_150million(annual_income);
        }

        // 1억 5천만원 초과 3억원 이하인 경우 세율 : 38%
        else if((150000000 < annual_income) && (annual_income <= 300000000)){
            over_150million_under_300million(annual_income);
        }

        // 3억원 초과 5억원 이하인 경우 세율 : 40%
        else if((300000000 < annual_income) && (annual_income <= 500000000)){
            over_300million_under_500million(annual_income);
        }

        // 5억원 초과 10억원 이하인 경우 세율 : 42%
        else if((500000000 < annual_income) && (annual_income <= 1000000000)){
            over_500million_under_1billion(annual_income);
        }

        // 10억원 초과 45%
        else{
            over_1_billion_income(annual_income);
        }



        // main 함수 끝
    }

    private static void under_12million(int annual_income) {
        int tax_from_Progressive_deduction;
        int tax_from_tax_ratio;
        tax_from_tax_ratio = annual_income * 6 / 100;
        tax_from_Progressive_deduction = tax_from_tax_ratio;

        System.out.printf("%10d *%3d%% = %9d \n", annual_income, 6,tax_from_tax_ratio);
        System.out.println();
        System.out.printf("[세율에 의한 세금]: %17d \n",tax_from_tax_ratio);
        System.out.printf("[누진공제 계산에 의한 세금]: %10d",tax_from_Progressive_deduction);
    }

    private static void over_12million_under_46million(int annual_income) {
        int tax_from_Progressive_deduction;
        int tax_from_tax_ratio;
        int divide_money = annual_income - 12000000;
        int fixed_pay_money = 12000000 * 6 / 100;
        tax_from_tax_ratio = fixed_pay_money + (divide_money * 15 / 100);
        tax_from_Progressive_deduction = tax_from_tax_ratio;

        System.out.printf("%10d *%3d%% = %9d \n", 12000000, 6,fixed_pay_money);
        System.out.printf("%10d *%3d%% = %9d \n", divide_money, 15,tax_from_tax_ratio);
        System.out.println();
        System.out.printf("[세율에 의한 세금]: %17d \n",tax_from_tax_ratio);
        System.out.printf("[누진공제 계산에 의한 세금]: %10d",tax_from_Progressive_deduction);
    }

    private static void over_46million_under_88million(int annual_income) {
        int tax_from_Progressive_deduction;
        int tax_from_tax_ratio;
        int divide_money1 = annual_income - 12000000;
        int fixed_pay_money1 = 12000000 * 6 / 100;

        int divide_money2 = divide_money1 - 34000000;
        int fixed_pay_money2 = 34000000 * 15 / 100;

        tax_from_tax_ratio = fixed_pay_money1 + fixed_pay_money2 + (divide_money2 * 24 / 100);
        tax_from_Progressive_deduction = tax_from_tax_ratio;

        System.out.printf("%10d *%3d%% = %9d \n", 12000000, 6,fixed_pay_money1);
        System.out.printf("%10d *%3d%% = %9d \n", 34000000, 15,fixed_pay_money2);
        System.out.printf("%10d *%3d%% = %9d \n", divide_money2, 24,(divide_money2 * 24 / 100));

        System.out.println();
        System.out.printf("[세율에 의한 세금]: %17d \n",tax_from_tax_ratio);
        System.out.printf("[누진공제 계산에 의한 세금]: %10d",tax_from_Progressive_deduction);
    }

    private static void over_88million_under_150million(int annual_income) {
        int divide_money1 = annual_income - 12000000;
        int fixed_pay_money1 = 12000000 * 6 / 100;

        int divide_money2 = divide_money1 - 34000000;
        int fixed_pay_money2 = 34000000 * 15 / 100;

        long divide_money3 = divide_money2 - 42000000;
        long fixed_pay_money3 = 42000000 * 24 / 100;

        long tax_from_tax_ratio_L = fixed_pay_money1 + fixed_pay_money2 + fixed_pay_money3 + (divide_money3 * 35 / 100);
        long tax_from_Progressive_deduction_L = tax_from_tax_ratio_L;

        System.out.printf("%10d *%3d%% = %9d \n", 12000000, 6,fixed_pay_money1);
        System.out.printf("%10d *%3d%% = %9d \n", 34000000, 15,fixed_pay_money2);
        System.out.printf("%10d *%3d%% = %9d \n", 42000000, 24,fixed_pay_money3);
        System.out.printf("%10d *%3d%% = %9d \n", divide_money3, 35,(divide_money3 * 35 / 100));

        System.out.println();
        System.out.printf("[세율에 의한 세금]: %17d \n",tax_from_tax_ratio_L);
        System.out.printf("[누진공제 계산에 의한 세금]: %10d",tax_from_Progressive_deduction_L);
    }

    private static void over_150million_under_300million(int annual_income) {
        int divide_money1 = annual_income - 12000000;
        int fixed_pay_money1 = 12000000 * 6 / 100;

        int divide_money2 = divide_money1 - 34000000;
        int fixed_pay_money2 = 34000000 * 15 / 100;

        long divide_money3 = divide_money2 - 42000000;
        long fixed_pay_money3 = 42000000 * 24 / 100;

        long divide_money4 = divide_money3 - 62000000;
        long fixed_pay_money4 = (long)62000000 * 35 / 100;

        long tax_from_tax_ratio_L = fixed_pay_money1 + fixed_pay_money2 + fixed_pay_money3 + fixed_pay_money4 +((long)divide_money4 * 38 / 100);
        long tax_from_Progressive_deduction_L = tax_from_tax_ratio_L;

        System.out.printf("%10d *%3d%% = %9d \n", 12000000, 6,fixed_pay_money1);
        System.out.printf("%10d *%3d%% = %9d \n", 34000000, 15,fixed_pay_money2);
        System.out.printf("%10d *%3d%% = %9d \n", 42000000, 24,fixed_pay_money3);
        System.out.printf("%10d *%3d%% = %9d \n", 62000000, 35,fixed_pay_money4);
        System.out.printf("%10d *%3d%% = %9d \n", divide_money4, 40,((long)divide_money4 * 38 / 100));

        System.out.println();
        System.out.printf("[세율에 의한 세금]: %17d \n",tax_from_tax_ratio_L);
        System.out.printf("[누진공제 계산에 의한 세금]: %10d",tax_from_Progressive_deduction_L);
    }

    private static void over_300million_under_500million(int annual_income) {
        int divide_money1 = annual_income - 12000000;
        int fixed_pay_money1 = 12000000 * 6 / 100;

        int divide_money2 = divide_money1 - 34000000;
        int fixed_pay_money2 = 34000000 * 15 / 100;

        long divide_money3 = divide_money2 - 42000000;
        long fixed_pay_money3 = 42000000 * 24 / 100;

        long divide_money4 = divide_money3 - 62000000;
        long fixed_pay_money4 = (long)62000000 * 35 / 100;

        long divide_money5 = (long)divide_money4 - 150000000;
        long fixed_pay_money5 = (long)150000000 * 38 / 100;

        long tax_from_tax_ratio_L = fixed_pay_money1 + fixed_pay_money2 + fixed_pay_money3 + fixed_pay_money4 + fixed_pay_money5 +(divide_money5 * 40 / 100);
        long tax_from_Progressive_deduction_L = tax_from_tax_ratio_L;

        System.out.printf("%10d *%3d%% = %9d \n", 12000000, 6,fixed_pay_money1);
        System.out.printf("%10d *%3d%% = %9d \n", 34000000, 15,fixed_pay_money2);
        System.out.printf("%10d *%3d%% = %9d \n", 42000000, 24,fixed_pay_money3);
        System.out.printf("%10d *%3d%% = %9d \n", 62000000, 35,fixed_pay_money4);
        System.out.printf("%10d *%3d%% = %9d \n", 150000000, 38,fixed_pay_money5);
        System.out.printf("%10d *%3d%% = %9d \n", divide_money5, 40,(divide_money5 * 40 / 100));

        System.out.println();
        System.out.printf("[세율에 의한 세금]: %17d \n",tax_from_tax_ratio_L);
        System.out.printf("[누진공제 계산에 의한 세금]: %10d",tax_from_Progressive_deduction_L);
    }

    private static void over_500million_under_1billion(int annual_income) {
        int divide_money1 = annual_income - 12000000;
        int fixed_pay_money1 = 12000000 * 6 / 100;

        int divide_money2 = divide_money1 - 34000000;
        int fixed_pay_money2 = 34000000 * 15 / 100;

        long divide_money3 = divide_money2 - 42000000;
        long fixed_pay_money3 = 42000000 * 24 / 100;

        long divide_money4 = divide_money3 - 62000000;
        long fixed_pay_money4 = (long)62000000 * 35 / 100;

        long divide_money5 = (long)divide_money4 - 150000000;
        long fixed_pay_money5 = (long)150000000 * 38 / 100;

        long divide_money6 = divide_money5 - 200000000;
        long fixed_pay_money6 = (long)200000000 * 40 / 100;

        long tax_from_tax_ratio_L = fixed_pay_money1 + fixed_pay_money2 + fixed_pay_money3 + fixed_pay_money4 + fixed_pay_money5 + fixed_pay_money6 +(divide_money6 * 42 / 100);
        long tax_from_Progressive_deduction_L = tax_from_tax_ratio_L;

        System.out.printf("%10d *%3d%% = %9d \n", 12000000, 6,fixed_pay_money1);
        System.out.printf("%10d *%3d%% = %9d \n", 34000000, 15,fixed_pay_money2);
        System.out.printf("%10d *%3d%% = %9d \n", 42000000, 24,fixed_pay_money3);
        System.out.printf("%10d *%3d%% = %9d \n", 62000000, 35,fixed_pay_money4);
        System.out.printf("%10d *%3d%% = %9d \n", 150000000, 38,fixed_pay_money5);
        System.out.printf("%10d *%3d%% = %9d \n", 200000000, 40,fixed_pay_money6);
        System.out.printf("%10d *%3d%% = %9d \n", divide_money6, 45,(divide_money6 * 42 / 100));

        System.out.println();
        System.out.printf("[세율에 의한 세금]: %17d \n",tax_from_tax_ratio_L);
        System.out.printf("[누진공제 계산에 의한 세금]: %10d",tax_from_Progressive_deduction_L);
    }

    private static void over_1_billion_income(int annual_income) {
        int divide_money1 = annual_income - 12000000;
        int fixed_pay_money1 = 12000000 * 6 / 100;

        int divide_money2 = divide_money1 - 34000000;
        int fixed_pay_money2 = 34000000 * 15 / 100;

        long divide_money3 = divide_money2 - 42000000;
        long fixed_pay_money3 = 42000000 * 24 / 100;

        long divide_money4 = divide_money3 - 62000000;
        long fixed_pay_money4 = (long)62000000 * 35 / 100;

        long divide_money5 = (long)divide_money4 - 150000000;
        long fixed_pay_money5 = (long)150000000 * 38 / 100;

        long divide_money6 = divide_money5 - 200000000;
        long fixed_pay_money6 = (long)200000000 * 40 / 100;

        long divide_money7 = divide_money6 - 500000000;
        long fixed_pay_money7 = (long)500000000 * 42 / 100;

        long tax_from_tax_ratio_L = fixed_pay_money1 + fixed_pay_money2 + fixed_pay_money3 + fixed_pay_money4 + fixed_pay_money5 + fixed_pay_money6 + fixed_pay_money7 +(divide_money7 * 45 / 100);
        long tax_from_Progressive_deduction_L = tax_from_tax_ratio_L;

        System.out.printf("%10d *%3d%% = %9d \n", 12000000, 6,fixed_pay_money1);
        System.out.printf("%10d *%3d%% = %9d \n", 34000000, 15,fixed_pay_money2);
        System.out.printf("%10d *%3d%% = %9d \n", 42000000, 24,fixed_pay_money3);
        System.out.printf("%10d *%3d%% = %9d \n", 62000000, 35,fixed_pay_money4);
        System.out.printf("%10d *%3d%% = %9d \n", 150000000, 38,fixed_pay_money5);
        System.out.printf("%10d *%3d%% = %9d \n", 200000000, 40,fixed_pay_money6);
        System.out.printf("%10d *%3d%% = %9d \n", 500000000, 42,fixed_pay_money7);
        System.out.printf("%10d *%3d%% = %9d \n", divide_money7, 45,(divide_money7 * 45 / 100));

        System.out.println();
        System.out.printf("[세율에 의한 세금]: %17d \n",tax_from_tax_ratio_L);
        System.out.printf("[누진공제 계산에 의한 세금]: %10d",tax_from_Progressive_deduction_L);
    }

}

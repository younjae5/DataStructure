package chap01;
import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int n = stdIn.nextInt();
//        if(n > 0){
//            System.out.println("이 수는 양수입니다.");
//        }else if(n <0){
//            System.out.println("이 수는 음수입니다.");
//        }else
//            System.out.printf("이 수는 0입니다");
        if(n == 1){
            System.out.println("1입니다.");
        }else if(n == 2)
            System.out.printf("2입니다.");
        else if(n == 3)
            System.out.println("3입니다");
        else ;//공백문(실제로 아무 일도 하지 않는 문장)
    }

}

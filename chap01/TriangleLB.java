package chap01;
import java.util.Scanner;
//이등변삼각형 출력

public class TriangleLB {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다");
        do{
            System.out.println("몇 단 삼각형입니까? : ");
            n = in.nextInt();
        }while(!(n>0));

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

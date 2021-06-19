import java.util.Scanner;

public class bj1547{
    public static void main(String[] args) {
        //System.out.println("50 이하의 카운트 입력");
        
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        while (cnt > 50){
            //System.out.println("50 초과");
            cnt = sc.nextInt();
        }

        int[] balls = {1,0,0};

        int chg1, chg2, tmp;

        while(cnt>0){
            //System.out.println("바꿀 두개 입력");
            chg1 = sc.nextInt()-1;
            chg2 = sc.nextInt()-1;

            while(chg1>2){
            //     System.out.println("3이하의 숫자");
                chg1 = sc.nextInt();
            }
            while(chg2>2){
            //    System.out.println("3이하의 숫자");
                chg1 = sc.nextInt();
            }
            while(chg2==chg1){
            //    System.out.println("바꾸려는게 같습니다");
                chg1 = sc.nextInt();
            }
            
            tmp = balls[chg2];
            balls[chg2] = balls[chg1];
            balls[chg1] = tmp;

            cnt--;
        }
        for(int i = 0; i<3; i++){
            if(balls[i]==1){
                System.out.print(i+1);
            }
        }
    }
}

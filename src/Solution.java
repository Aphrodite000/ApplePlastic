import java.util.Scanner;

public class Solution {
    //要恰好买n个,8个一袋，6个一袋
    //n=6x+8y;  y>x; ，输出x+y的最小值，否则输出-1
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>=1&&n<=100){
            int sum=0;
            int min=0;
            for(int a=0;a<=n;a++){
                for(int b=0;b<=n;b++){
                    if(a*6+b*8==n){
                        sum=a+b;
                        if(min!=0){
                            if(min>sum){
                                min=sum;
                            }
                        }else{
                            min=sum;
                        }
                    }

                }
            }
            if(min==0){
                System.out.println("-1");
            }else{
                System.out.println(min);
            }
        }
    }
}
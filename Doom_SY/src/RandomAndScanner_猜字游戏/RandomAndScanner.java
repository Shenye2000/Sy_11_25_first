package RandomAndScanner_猜字游戏;

import java.util.Random;
import java.util.Scanner;

public class RandomAndScanner {

    /*
    * 猜字游戏  通过判断大小 逐渐接近随机数 直到猜中为止
    * */

    public void GetRandom(){

        Random random=new Random();
       int rd=random.nextInt(51);
        Scanner scanner=new Scanner(System.in);
        int num=0;
        while (true){

            System.out.print("请输入猜测的数字:");

            num=scanner.nextInt();

            if(num>rd){ System.out.println("猜大了");

            }else  if(num<rd){ System.out.println("猜小了"); }

            else { System.out.println("猜中游戏结束！"); }
        }


    }
}

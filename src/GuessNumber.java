import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        //1.通过Random类中方法nextInt（），生成一个1-100之间的随机数
        int randomNumber = new Random().nextInt(100);
        System.out.println("随机数已生成！");
        //2.输入猜的数字
        System.out.println("----请输入您猜的数字：----");
        Scanner sc = new Scanner(System.in);
        int enterNumber = sc.nextInt();
        //3.通过while循环，进行猜数字对错判断
        //猜对，跳出循环，游戏结束
        while(enterNumber != randomNumber){
            //猜错了，根据结果，给出提示，接着猜数字，游戏继续
            if(enterNumber>randomNumber) {
                //如果猜大了，打印sorry，您猜大了!继续下一次循环
                System.out.println("sorry，您猜大了!继续下一次循环");
            }else {
                //如果猜小了，打印sorry，您猜小了!继续下一次循环
                System.out.println("sorry，您猜小了!继续下一次循环");
            }
            //输入猜的数字
            System.out.println("----请输入您猜的数字：----");
            enterNumber = sc.nextInt();
        }
        System.out.println("恭喜您，答对了！");
    }
}
import java.util.Scanner;
public class leapyear {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个年份");
        long year;
        try {
            year = scan.nextLong();
            if (year%4==0&&year%100!=0||year%400==0){
                System.out.print(year+"是闰年！");
            }else {
                System.out.print(year+"不是闰年！");
            }
        }catch (Exception e){
            System.out.print("您输入的不是有效的年份！");
        }
    }
}

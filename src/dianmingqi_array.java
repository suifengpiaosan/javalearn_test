import java.util.Random;
import java.util.Scanner;

public class dianmingqi_array {
    public static void main(String[] args) {
        System.out.println("--------随机点名器--------");
        // 创建一个存储多个同学名字的容器（数组）
        String[] students = new String[3];

        //1.存储全班同学名字
        //2.打印全班同学每一个人的名字
        //3.获取随机点名到的学生姓名，并打印
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<students.length;i++)
        {
            System.out.println("存储第" + i + "个名称：");
            students[i] = sc.next();
        }
        for(int i = 0;i<students.length;i++)

        {
            String name = students[i];
            System.out.println("第"+i+"个学生名称：" + name);
        }
            int index = new Random().nextInt(students.length);
            //通过随机索引从数组中获取名称
            String name = students[index];

    }


}

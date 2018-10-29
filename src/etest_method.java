import java.util.Scanner;
public class etest_method {
    public static void main(String[] args) {
        int area = getArea(3, 5); // 调用 getArea方法
        System.out.println(" The area is " + area);
    }

    // 下面定义了一个求矩形面积的方法，接收两个参数，其中x为高，y为宽
    public static int getArea(int x, int y) {
        int temp = x * y; // 使用变量temp记住运算结果
        return temp; // 将变量temp的值返回
    }
    public static void printRect(){
        //打印3行星
        for (int i=0; i<3; i++) {
            //System.out.println("***"); 相当于是打印3颗星，换行
            //每行打印3颗星
            for (int j=0; j<3; j++) {
                System.out.print("*");  // ***
            }
            System.out.println();
        }
    }
    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }
    public static void printRect2(int m, int n){
        //打印M行星
        for (int i=0; i<m; i++) {
            //每行中打印N颗星
            for (int j=0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static double getAvg(double a, double b, double c) {
        double result = (a + b + c) / 3;
        return result;
    }
}


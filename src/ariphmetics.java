import java.util.Scanner;

public class ariphmetics {
    public static void main(String[] args) {
        int a=5, b=7;
        int c=a+b;

        short d = (short)(c+5+a+7);

        System.out.println(d);

        float a1 = 5.8f, b1 = 7.6f;
        double c1 = a1 - b1;
        System.out.println(c1);
        int d1 = (int)(a1-b1); //вычитаем скобки вторые, затем приводим к целочисленному значению
        System.out.println(d1);

        //вычислим периметр прямоугольника
        double x,y;
        Scanner in = new Scanner(System.in);

        System.out.println("x = "); x = in.nextDouble();
        System.out.println("y = "); y = in.nextDouble();

        double z = 2*(x+y);

        System.out.println(z);
        in.close();
        // a += 5; увеличение a на 5
        //b -= 3; //уменьшение b на 3
        //c *= 2; // увеличение c в 2 раза
        //d /= 4; // уменьшение d в 4 раза

    }
}

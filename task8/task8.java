package task8;

import static java.lang.Math.*;

public class task8 {
    public static void main(String[] args) {
        isTriangle(-5, 1,7,-4,3,7);

    }
    static void isTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        double a = sqrt(pow(x1-x2,2)+pow((y1-y2),2));
        double b = sqrt(pow(x2-x3,2)+pow((y2-y3),2));
        double c = sqrt(pow(x1-x3,2)+pow((y1-y3),2));

        if ((a+b)>c&&(a+c)>b&&(b+c)>a){
            if ((a*a==b*b+c*c)||(b*b==c*c+a*a)||(c*c==a*a+b*b)) System.out.println("Данные точки являются вершинами прямоугольного треугольника");
            else System.out.println("Данные точки являются вершинами  треугольника");
        }
        else System.out.println("Данные точки не являются вершинами треугольника");
    }
}


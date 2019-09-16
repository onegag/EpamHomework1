package task1;

public class Task1 {
    public static void main(String[] args) {
        ifEqual(1,2,2);
        ifEqual(2,2,2);
        ifEqual(1,2321321,2);
        ifEqual(1,2,1);
        ifEqual( 3,3,2777777);

    }

    static void ifEqual(int a, int b, int c){
        if (a==b){
            if(b==c) System.out.println("All numbers are equal");
            else System.out.println("First number equals second one, but third differs from them");
        }
        else if (b==c) System.out.println("Third number equals second one, but first differs from them");
        else if (c==a) System.out.println("Third number equals first one, but second differs from them");
        else System.out.println("All numbers are different");
    }
}

package task7;

public class task7 {
    public static void main(String[] args) {

        change(6,5);
    }
    static void change(int a, int b){
        a+=b;
        b=a-b;
        a=a-b;
     System.out.println(a+" "+b);
    }
}

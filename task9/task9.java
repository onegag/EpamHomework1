package task9;

public class task9 {
    public static void main(String[] args) {
        howManyHeads(500);

    }
    static void howManyHeads(int n){
        int h =3;
        if (n>300){
            h+=(n-300)+200*3+100*2;
        }
        else  if (n>200){
            h+=2*(n-200)+200*3;
        }
        else {
            h+=n*3;
        }
        int eyes= h*2;
        System.out.println("The dragon has "+h+" heads and "+eyes+" eyes");
    }
}

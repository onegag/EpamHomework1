package task6;

public class task6 {
    public static void main(String[] args) {
        reverse(1234565);
        reverse(9255567);


    }
    static int reverse(int n){
        int []array = new int[7];
        for (int i = 0; i < 7 ; i++) {
            array[i] = n%10;
            n = n/10;
        }
        int depth= 1;
        int n1 =0;
        for (int i = 6; i >=0 ; i--) {
            n1 += depth*array[i];
            depth*=10;
        }
        System.out.println(n1);
        return n1;


    }
}

package task5;

public class task5 {
    public static void main(String[] args) {
        average(345613);


    }
    static void average(int n){
        int []array = new int[6];
        for (int i = 0; i < 6; i++) {
            array[i] = n%10;
            n = n/10;
        }

        int sum = 0;
        int mult = 1;
        for (int i: array ) {
            sum+=i;
            mult*=i;
        }
        double arithmetic = sum/6.;
        double geometric = Math.pow(mult,1/6.);
        System.out.println("arithmetic mean is "+arithmetic+"; Geometric mean is "+ geometric);
    }

}

package task2;

public class task2 {
    public static void main(String[] args) {
        Convert(1999);
        Convert(1999.);
        Convert(1.556456363653);
    }

    static void Convert(int m){
        float m1 = m/1000.f;
        int m2 = m*1000;
        int m3 = m2*1000;
        System.out.printf("The dino weights %f tons;  %d grams; %d milligrams%n", m1, m2, m3);
    }

    static void Convert(double m){
        double m1 = m/1000;
        double m2 = m*1000;
        double m3 = m2*1000;
        System.out.printf("The dino weights %f tons;  %f grams; %f milligrams%n",m1, m2, m3);
    }


}

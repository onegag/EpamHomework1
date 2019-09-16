package task3;

public class task3 {
    public static void main(String[] args) {
        ringArea(54,44);

    }
    static void ringArea(int r1, int r2){
        double s = Math.PI*(r1*r1-r2*r2);
        System.out.println("The ring area is "+s );
    }
}

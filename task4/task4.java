package task4;

public class task4 {
    public static void main(String[] args) {
        ifSequence(2567);
        ifSequence(2563);
        ifSequence(9764);

    }
    static  void ifSequence(int n){
        String s = "Sequence didn't find";
        int a= n/1000;
        int b = n%1000/100;
        int c = n%100/10;
        int d = n%10;
        if(a>b){
            if(b>c){
                if ((c > d)) {
                    System.out.println("A sequence is monotonically decreasing");
                }
                else System.out.println(s);
            }
            else System.out.println(s);
        }
        else if (a<b){
            if(b<c){
                if (c<d){
                    System.out.println("A sequence is monotonically increasing");
                }
                else System.out.println(s);
            }
            else System.out.println(s);
        }
        else System.out.println(s);
    }
}

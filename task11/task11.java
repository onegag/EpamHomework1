package task11;

public class task11 {
    public static void main(String[] args) {
        int d =16;
        int y = 2019;
        int m = 13;
        nextDay(d,m,y);

    }
    static void nextDay(int d, int m, int y){
        if(d>=28){
            if(m==2) {
                if (d == 28 && y % 4 == 0) {
                    if (y % 100 == 0 && y % 400 != 0) {
                        m++;
                        d = 1;
                    } else d++;
                } else {
                    m++;
                    d = 1;
                }
            }
             else if (d>=30){
                if(m==4||m==6||m==9||m==11){ //30-дневный месяц
                    d=1;
                    m++;
                }
                else if (d==31){
                    if (m==12){
                        d=1;
                        m=1;
                        y++;
                    }
                    else {
                        d=1;
                        m++;
                    }
                }
                else d++;
            }
            else d++;
        }
        else d++;
        System.out.printf("Завтра: %d.%d.%d",d,m,y);
    }



}





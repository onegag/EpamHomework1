public class Logic {
    private static double min = Double.MAX_VALUE;
    private  static  int[] index;
    public static void findMax(double [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]<min) min = array[i][j];
            }
        }
    }
}

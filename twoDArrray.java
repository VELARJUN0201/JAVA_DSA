import java.util.Arrays;

public class twoDArrray {
    public static void main(String[] args) {
        int[][] Arr = {{10,20,30},{40,50,60}};
        for(int row = 0; row < Arr.length; row++){
            for(int col = 0; col < Arr[row].length; col++){
                System.out.print(Arr[row][col]+" ");
            }
        }
    }
}

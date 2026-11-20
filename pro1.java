import java.util.Arrays;

public class pro1 {
    public static void main(String[] args) {
        int[] num = {10,20,30,12,45,5};
        for (int x : num) {
            System.out.print(x+" ");
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        Arrays.copyOf(num, 8);
        System.out.println(Arrays.toString(num));
    }
}

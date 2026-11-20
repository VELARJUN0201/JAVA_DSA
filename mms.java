import java.util.Arrays;
import java.util.Scanner;
public class mms {
    int maxE(int[] arr){
        int max = arr[0];
        for(int i : arr){
            if (i>max){
                max = i ;
            }
        }
        return max;
    }
    int minE(int[] arr){
        int min = arr[0];
        for(int i : arr){
            if (i<min){
                min = i ;
            }
        }
        return min;
    }
    int sumE(int[] arr){
        int sum = 0;
        for (int i: arr){
            sum += i;
        }
        return sum;
    }
    int[] sortA(int[] arr){
        for (int i =0;i<(arr.length);i++){
            for(int j =0;j<arr.length;j++){
               if(arr[i]<arr[j]){
                   int temp= arr[j];
                   arr[j]= arr[i];
                   arr[i]=temp;
               }
            }
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        mms ob = new mms();
        System.out.print("Enter the Size of an Array : ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements : ");
        for(int i = 0 ; i<n;i++){
           arr[i] = sc.nextInt();
        }
        System.out.println("The Maximum Element is : "+ob.maxE(arr));
        System.out.println("The Minimum Element is : "+ob.minE(arr));
        System.out.println("The Sum of All Elements is : "+ob.sumE(arr));
        System.out.println("The Sorted Array is : "+ Arrays.toString(ob.sortA(arr)));
        sc.close();

    }
}

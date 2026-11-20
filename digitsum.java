import java.util.Scanner;

public class digitsum {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        num=sc.nextInt();
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("The Sum of Digits = "+sum);
        sc.close();
    }
}

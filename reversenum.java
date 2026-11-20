import java.util.Scanner;
public class reversenum {
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rev =0,digit=0,num;
        System.out.print("Enter An Number : ");
        num=sc.nextInt();
        while(num!=0){
            digit = num%10;
            rev = rev*10+digit;
            num = num/10;
        }
        System.out.println("Reverse = "+rev);
        sc.close();
    }
}

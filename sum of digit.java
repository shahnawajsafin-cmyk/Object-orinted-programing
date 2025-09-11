import java.util.Scanner;
public class Sum_Of_digit {
    public static void main(String[] args) {
        int sum=0;
        int product=1;
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        while(num!=0){
            int digit=num%10;
            sum+=digit;
            product*=digit;
            num=num/10;
        }
        System.out.println("Total Sum is :"+sum);
        System.out.println("Product of digits :"+product);
    }

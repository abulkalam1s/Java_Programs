package Numbers;
import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String [] args){
        // A number is a Armstrong if sum of the cube of each digit is equal to that number
        //eg 153=1^3+5^3+3^3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to know if it is Armstrong or not ?");
        int num = sc.nextInt();
         int c_sum = cube(num);
        
         if(c_sum == num)
         System.out.println("The number "+num+" is a Armstrong number. ");
         else
         System.out.println("The number "+num+" is a not a Armstrong number. ");
    }
    public static int cube(int n){
        int sum=0, rem;
        while(n>0){
            rem = n%10;
            sum += rem*rem*rem;
            n = n/10;
        }
        return sum;
    }
}

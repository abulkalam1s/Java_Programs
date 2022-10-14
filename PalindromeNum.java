package Numbers;

import java.util.Scanner;
public class PalindromeNum {
    //12321
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int rev = reverse(num);
        if(rev == num)
        System.out.println("The number is Palindrome");
        else
        System.out.println("The number is not Palindrome");
    }
    public static int reverse(int n){
        int rem, rev=0;
        while(n>0){
            rem = n%10;
            rev = (rev*10)+rem; //sum = sum + (sum*sum*sum); for checking armstrong nos.(sum of the cube = that nos.)
            n = n/10;
        }
        return rev;
    }

}

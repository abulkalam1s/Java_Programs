package Numbers;
import java.util.Scanner;
public interface PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a prime or not.");
        int num = sc.nextInt();
        prime(num);
    }
    public static void prime(int n){
        //A number is prime when it is divisible by only 1 and the number itself.
        int count = 0 ;
        for(int i=1; i<=n; i++){
if(n%i==0){
    count++;
    if(count>2)
    break;
}
        }
        if(count == 2)
        System.out.println("The number "+n+" is a Prime Number");
        else
        System.out.println("The number "+n+ " is not a Prime Number");
    }
}

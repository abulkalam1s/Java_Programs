package Numbers;

import java.util.Scanner;
public class FibonacciSeries {
    //A Fibonacci is a series int which the next element can be determined by the sum
    //of its previous terms.i.e 0 1 1 2 3 5 8 13 21 ........  .
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int first =0, sec = 1;
    int next_term;
    System.out.println("Enter the limit n: ");
    int n = sc.nextInt();

    System.out.print("0 1 ");
    for(int i=3; i<=n; i++){
        next_term = first + sec;
        first = sec;
        sec  = next_term;
        System.out.print(next_term+" ");
    }
 }
}

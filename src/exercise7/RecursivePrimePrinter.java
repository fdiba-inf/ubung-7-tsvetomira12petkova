package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
      for (int z=n; n>0; n--){

        if (isPrime(n) == false){
        System.out.println(n);
        }
      }
        
    }

    public static boolean isPrime(int n) {
      boolean prime = false;
        while (n>2) {
          if(n%2==0) {
            prime = true;
           break;
          }
        
          n++;
        }

        return prime;
    
}
}

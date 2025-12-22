//check given number is even or odd , and give proper out.

import java.util.Scanner;

public class EvenOrOdd{
       public static void main(String[] args){
      
                      Scanner sc = new Scanner(System.in);
                      System.out.println("Enter number : ");
                       int num = sc.nextInt();
                      System.out.print(( num%2 ==0) ?  num + " is even number " : num  + " is odd number" );
                         sc.close();
       }

}
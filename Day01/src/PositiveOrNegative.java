//check whether number is positive /number;

import java.util.Scanner;

public class PositiveOrNegative {
 
               public static void main(String[] args) {

                  Scanner sc = new Scanner(System.in);

                  System.out.print("Enter number: ");

                  String res= " ";
               
                  if(sc.nextInt()>=0)
                      res = "positive";
                   else
                      res = "negative";

                System.out.print(res);
               
                  
               }
}

                     
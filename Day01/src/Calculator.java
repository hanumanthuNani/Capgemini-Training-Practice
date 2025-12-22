//simple calculator  

import java.util.Scanner;

public class Calculator {

            public static void main(String[] args){

                               Scanner sc = new Scanner(System.in);

                               System.out.println("enter num 1 :");

                               double num1 = sc.nextDouble();

                               System.out.println("enter num 2 :");

                               double num2 = sc.nextDouble();
                                
                               double res = 0;

              System.out.println("1.addition 2.subtraction 3.division 4.multiplication");


              int opt = sc.nextInt();

              switch(opt) {

               case 1 :

                    res = num1 + num2;
                    break;

               case 2 :
     
                   res = num1 - num2;
                   break;

               case 3 :
                     
                     if(num2 == 0){
                    System.out.println("cannot divide by zero");
                    return;
                      }
       
                    res =  num1/num2;
                    break;

               case 4 :
       
                   res = num1 * num2;
                   break;

               default :
                     
                     System.out.print("please enter correct ");
                     return;

                          }

               System.out.printf("calculated result is : %.2f",res);
               //System.out.println("calculated result is :" + res);
              sc.close();

        }
}
           


                        
                   
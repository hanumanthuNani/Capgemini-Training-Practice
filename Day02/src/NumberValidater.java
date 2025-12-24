//write a program to read mobile number from user and check if it is valid  or not    (6,7, 8 ,9 );
 


import java.util.Scanner ;

public class NumberValidater {

                         public static void main(String[] args) {

                         Scanner sc = new Scanner(System.in);
                         
                         System.out.println("how many numbers u want to check :");

                         int count = sc.nextInt();

                         int i =0;

                     


                         do { 

                         System.out.println("enter the number : ");

                         long num = sc.nextLong();

                         sc.nextLine();

                         int numCount = 0,digit = 0;
   
                         while(num > 0) {

                               digit = (int)num % 10;
                               numCount ++;
                               num = num/10;
                         }

                         if(digit >= 6 && digit <= 9 && numCount ==10 ){

                                     System.out.println("number valid");
                          } else {
                                  System.out.println("number invalid");
                          }
                      
                           i++;
                             
                         } while(i < count);
               }

     }
                          
                         
                              

                         
                               
                            
                                                
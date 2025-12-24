//sum of natural numbers from 1 to 10 

import java.util.Scanner;

public class SumOfNaturalNumber {

                         public static void main(String[] args ) {

                         Scanner sc  = new Scanner(System.in);

                         System.out.println("Enter the number : ");

                         int num = sc.nextInt();

                         int sum = 0;

                         for(int i = 1 ; i < num ; i++)

                             {

                                       sum += i;
                             }

                         System.out.println("sum :"+ sum);

                         int rev = 0;

                         int count = 0;

                         int ld = 0;

                         int temp1 = sum;

                         while(temp1 >0 ){
                           
                               ld = temp1 % 10;
                               rev = rev* 10 + ld;
                               temp1 /= 10;
                               count ++;
                          }

                         System.out.println("using while loop :"+ rev);

                        int rev1 = 0;
                        int temp2 = sum;
                        for(;temp2 > 0 ;temp2 = temp2/10){
                                int ld1 = temp2%10;
                                rev1 = rev1*10 + ld1;
                         }
                             
                         System.out.println("using forloop : " +rev1);

              }

  }
 
                         

                                           


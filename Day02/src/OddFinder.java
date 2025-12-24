//write a program to print odd numbers between 1 to 20;

import java.util.Scanner;

public class OddFinder {

                  public static void main(String[] args) { 


                               Scanner sc  = new Scanner(System.in);

                               System.out.println("Enter element : ");
  
                               int num =  sc.nextInt();

                               int i = 1;

                               int count = 0;
 
                               while(i<=num){
                                          
                                             if(i% 2 !=0){
                                                   	System.out.println(i);
                                                        count++;
                                               }
                                       i++;
                                       
                                       
                                }

                             System.out.println("number of odd elements : " + count);

                   }
    }

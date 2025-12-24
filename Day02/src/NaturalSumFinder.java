//design a method to find sum of natural numbers

import java.util.Scanner;

public class NaturalSumFinder {


                          static Scanner sc  = new Scanner(System.in);

                          public static void main(String[] args) {

                                      

                                       System.out.println("Enter start number :");
                                       
                                       int num1 = sc.nextInt();

                                       sc.nextLine();

                                       System.out.println("Enter ending number :");

                                       int num2 = sc.nextInt();

                                       System.out.println("sum of "+num2 + " is: "+ sumFinder(num1,num2));

                                       
                           }


                          public static int sumFinder(int a , int b){

                                               int sum = 0;

                                               for(int i = a;i<b;i++){
                                                 sum += i;
                                                }

                                              return sum;
                                    }



 }

                             
                                  
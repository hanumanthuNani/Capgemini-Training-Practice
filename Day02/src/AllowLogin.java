// allowing only n  members to login 

import java.util.Scanner;

public class AllowLogin {

                 public static void main (String[] args){

                                Scanner sc = new Scanner(System.in);
                           
                                System.out.println("enter no of studens u need to register : ");
 
                                int i = sc.nextInt();

                                sc.nextLine();

                                int count =1;

                                String std = " " ;
                                int regnum = 0;
                                int marks  = 0;

                                do {
                                   
                                    System.out.println("Enter ur " + count +" st "+" name : ");
                                     
                                    std = sc.nextLine();

                                    System.out.println("enter ur number :");

                                    regnum = sc.nextInt();

                                    sc.nextLine();

                                    System.out.println("Enter ur marks : ");

                                    marks = sc.nextInt();
                                    sc.nextLine();


                                    System.out.println("--student details---");
                                    System.out.println(" name : " +std + " regnum : "+ regnum + " marks : "+marks);

                                     count ++;

                                }while(count <=i);

                    }

       }
                                     
                        
                                    
                            
                                    
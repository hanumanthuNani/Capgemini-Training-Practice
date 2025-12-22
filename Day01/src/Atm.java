//validation of atm pin and show remaining amount and only take 100s or 1000s no paisas , and only show if password if valid 

import java.util.Scanner;

public class Atm {

            public static void main(String[] args) {

                           Scanner sc = new Scanner(System.in);
                           
                           int tot_am = 5000;

                           System.out.println("enter ur 4 digit password: ");

                           int exp = sc.nextInt();

                           if(exp == 1234) {

                                   System.out.println("password validated");

                                   System.out.println("please enter amount to withdraw :");


                                   if(!sc.hasNextInt()){

                                           System.out.println("only 100s and 1000s allowed.No whole numbers");
                                           
                                            return;

                                     }


                                   int n = sc.nextInt();

                                   if(n > tot_am || n <=0 ){

                                    System.out.println("please enter valid amount only");

                                    return;
                                  }
 

                                   if( n  % 100  == 0 ) {

                                               int  res = tot_am - n;

                                               System.out.println("available money :"+res);

                                       } 
                              } else{
                              
                                    System.out.println("password not correct");
                              }

                                sc.close();
                 }

}
 
                                            
                                                               
                                   
                               



                          
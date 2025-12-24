//days Finder 

import java.util.Scanner;

public class DaysFinder {

              public static void main(String[] args) {
  
                       Scanner sc = new Scanner(System.in);

                      System.out.println("enter the month number :");

                       
                      int num = sc.nextInt();

                      String res = " ";


                       if(num >=1 &&  num <= 12)

                                  {
                                          switch(num){

                                                     case 1 : case 3 : case 5 : case 7 :case 8 :
                                                     case 10 : case 12 : {

                                                                    res = " 31 days ";
                                                                    break;
                                                             }
                                                      case 4 :case 6 : case 9 : case 11 :{
                                                                     res = " 30 days " ;
                                                                     break;
                                                                  }
                                                      default : {
                                                               
                                                              res = " 28 days " ;
                                                       }

                                                      //MORE  EFFICIENT 
                                                       // switch(num){
                                                                      //case 2 : res = "28/29" days ; break;
                                                                      //case 4 : case 6 :case 9 :case 11 :res = "30 days";break;
                                                                      //default : res = "31 days ";
                                                         
                                            }
                                     }
                          
                             System.out.println(res);
                  }

       }
                                    


        
                  
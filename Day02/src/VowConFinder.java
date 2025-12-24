//write a program to check wheter given character is vowel or consonant and  make a simple calculator;

import java.util.Scanner;

public class VowConFinder {

                


                 public static void main(String[] args) {
     
                             
                                System.out.println("enter character : ");

                                String res = " ";

                                          Scanner opt  =  new Scanner(System.in);

                                          char opt1 = opt.next().charAt(0);

                                switch(opt1){

                                        case 'a' :case 'e' :case 'i':case 'o':case 'u':
                                        
                                        case 'A' : case 'E':case 'I':case 'O':case 'U':

                                           {
                                                     res = "vowel";

                                                      break;
                                           }
                                       default :{
                                              
                                                     if(opt1 >= '0' && opt1 <='9'){
                                                                 res = "digit";
                                                       }else if( opt1 >= 'A'  && opt1 <= 'Z'   || opt1 >='a' && opt1 <='z'){
                                                                    res = "consonant";
                                                             }

                                                           else{
                                                                res = "special character";
                                                       }

                                                 }
                                  }

                                System.out.println(res);

                  }
        }
                                               

                                                                                      
   
                      
                             


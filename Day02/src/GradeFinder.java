// grade system  

import java.util.Scanner;

public class GradeFinder {

                public static void main(String[] args) {

                               Scanner sc = new Scanner(System.in);

                               System.out.println("Enter marks: ");

                               int marks = sc.nextInt();
                               

                               String res = " ";
                               
                               int backLog=0;

                               if(marks >= 90 && marks <=100){
                                       res =  "D";
                                 } else if(marks >=85 && marks <90){
                                        res = "first class";
                                 } else if(marks >=60 && marks<85) {
                                        res = "second class";
                                 }else if(marks >=50  && marks <60){
                                         res = "pass";
                                 }else if(marks <50){
                                            res = "fail";
                                         System.out.println("enter backglogs u have :");
                                             backLog = sc.nextInt();
                                 }else {
                                         System.out.println("not available");
                                        }

                               System.out.println("your grade is : " + res );

                               System.out.println("u have " + backLog + " backlogs");
                               
                              
                           }
             }
                                               
                                            

                                        
                                            
                                         
            
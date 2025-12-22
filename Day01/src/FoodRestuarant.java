//LPU RESTAURANT

import java.util.Scanner;

public class FoodRestuarant {

                public static void main(String[] args) {

                         System.out.println("hello ! , welcome to lpu restaurant ");
     
                         Scanner  sc = new Scanner(System.in);

                         System.out.println("MENU ==>>  1 .VEG  --- 2 .NON-VEG ");
    
                         int sum =0;

                         double des =0;

                         int chos = sc.nextInt();


                         if(chos==1){

                        System.out.println("AVAILBALE ITEMS :--  1.Poha(100) 2.Noodles(60) 3.FriedRice(50) 4.Idly(40) 5.Dosa(60) -- only  ");

                             
                        System.out.println("please requesst what u want :");
                        int opt = sc.nextInt();
 
                        
                     
                        System.out.println("enter quantity:");
                        int q = sc.nextInt();
                        
                        if(q>=2) {
                           des = 0.2;
                         }

                          if(opt==1){
                                 sum +=100*q;
                                }else if(opt==2){
                                        sum +=60*q;
                                             }else if(opt==3){
                                                      sum +=50*q;
                                                   }else if(opt==4){
                                                          sum +=40*q;
                                                       } else if(opt==5){
                                                              sum +=60*q;
                                                                 }else {

                                                                       System.out.println("item not available");
                                                                   }
                             }  else if(chos==2){

                        System.out.println("AVAILBALE ITEMS :--  1.ChickenFry(90) 2.Chicken_Noodles(60) 3.ChickenFriedRice(50) 4.Fried_Mutton_Idly(400) 5.Dosa_with_chicken(110) -- only  ");

                             
                        System.out.println("please requesst what u want :");
                        int opt1 = sc.nextInt();
                         
                        System.out.println("enter quantity:");
                        int q = sc.nextInt();


                         if(q>=5) {
                           des = 0.5;
                         }

                          if(opt1==1){
                                 sum +=90*q;
                                }else if(opt1==2){
                                        sum +=60*q;
                                             }else if(opt1==3){
                                                      sum +=50*q;
                                                   }else if(opt1==4){
                                                          sum +=400*q;
                                                       } else if(opt1==5){
                                                              sum +=110*q;
                                                                 }else {

                                                                       System.out.println("item not available");
                                                                   }
                             }else{
                                                        
                                                 System.out.println("not available ,choose only available one ");

                          }


                             double final_price =sum-sum*des;
                             System.out.println("total amount :"+ final_price);                

                   }

}
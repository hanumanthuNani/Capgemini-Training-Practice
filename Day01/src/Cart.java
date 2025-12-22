import java.util.Scanner;

public class Cart{
 
              public static void main(String[] args ) {
 
                     Scanner sc = new Scanner(System.in);
                     System.out.println("helicopter : 10000" + " "+"shoes : 5000 " +" " +"jocket : 4000");
                    
                     int sum = 0;
 
                     System.out.println("want helicopter : (1:yes, 0 :No)");
                     
                     if(sc.nextInt()==1) sum += 10000;
                  
                     System.out.println("want shoes:(1:yes, 0 :No)");
                      if(sc.nextInt()==1) sum += 5000;
                    
                     System.out.println("want jocket : (1:yes, 0 :No)");
 
                     if(sc.nextInt()==1) sum += 4000;
                  
                   int discount =0;

                   if(sum>=10000) {
                     System.out.println("you will get 50 % dicount");

                      discount =  sum/2;
                     
                     }
            

                 System.out.println("payment need to be done :" + (sum-discount) );
                          sc.close(); 
    
                      

             }
}
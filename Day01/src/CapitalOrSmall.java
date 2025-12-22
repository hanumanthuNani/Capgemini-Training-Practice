//write a code to check if alphabet is capital or small 

import java.util.Scanner;

public class CapitalOrSmall {

             public static void main(String[] args) {
  
             Scanner sc = new Scanner(System.in);

             System.out.print("enter character: ");

             char c1 = sc.next().charAt(0);
 
             String res = "";

             if(c1 >= 'A' && c1 <='Z'){
 
                  res = " Capital alphabet";

             }else if( c1 >= 'a' && c1 <= 'z') {
  
                      res = " Small alphabet";
                  }

              else if(c1 >='0' && c1 <='9') {

                         res = " digit";
 
                    }
    
                  else{
                         res = " special character";
                    }

             System.out.print(c1 + " is  a " + res);

             sc.close();

       }

}
 
                
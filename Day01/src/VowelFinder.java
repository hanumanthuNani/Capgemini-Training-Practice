//check whether given character is vowels or consonants 

import java.util.Scanner;

public class VowelFinder {

       public static void main(String[] args) {
 
               Scanner sc = new Scanner(System.in);
               
               System.out.println("enter character :");

               char c1  = sc.next().charAt(0);  

               String res = "its not an alphabet ";
             
             if(c1 >= 'A' && c1 <= 'Z' || c1 >='a' && c1 <= 'z') {
           

               if( c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u' || c1 =='A' || c1 == 'E' || c1 == 'I' || c1 == 'O' || c1 == 'U' ) {

                         res =  c1 + " is a vowel" ;

                } else {
                             
                         res =  c1 + " is a consonant ";
                         
                  }
             } 

                        System.out.println(res);
                         
                        sc.close();
       }

}
      
               
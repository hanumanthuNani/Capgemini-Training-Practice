//write a program to check whether it is upper case or not ?

import java.util.Scanner;
public class UpperCaseOrNot{
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);

          System.out.println("enter ur character : ");

          char c1 = sc.next().charAt(0);
String res = ( c1 >= 'A'  && c1<='Z') ? "UpperCase" : (c1 >= 'a' && c1 <= 'z') ?  "lowercase" : (c1 >='0' && c1<='9' ) ? "digit" : "Special Character:" ;
          System.out.print("Given char  : " +  c1 +" is a "+ res );
      
     }

}
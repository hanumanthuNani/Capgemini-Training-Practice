import java.util.Scanner;

public class  MaxNumFinder{
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("enter 1st number: ");
          int num = sc.nextInt();
   
          System.out.println("enter 2nd number: ");
          int num2 = sc.nextInt();
         
          System.out.println("enter 3rd number: ");
          int num3 = sc.nextInt();
          
          int res = (num >num2 && num >num3 ) ? num : (num2>num3) ? num2 : num3;
          System.out.println("largest number is :" + res);
   }

}
 
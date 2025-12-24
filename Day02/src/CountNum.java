// count how  many numbers in a number 


import java.util.Scanner;


public class CountNum {

                public static void main(String[] args) {

                        Scanner sc = new Scanner(System.in);
                        System.out.println("enter number :");
                        int num = sc.nextInt();
                        int count = 0;
                        String res = " ";
                        while(num >0) {
                             int ld = num % 10;
                             if(ld % 2 == 0){
                                   res += " even : " + ld;
                              }
                             num = num/10;
                             count ++;
                         }
                        System.out.println("no.of elements:" +count);
                        System.out.println(res);
             }
}
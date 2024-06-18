import java.util.Scanner;

public class cwh_79_errosdemo{
   
    public static void main(String []args){

        //Syntax Error
      //  int i =0          there is no semi colon so this is a syntax error
        //logical error demo
        //Write a program to print all prime numbers between 1-10
        System.out.println(2);
        for(int i=1;i<5;i++){
            System.out.println(2*i+ 1);
        }//here the logic is wrong ...ie it is the code of printing odd no not of printing prime numbers 
        
        //Runtime error
        while (true){
          
            int  k;
             Scanner sc =new Scanner(System.in) ;
             k=sc.nextInt();
             System.out.println("Integer part of 1000 divided by k is " +1000/k);
             
           }
   
    }
 }
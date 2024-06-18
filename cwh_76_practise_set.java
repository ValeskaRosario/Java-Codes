
/*Chapter 13 : Practice Set
1.Write a program to print : good morning " and "Welcome" continuously on the scsreen in java using Thread
2. Add a sleep method in welcome thread of question 1 to dealat its execution for 200ms.
3.Demonstrate gerPriority () and setPriority () methods in java Thread
4.How do you get state of a given thread in java
5.How do you get reference to the current thread in java
*/
class thr extends Thread{
   public  void run(){
       while (true){
    System.out.println("Good morning");}
}
}

class thr2 extends Thread{
    public void run(){
      /*  while (false){
    try {
        Thread.sleep(200);}
    catch (Exception e) {
        System.out.println(e);
    }*/
     System.out.println("Welcome");
}}

public class cwh_76_practise_set {
    public static void main (String [] args){
        thr t1 = new thr();
        thr2 t2 = new thr2();
       // t1.setPriority(6);  //Q.3
         //t2.setPriority(9);
        System.out.println(t1.getPriority()); /*Q.3*/
        System.out.println(t2.getPriority());
        
       // t1.start();  //Q.1....& Q.2
        t2.start();
        System.out.println(t2.getState());//Q.4
        System.out.println(Thread.currentThread().getState());//Q.4
    }
}

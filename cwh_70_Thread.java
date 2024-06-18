

class mythread1 extends Thread{
    public void run(){
       
            System.out.println("My Thread1 is Running ");
            System.out.println("I am Happy");
        }
        }
    
class mythread2 extends Thread{
    public void run(){
        
            System.out.println("My Thread2 is Running ");
            System.out.println("I am sad");
            }
            }
        
   public class cwh_70_Thread {
        public static void main(String args[]){
        mythread1 t1= new mythread1();
        mythread2 t2 = new mythread2();
        t1.start();
        }
    }




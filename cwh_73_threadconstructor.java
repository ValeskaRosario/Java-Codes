

class MyThr extends Thread{
    public MyThr (String name ){
        super (name);
    }
    public void run(){
        //while (true){
            System.out.println("I am a thread");
            
      //  }
    }
}

public class cwh_73_threadconstructor {
    public static void main(String args[]){
        MyThr t = new MyThr ("Harry");
        t.run();
    }
}
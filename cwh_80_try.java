public class cwh_80_try {
    public static void main (String [] aStrings){
        int a = 6000;
        int b =0;
        /*Without try
          int c =a/b;
            System.out.println("The resutl is " + c );*/
        try{
        int c =a/b;
        System.out.println("The resutl is " + c );
        }
        catch(Exception e){
            System.out.println("We failed to divide .Reason:");
        }
        System.out.println("End of the program");
          
    }
}


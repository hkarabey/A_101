package A101.utilities;

public class HandleWait {
    public static void staticWait(int seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (Exception e){

        }
    }
}

import java.io.InterruptedIOException;

public class Main {
    public static void main(String [] args)  throws Exception
    {
        Database database = Database.getInstance();
        database.printDate();
        Thread.sleep(4000);
        Database database2 = Database.getInstance();
        database2.printDate();
    }
}

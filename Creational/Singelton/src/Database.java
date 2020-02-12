import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Database {

    private static Database database;
    private static Object _lockObject = new Object();
    private Date createdAt;

    private Database() {
        createdAt = new Date();
        System.out.println("Constructor has been called!");
    }

    public static Database getInstance() {
        if (database == null) {
            synchronized (_lockObject) {
                database =  new Database();
            }
        }
        return database;
    }

    public void printDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateFormat.format(createdAt)); //2016/11/16 12:08:43
    }
}

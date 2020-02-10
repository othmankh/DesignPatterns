public class Database {

    private static Database database;
    private static Object _lockObject = new Object();

    private Database() {
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
}

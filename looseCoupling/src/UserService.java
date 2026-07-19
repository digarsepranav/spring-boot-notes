public class UserService {
    private Database db;
    public UserService(Database db) {
        this.db = db;
    }
    public void saveUser(String user) {
        System.out.println("Current DB in use is : " + user);
        db.save(user);
    }
}

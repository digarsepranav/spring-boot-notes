public class UserService{
    private MySQLDatabase mySQLDatabase = new MySQLDatabase();
    public void saveUser(String user) {
        System.out.println("UserService Layer");
        mySQLDatabase.saveToDB("pranav");
    }
}
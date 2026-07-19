import javax.xml.crypto.Data;

public class MySqlDatabase implements Database {
    @Override
    public void save(String user) {
        System.out.println("UserService is using the SQL database");
    }
}

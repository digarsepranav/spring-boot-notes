public class PostgreSql implements Database{

    @Override
    public void save(String user) {
        System.out.println("UserService is using the postgre SQL");
    }
}

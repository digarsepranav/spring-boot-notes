public class Main {
    public static void main(String[] args) {
        Database db = new MySqlDatabase();
        UserService userService = new UserService(db);
        userService.saveUser("Pranav");

        System.out.println();

        Database db2 = new PostgreSql();
        UserService userService1 = new UserService(db2);
        userService1.saveUser("Pranav2");
    }
}

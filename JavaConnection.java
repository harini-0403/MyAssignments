package week1.day3;

public class JavaConnection extends MySqlConnection {

    @Override
    public void connect() {
        System.out.println("MySQL connected.");
    }

    @Override
    public void disconnect() {
        System.out.println("MySQL disconnected.");
    }

    @Override
    public void executeUpdate() {
        System.out.println("Update executed on MySQL DB.");
    }

    @Override
    public void executeQuery() {
        System.out.println("Query executed on MySQL DB.");
    }
}

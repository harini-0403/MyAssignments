package week1.day3;

public class RunMySQL {
    public static void main(String[] args) {
        MySqlConnection mysql = new JavaConnection(); // Upcasting
        mysql.connect();
        mysql.executeUpdate();
        mysql.executeQuery();
        mysql.disconnect();
    }
}

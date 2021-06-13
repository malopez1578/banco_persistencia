package Connection;

import java.sql.*;

public class connectMySQL {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/banco_DB";
        // my credential in DB
        String user = "root";
        String pass = "aqyn0cup";

        try {
            Connection connection = DriverManager.getConnection(url, user, pass);

            String sql = "INSERT INTO pais (pais_nombre) VALUES (?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "argentina");

            int rows = statement.executeUpdate();
            if (rows > 0) {
                System.out.print("A rows been inserted");
            }
            statement.close();
            connection.close();
            connection.close();
        } catch (SQLException exe) {
            System.out.print("Oops, error!");
            exe.printStackTrace();
        }

    }
}

package E_Quiz.model.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnexion {

    private static final String URL = "jdbc:mysql://localhost:3306/equiz";
    private static final String USER = "root";
    private static final String PASSWORD = "ABC@def123";

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                // Charger le driver JDBC
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Établir la connexion
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Connexion à la base de données réussie !");
            } catch (ClassNotFoundException e) {
                System.err.println("Driver JDBC introuvable : " + e.getMessage());
            } catch (SQLException e) {
                System.err.println("Erreur lors de la connexion : " + e.getMessage());
            }
        }
        return connection;
    }
}

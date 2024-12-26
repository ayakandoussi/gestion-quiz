package E_Quiz.controller;

import E_Quiz.model.dao.impl.DBConnexion;

import java.sql.Connection;

public class TestDBConnection {

    public static void main(String[] args) {
        Connection connection = DBConnexion.getConnection();
        if (connection != null) {
            System.out.println("Connexion établie avec succès !");
        } else {
            System.out.println("Échec de la connexion.");
        }
    }
}

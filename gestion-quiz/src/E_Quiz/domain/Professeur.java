/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_Quiz.domain;

import java.util.ArrayList;

public class Professeur extends Utilisateur {
     private ArrayList<Quiz> quizCrees;

    @Override
    public void afficher() {
        System.out.println("Professeur: "+getNom()+" "+getPrenom()+".");
    }
     
    
}

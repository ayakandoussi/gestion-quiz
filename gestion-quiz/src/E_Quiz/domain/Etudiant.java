/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_Quiz.domain;

import java.util.ArrayList;



/**
 *
 * @author User
 */
public class Etudiant extends Utilisateur {
    private ArrayList<Quiz> quizDisponibles;
    
     @Override
    public void afficher() {
         System.out.println("Etudiant: "+getNom()+" "+getPrenom()+".");
    }
     
}

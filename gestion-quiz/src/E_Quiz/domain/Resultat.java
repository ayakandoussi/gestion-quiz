package E_Quiz.domain;

public class Resultat {

    private int idResultatQuiz;
    private int idEtudiant;
    private int idQuiz;
    private double score;
    private String nomEtudiant,prenomEtudiant,titreQuiz;

    public Resultat() {
    }

    public Resultat(int idResultatQuiz, int idEtudiant, int idQuiz, double score, String nomEtudiant, String prenomEtudiant, String titreQuiz) {
        this.idResultatQuiz = idResultatQuiz;
        this.idEtudiant = idEtudiant;
        this.idQuiz = idQuiz;
        this.score = score;
        this.nomEtudiant = nomEtudiant;
        this.prenomEtudiant = prenomEtudiant;
        this.titreQuiz = titreQuiz;
    }

    

    public int getIdResultatQuiz() {
        return idResultatQuiz;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public int getIdQuiz() {
        return idQuiz;
    }

    public double getScore() {
        return score;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }

    public String getTitreQuiz() {
        return titreQuiz;
    }
    

    public void setIdResultatQuiz(int idResultatQuiz) {
        this.idResultatQuiz = idResultatQuiz;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public void setIdQuiz(int idQuiz) {
        this.idQuiz = idQuiz;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public void setPrenomEtudiant(String prenomEtudiant) {
        this.prenomEtudiant = prenomEtudiant;
    }

    public void setTitreQuiz(String titreQuiz) {
        this.titreQuiz = titreQuiz;
    }
    

    public String afficherResume() {
        return "Résultat: Etudiant = " + nomEtudiant +" "+ prenomEtudiant + "\nQuiz = " + titreQuiz+ "\nScore = " + score;
    }

}

package E_Quiz.domain;

public class Resultat {
    private int idResultatQuiz;
    private int idEtudiant;
    private int idQuiz;
    private double score;

    public Resultat() {
    }

    public Resultat(int idResultatQuiz, int idEtudiant, int idQuiz, double score) {
        this.idResultatQuiz = idResultatQuiz;
        this.idEtudiant = idEtudiant;
        this.idQuiz = idQuiz;
        this.score = score;
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
 
}

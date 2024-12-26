package E_Quiz.model.dao;

import java.util.List;

public interface Dao<T> {

    void ajouter(T objet);

    T getParId(int id);

    List<T> getTous();

    void modifier(T objet);

    void supprimer(int id);
}

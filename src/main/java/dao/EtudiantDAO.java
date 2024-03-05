package dao;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO implements IEtudiant{
    List <Etudiant> etudiants = new ArrayList();

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiant;
    }
    public List<Etudiant> getAllEtudiants() {
            return etudiants;
    }

}

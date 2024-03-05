package metier;

import dao.Etudiant;
import dao.EtudiantDAO;

import java.util.List;

public interface IMetier {
    public Etudiant addEtudiant(Etudiant etudiant);
    public List<Etudiant> getAllEtudiants();
}

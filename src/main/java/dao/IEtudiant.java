package dao;

import java.util.List;

public interface IEtudiant {
    public Etudiant addEtudiant(Etudiant etudiant);
    public List<Etudiant> getAllEtudiants();
}

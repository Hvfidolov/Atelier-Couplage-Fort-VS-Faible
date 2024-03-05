package metier;

import dao.Etudiant;
import dao.EtudiantDAO;
import dao.IEtudiant;

import java.util.List;

public class EtudiantManager implements IMetier{
    IEtudiant intr_etd;

    @Override
    public Etudiant addEtudiant (Etudiant etudiant){
        for (Etudiant etd : intr_etd.getAllEtudiants()){
            if(etd.getEmail().equals(etudiant.getEmail())){
                intr_etd.addEtudiant(etudiant);
            }
        }
        return etudiant;
    }

    @Override
    public List<Etudiant> getAllEtudiants(){
        return intr_etd.getAllEtudiants();
    }
}

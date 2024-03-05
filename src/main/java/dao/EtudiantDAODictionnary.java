package dao;
import java.util.HashMap;
import java.util.Map;

public class EtudiantDAODictionnary extends EtudiantDAO {
    Map<String, Etudiant> etudiantMap = new HashMap<String, Etudiant>();

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiantMap.put(etudiant.getId(), etudiant);
        return etudiant;
    }
    /*
        - Remplacer EtudiantDAO par EtudiantDAODictionnary
        - Appel des methodes de EtudiantDAODictionnary au lieu de EtudiantDAO
        - Revisio3n du code
    */

    /*
        - Utilisation des interfaces
        - Utilisation de l'inversion de controle (loC) - d'apres ChatGPT -
    * */

}
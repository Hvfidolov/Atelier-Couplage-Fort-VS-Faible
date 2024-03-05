package presentation;

import dao.Etudiant;
import dao.EtudiantDAO;
import dao.IEtudiant;
import metier.EtudiantManager;
import metier.IMetier;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    public static void main(String[] args) {
        EtudiantDAO etd_dao = new EtudiantDAO();
        EtudiantManager etd_mngr = new EtudiantManager();

        Etudiant etd1 = new Etudiant("1","EL YAGOUBI","Abdelhafid","elyagoubiabdelhafid@gmail.com");
        Etudiant etd2 = new Etudiant("2","EL AOUAZI","Soukaina","elaouazisoukaina@gmail.com");
        Etudiant etd3 = new Etudiant("3","TAMRAOUI","Aya","tamraouiaya@gmail.com");
        Etudiant etd4 = new Etudiant("4","EL YAGOUBI","Pablo","elyagoubipablo@gmail.com");

        etd_mngr.addEtudiant(etd1);
        etd_mngr.addEtudiant(etd2);
        etd_mngr.addEtudiant(etd3);
        etd_mngr.addEtudiant(etd4);

        System.out.println(etd_mngr.getAllEtudiants());
    }
}

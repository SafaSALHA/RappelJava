import java.util.ArrayList;
import java.util.List;

public class Banque {
    private String nom ;
    private List <Compte> listComptes;


    public Banque(String nom) {
        this.nom = nom;
        this.listComptes = new ArrayList<Compte>();
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void ajoutCompte (Compte c){
        this.listComptes.add(c);
    }


    @Override
    public String toString() {
        return "Banque [nom=" + nom + ", listComptes=" + listComptes + "]";
    }


    
    
}

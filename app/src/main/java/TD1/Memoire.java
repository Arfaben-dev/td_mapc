import java.util.List;
public class Memoire implements Document{

    private String titre;
    private List<Chapitre> chapitres;

    public Memoire(String titre, List<Chapitre> chapitres){
        this.titre = titre;
        this.chapitres = chapitres;
    }
    
    public int taille(){
        int tailleTotal = 0;
        for(Chapitre chapitre : chapitres){
            tailleTotal +=chapitre.taille();
        }
        return tailleTotal;
    }

    public String titre(){
        return this.titre;
    }
}
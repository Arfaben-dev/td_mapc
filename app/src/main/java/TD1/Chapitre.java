public class Chapitre implements Document{
    private String titre;

    private String[] pages;

    public Chapitre(String titre, String[] pages){
        this.titre = titre;
        this.pages = pages;
    }

    public String titre(){
        return this.titre;
    }

    public int taille(){
        return this.pages.length;
    }
}
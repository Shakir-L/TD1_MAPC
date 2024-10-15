package fr.parisnanterre.TD1;

import java.util.List;

public class Mémoire implements Document {
    private String titre;
    private List<Chapitre> cs;

    public Mémoire(String titre, List<Chapitre> chapitres) {
        this.titre = titre;

    }

    public String titre(){
        return this.titre;
    };
    public int taille(){
        int t = 0;
        for (Chapitre c : cs) {
            t += c.taille();
        }
        return t;
    };

}
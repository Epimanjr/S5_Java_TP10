/*
 * Classe Nanceen.
 */
package tp;

/**
 *
 * @author Maxime BLAISE
 */
public class Nanceen {
    
    /**
     * Nom du nancéen.
     */
    private String nom;
    
    /**
     * Prénom du nancéen.
     */
    private String prenom;
    
    /**
     * Adresse du nancéen.
     */
    private String adresse;
    
    /**
     * Numéro de téléphone du nancéen.
     */
    private int telephone;

    /**
     * Constructeur d'un nancéen.
     * 
     * @param nom .
     * @param prenom .
     * @param adresse .
     * @param telephone  .
     */
    public Nanceen(String nom, String prenom, String adresse, int telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Nanceen{" + "nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", telephone=" + telephone + '}';
    }
    
    
    
    
    
}

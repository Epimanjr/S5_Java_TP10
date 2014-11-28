/*
 * Classe Nanceen.
 */
package tp;

import exception.NumeroTelephoneException;

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
    private String telephone;

    /**
     * Constructeur d'un nancéen.
     * 
     * @param nom .
     * @param prenom .
     * @param adresse .
     * @param telephone  .
     * @throws exception.NumeroTelephoneException si le numéro de téléphone n'est pas correct.
     */
    public Nanceen(String nom, String prenom, String adresse, String telephone) throws NumeroTelephoneException {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        
        this.telephone = telephone;
        // Test sur le numéro de téléphone.
        if(!telephone.startsWith("0383")) {
            throw new NumeroTelephoneException();
        }
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    

    @Override
    public String toString() {
        return "Nanceen{" + "nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", telephone=" + telephone + '}';
    }
    
    
    
    
    
}

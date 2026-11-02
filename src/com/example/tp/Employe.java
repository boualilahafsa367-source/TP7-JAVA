
package com.example.tp;

// Classe abstraite représentant un employé.
public abstract class Employe {

    // Attributs communs à tous les employés.
    protected String nom;
    protected String prenom;

    // Constructeur pour initialiser le nom et le prénom.
    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Méthode abstraite : chaque sous-classe doit calculer son salaire.
    public abstract double calculerSalaire();

    // Retourne les informations de l'employé et son salaire.
    @Override
    public String toString() {
        return nom + " " + prenom
                + " - Salaire = "
                + String.format("%.2f", calculerSalaire()) + " euros";
    }
}


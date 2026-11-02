
package com.example.tp;

// Classe représentant un employé payé à l'heure.
public class EmployeHoraire extends Employe {

    // Attributs spécifiques à l'employé horaire.
    private double tauxHoraire;
    private double heuresTravaillees;

    // Constructeur de la classe.
    public EmployeHoraire(String nom, String prenom,
                          double tauxHoraire,
                          double heuresTravaillees) {

        // Appel du constructeur de la classe mère.
        super(nom, prenom);

        this.tauxHoraire = tauxHoraire;
        this.heuresTravaillees = heuresTravaillees;
    }

    // Calcul du salaire selon le taux et les heures travaillées.
    @Override
    public double calculerSalaire() {
        return tauxHoraire * heuresTravaillees;
    }
}


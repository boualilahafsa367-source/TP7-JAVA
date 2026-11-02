
package com.example.tp;

// Classe représentant un vendeur.
// Elle hérite de EmployeSalarie.
public class Vendeur extends EmployeSalarie {

    // Commission supplémentaire du vendeur.
    private double commission;

    // Constructeur de la classe.
    public Vendeur(String nom, String prenom,
                   double salaireMensuel,
                   double commission) {

        // Appel du constructeur de la classe mère.
        super(nom, prenom, salaireMensuel);

        this.commission = commission;
    }

    // Calcul du salaire avec ajout de la commission.
    @Override
    public double calculerSalaire() {
        return salaireMensuel + commission;
    }
}


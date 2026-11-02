
package com.example.tp;

// Classe représentant un employé ayant un salaire mensuel fixe.
public class EmployeSalarie extends Employe {

    // Salaire mensuel de l'employé.
    protected double salaireMensuel;

    // Constructeur de la classe.
    public EmployeSalarie(String nom, String prenom,
                          double salaireMensuel) {

        // Initialisation du nom et du prénom dans la classe mère.
        super(nom, prenom);

        this.salaireMensuel = salaireMensuel;
    }

    // Retourne le salaire mensuel fixe.
    @Override
    public double calculerSalaire() {
        return salaireMensuel;
    }
}


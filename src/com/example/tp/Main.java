
package com.example.tp;

// Classe principale pour tester la gestion de la paie.
public class Main {

    public static void main(String[] args) {

        // Création de l'entreprise.
        Entreprise ent = new Entreprise();

        // Ajout d'un employé payé à l'heure.
        ent.ajouterEmploye(
            new EmployeHoraire("El Idrissi", "Mohamed", 15.0, 160)
        );

        // Ajout d'un employé salarié.
        ent.ajouterEmploye(
            new EmployeSalarie("Bentaleb", "Fatima", 2500.0)
        );

        // Ajout d'un vendeur avec une commission.
        ent.ajouterEmploye(
            new Vendeur("Chouaib", "Youssef", 2000.0, 500.0)
        );

        // Ajout d'un deuxième employé payé à l'heure.
        ent.ajouterEmploye(
            new EmployeHoraire("Lahlou", "Salma", 12.0, 120)
        );

        // Affichage des bulletins de paie.
        ent.afficherPaie();
    }
}

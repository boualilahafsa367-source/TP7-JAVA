
package com.example.tp;

// Classe responsable de la gestion des employés de l'entreprise.
public class Entreprise {

    // Tableau contenant les employés.
    private Employe[] employes;

    // Nombre réel d'employés ajoutés.
    private int nb;

    // Constructeur : création d'un tableau initial de 4 places.
    public Entreprise() {
        this.employes = new Employe[4];
        this.nb = 0;
    }

    // Ajoute un employé au tableau.
    public void ajouterEmploye(Employe e) {

        // Vérifier si le tableau est plein.
        if (nb == employes.length) {

            // Créer un nouveau tableau avec une capacité doublée.
            Employe[] tmp = new Employe[employes.length * 2];

            // Copier les anciens employés dans le nouveau tableau.
            System.arraycopy(employes, 0, tmp, 0, employes.length);

            // Remplacer l'ancien tableau par le nouveau.
            employes = tmp;
        }

        // Ajouter l'employé à la prochaine position disponible.
        employes[nb++] = e;
    }

    // Affiche le bulletin de paie de tous les employés.
    public void afficherPaie() {

        System.out.println("=== Bulletin de paie ===");

        for (int i = 0; i < nb; i++) {
            System.out.println(employes[i]);
        }

        // Afficher la masse salariale totale.
        System.out.println("Masse salariale totale : "
                + String.format("%.2f", masseSalariale()) + " euros");
    }

    // Calcule la somme des salaires de tous les employés.
    public double masseSalariale() {

        double somme = 0;

        for (int i = 0; i < nb; i++) {
            somme += employes[i].calculerSalaire();
        }

        return somme;
    }
}


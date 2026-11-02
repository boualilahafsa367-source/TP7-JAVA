
package com.example.tp;

// Classe abstraite représentant un élément du système de fichiers.
public abstract class FsItem {

    // Nom commun à tous les éléments.
    protected String name;

    // Constructeur.
    public FsItem(String name) {
        this.name = name;
    }

    // Retourne le nom de l'élément.
    public String getName() {
        return name;
    }

    // Méthode abstraite : chaque sous-classe calcule sa propre taille.
    public abstract long getSize();

    // Affiche le nom et la taille de l'élément.
    @Override
    public String toString() {
        return name + " (" + getSize() + " B)";
    }
}


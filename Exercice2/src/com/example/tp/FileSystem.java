
package com.example.tp;

// Classe qui gère l'ensemble du système de fichiers.
public class FileSystem {

    // Tableau des éléments racine.
    private FsItem[] items;

    // Nombre d'éléments ajoutés.
    private int count;

    // Constructeur avec un tableau initial de 4 places.
    public FileSystem() {
        this.items = new FsItem[4];
        this.count = 0;
    }

    // Ajoute un élément racine.
    public void addRoot(FsItem item) {

        // Agrandir le tableau s'il est plein.
        if (count == items.length) {
            FsItem[] tmp = new FsItem[items.length * 2];

            System.arraycopy(items, 0, tmp, 0, items.length);

            items = tmp;
        }

        items[count++] = item;
    }

    // Affiche tous les éléments du système.
    public void listAll() {

        for (int i = 0; i < count; i++) {

            FsItem f = items[i];

            if (f instanceof Directory) {
                ((Directory) f).list(0);
            } else {
                System.out.println(f);
            }
        }
    }

    // Calcule la taille totale du système de fichiers.
    public long totalSize() {

        long sum = 0;

        for (int i = 0; i < count; i++) {
            sum += items[i].getSize();
        }

        return sum;
    }
}


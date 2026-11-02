
package com.example.tp;

// Classe représentant un répertoire.
public class Directory extends FsItem {

    // Tableau contenant les fichiers et sous-répertoires.
    private FsItem[] children;

    // Nombre d'éléments réellement ajoutés.
    private int count;

    // Constructeur avec un tableau initial de 4 places.
    public Directory(String name) {
        super(name);
        this.children = new FsItem[4];
        this.count = 0;
    }

    // Ajoute un fichier ou un sous-répertoire.
    public void add(FsItem item) {

        // Agrandir le tableau s'il est plein.
        if (count == children.length) {
            FsItem[] tmp = new FsItem[children.length * 2];

            System.arraycopy(children, 0, tmp, 0, children.length);

            children = tmp;
        }

        children[count++] = item;
    }

    // Calcule la taille totale du répertoire et de ses enfants.
    @Override
    public long getSize() {

        long total = 0;

        for (int i = 0; i < count; i++) {
            total += children[i].getSize();
        }

        return total;
    }

    // Affiche récursivement le contenu du répertoire.
    public void list(int indent) {

        // Ajouter une indentation selon le niveau.
        System.out.println("  ".repeat(indent) + this);

        for (int i = 0; i < count; i++) {

            FsItem f = children[i];

            if (f instanceof Directory) {

                // Si c'est un répertoire, afficher son contenu.
                ((Directory) f).list(indent + 1);

            } else {

                // Sinon, afficher simplement le fichier.
                System.out.println("  ".repeat(indent + 1) + f);
            }
        }
    }
}


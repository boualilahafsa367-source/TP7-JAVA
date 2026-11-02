
package com.example.tp;

// Classe principale pour tester le système de fichiers.
public class Main {

    public static void main(String[] args) {

        // Création du système de fichiers.
        FileSystem fs = new FileSystem();

        // Création des fichiers.
        FileItem f1 = new FileItem("doc.txt", 1200);
        FileItem f2 = new FileItem("image.png", 450000);
        FileItem f3 = new FileItem("notes.pdf", 80000);

        // Création du répertoire home.
        Directory home = new Directory("home");

        // Ajout de fichiers dans home.
        home.add(f1);
        home.add(f2);

        // Création d'un sous-répertoire docs.
        Directory docs = new Directory("docs");

        // Ajout d'un fichier dans docs.
        docs.add(f3);

        // Ajout de docs dans home.
        home.add(docs);

        // Ajout des éléments racine au système.
        fs.addRoot(home);
        fs.addRoot(new FileItem("readme.md", 3000));

        // Affichage de l'arborescence.
        System.out.println("=== Systeme de fichiers ===");
        fs.listAll();

        // Affichage de la taille totale.
        System.out.println("Taille totale : "
                + fs.totalSize() + " B");
    }
}

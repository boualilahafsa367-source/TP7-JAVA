
package com.example.tp;

// Classe représentant un fichier.
public class FileItem extends FsItem {

    // Taille du fichier en octets.
    private long size;

    // Constructeur.
    public FileItem(String name, long size) {
        super(name);
        this.size = size;
    }

    // Retourne directement la taille du fichier.
    @Override
    public long getSize() {
        return size;
    }
}


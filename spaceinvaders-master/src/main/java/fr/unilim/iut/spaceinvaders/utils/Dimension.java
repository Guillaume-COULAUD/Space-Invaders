package fr.unilim.iut.spaceinvaders.utils;

import fr.unilim.iut.spaceinvaders.Vaisseau;

public class Dimension {
	int longueur;
	int hauteur;

	public Dimension(int longueur, int hauteur) {
		this.longueur = longueur;
		this.hauteur = hauteur;
	}

	public  int longueur() {
		return this.longueur;
	}

	public int hauteur() {
		return this.hauteur;
	}

}
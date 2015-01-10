package Interfaces;

import java.util.ArrayList;

public interface GraphInterface 
{
	public ArrayList<VertexInterface> getAllVertices(); // Retourne le liste des Sommets
	
	public boolean isSuccessor(VertexInterface vSource, VertexInterface vSuccessor); // Verifier Si le sommet vSuccessor est le successeur du sommet vSource
	
	public int getWeight(VertexInterface src, VertexInterface dst); // Retourne le poids de l'arc d'origine src et de destination dst
	
	public int getNumberVertices(); // Retourne le nombre de sommets contenus dans le graphe

	public ArrayList<VertexInterface> getSuccessors(VertexInterface vertex); // Retourne les successeurs de vertex


}

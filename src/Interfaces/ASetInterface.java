package Interfaces;

import java.util.ArrayList;

/* Interface de l'ensemble des sommets */

public interface ASetInterface 
{
	public void add(VertexInterface vertex); //Ajouter un Sommet � l'ensemble des sommets
	public boolean contains(VertexInterface vertex); // Verifier si un Sommet appartient � l'ensemble des sommets
	public ArrayList<VertexInterface> getAllVertices(); // Retourne la liste des sommets

}

package Interfaces;

import Exceptions.DijkstraException;

public interface PreviousInterface 
{
	
	public void addVertex(VertexInterface v, VertexInterface vFather); //Ajout d'un père vFather au sommet v
	public VertexInterface getFatherVertex(VertexInterface v) throws DijkstraException ;

}

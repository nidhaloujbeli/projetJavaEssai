package Interfaces;

import Exceptions.DijkstraException;

public interface PiInterface 
{
	public void newPi(VertexInterface v, int val); // Permet de définir une nouvelle fonction Pi
	
	public void setPi(VertexInterface v, int val); // Définit l'attribut de Pi(v)
	
	public int getPi(VertexInterface v) throws DijkstraException;
}

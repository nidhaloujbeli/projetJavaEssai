package Interfaces;

import Exceptions.DijkstraException;

public interface PiInterface 
{
	public void newPi(VertexInterface v, int val); // Permet de d�finir une nouvelle fonction Pi
	
	public void setPi(VertexInterface v, int val); // D�finit l'attribut de Pi(v)
	
	public int getPi(VertexInterface v) throws DijkstraException;
}

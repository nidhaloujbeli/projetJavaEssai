package Interfaces;

public interface PiInterface 
{
	public void newPi(VertexInterface v, int val); // Permet de d�finir une nouvelle fonction Pi
	
	public void setPi(VertexInterface v, int val); // D�finit l'attribut de Pi(v)
	
	public int getPi(VertexInterface v); 
	/* Retourne La valeur de Pi(v), 
	une exception reste � pr�voir (le cas o� v ne fait pas partie du graph).
	 Donc une commande du type "throws Exception est � d�finir" */

}

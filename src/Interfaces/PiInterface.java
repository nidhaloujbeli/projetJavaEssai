package Interfaces;

public interface PiInterface 
{
	public void newPi(VertexInterface v, int val); // Permet de définir une nouvelle fonction Pi
	
	public void setPi(VertexInterface v, int val); // Définit l'attribut de Pi(v)
	
	public int getPi(VertexInterface v); 
	/* Retourne La valeur de Pi(v), 
	une exception reste à prévoir (le cas où v ne fait pas partie du graph).
	 Donc une commande du type "throws Exception est à définir" */

}

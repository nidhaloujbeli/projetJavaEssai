package Interfaces;

public interface PreviousInterface 
{
	
	public void addVertex(VertexInterface v, VertexInterface vFather); //Ajout d'un p�re vFather au sommet v
	public VertexInterface getFatherVertex(VertexInterface v); // Retourne le p�re d'un sommet v
	//Cette m�thode peut g�n�rer une exception (lorsque v n'appartient pas au graph)
	//Donc une exception reste � d�finir

}

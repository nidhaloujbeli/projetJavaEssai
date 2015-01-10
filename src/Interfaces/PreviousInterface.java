package Interfaces;

public interface PreviousInterface 
{
	
	public void addVertex(VertexInterface v, VertexInterface vFather); //Ajout d'un père vFather au sommet v
	public VertexInterface getFatherVertex(VertexInterface v); // Retourne le père d'un sommet v
	//Cette méthode peut générer une exception (lorsque v n'appartient pas au graph)
	//Donc une exception reste à définir

}

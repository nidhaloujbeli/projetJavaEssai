package dijkstra;
import java.util.ArrayList;

import Interfaces.VertexInterface;

public class Previous 
{
	private ArrayList<VertexInterface> vertex = new ArrayList<VertexInterface>();
	private ArrayList<VertexInterface> father = new ArrayList<VertexInterface>();

	public void addVertex(VertexInterface v, VertexInterface vFather) 
	{
		vertex.add(v);
		father.add(vFather);
	}
	
	public VertexInterface getFatherVertex(VertexInterface v) //Attention Exception reste à définir
	{
		
			return father.get(vertex.indexOf(v));
	}


}

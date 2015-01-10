package dijkstra;
import java.util.ArrayList;

import Exceptions.DijkstraException;
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
	
	public VertexInterface getFatherVertex(VertexInterface v) throws DijkstraException
	{
		
			if(vertex.indexOf(v) != -1)
				return father.get(vertex.indexOf(v));
			else
				throw new DijkstraException("Mauvaise demande d'index:Previous: getFatherVertex.");

	}


}

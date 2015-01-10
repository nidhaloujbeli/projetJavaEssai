package dijkstra;
import java.util.ArrayList;

import Interfaces.ASetInterface;
import Interfaces.VertexInterface;


public class ASet 
implements ASetInterface
{
	
	private ArrayList<VertexInterface> a = new ArrayList<VertexInterface>();

	public void addVertex(VertexInterface vertex) 
	{
		a.add(vertex);
	}

	public boolean containsVertex(VertexInterface vertex) 
	{
		return a.contains(vertex);
	}

	public ArrayList<VertexInterface> getAllVertices() 
	{
		return a;
	}

}

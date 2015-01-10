package dijkstra;
import java.util.ArrayList;

import Interfaces.ASetInterface;
import Interfaces.VertexInterface;


public class ASet 
implements ASetInterface
{
	
	private ArrayList<VertexInterface> a = new ArrayList<VertexInterface>();

	public void add(VertexInterface vertex) 
	{
		a.add(vertex);
	}

	public boolean contains(VertexInterface vertex) 
	{
		return a.contains(vertex);
	}

	public ArrayList<VertexInterface> getAllVertices() 
	{
		return a;
	}

}

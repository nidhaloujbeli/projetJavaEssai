package dijkstra;

import java.util.ArrayList;

import Interfaces.VertexInterface;

public class Pi 
{
	private ArrayList<VertexInterface> vertex = new ArrayList<VertexInterface>();
	private ArrayList<Integer> vertexWeight = new ArrayList<Integer>();

	public void newPi(VertexInterface v, int val)
	{
		vertex.add(v);
		vertexWeight.add(val);
	}
	
	public void setPi(VertexInterface v, int val) 
	{
		vertexWeight.set(vertex.indexOf(v), val);
	}
	
	public int getPi(VertexInterface v)  //Attention, une Exception reste à définir
	{
			return vertexWeight.get(vertex.indexOf(v));
		}

}

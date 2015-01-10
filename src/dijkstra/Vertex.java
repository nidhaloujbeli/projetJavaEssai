package dijkstra;

import Interfaces.VertexInterface;

public class Vertex 
implements VertexInterface
{
		private String label;
		public boolean equals(VertexInterface vertex)
		{
			if(this.getLabel().equals(vertex.getLabel())==true)
				return true;
			else
				return false;
		}
		
		public String getLabel()
		{
			return label;
		}
		
		public void setLabel(String label)
		{
			this.label=label;
		}


}
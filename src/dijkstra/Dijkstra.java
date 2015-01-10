package dijkstra;

import Exceptions.DijkstraException;
import Interfaces.ASetInterface;
import Interfaces.GraphInterface;
import Interfaces.PiInterface;
import Interfaces.PreviousInterface;
import Interfaces.VertexInterface;

public class Dijkstra 
{
			public static PreviousInterface dijkstra(GraphInterface g, ASetInterface a, VertexInterface r, PiInterface pi, PreviousInterface previous) throws DijkstraException{
			
			final int INFINITY = Integer.MAX_VALUE;
			int piMin;
			int nbrVertices = g.getNumberVertices();
			VertexInterface pivot = r;
			
			a.add(r);
			previous.addVertex(r, null);
			pi.newPi(r, 0);
			
			for(VertexInterface y : g.getAllVertices()){
				pi.newPi(y, INFINITY);
			}
			
			for(int j = 1 ; j < nbrVertices-1 ; j++){
				for(VertexInterface y : g.getSuccessors(pivot)){
					if(!(a.contains(y)))
						if(pi.getPi(pivot) + g.getWeight(pivot, y) < pi.getPi(y)){
							pi.setPi(y, pi.getPi(pivot) + g.getWeight(pivot, y));
							previous.addVertex(y, pivot);
						}
				}
				
				piMin = INFINITY;
				for(VertexInterface y : g.getAllVertices()){
					if(!(a.contains(y)) && piMin > pi.getPi(y)){
						pivot = y;
						piMin = pi.getPi(y);
					}	
				}
				a.add(pivot);
			}
			return previous;
		}

}

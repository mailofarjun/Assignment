package assignment;

import java.util.List;


// this is a dummy interface and needs to be wired to a graph library that provides bipartite matching
public interface Graph<K,V> {
	
	
	 void addEdge(Edge<K,V> e);
	 List<Edge<K,V>> getBipartiteMatch();
     void clear();
     boolean isCleared();
}

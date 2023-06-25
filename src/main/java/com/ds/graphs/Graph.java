package com.ds.graphs;

import java.util.List;

public interface Graph {

	enum GraphType {
		DIRECTED, UNDIRECTED
	}
	
	public void addEdge(Integer v11, Integer v2);

	public List<Integer> getAdjacentVertices(Integer vertex);
}

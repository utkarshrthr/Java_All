package com.ds.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacencyMatrixGraph implements Graph {

	private int vertices = 0;
	private GraphType graphType = GraphType.DIRECTED;
	private int[][] adjacencyMatrix;
	
	public AdjacencyMatrixGraph(GraphType graphType, Integer vertices){
		this.graphType = graphType;
		this.vertices = vertices;
		adjacencyMatrix = new int[vertices][vertices];
	}
	
	@Override
	public void addEdge(Integer v1, Integer v2) {	// a directed edge from v1 -> v2
		if(v1 < 0 || v1 >= vertices || v2 < 0 || v2 >= vertices ) {
			throw new RuntimeException("Invalid vertex");
		}
		adjacencyMatrix[v1][v2] = 1;
		if(this.graphType == GraphType.UNDIRECTED) {
			adjacencyMatrix[v2][v1] = 1;
		}
	}

	@Override
	public List<Integer> getAdjacentVertices(Integer vertex) {
		List<Integer> adjacentVertices = new ArrayList<>();
		
		for(int i = 0; i < vertices; i++ ) {
			if(adjacencyMatrix[vertices][i] == 1) {
				adjacentVertices.add(i);
			}
		}
		Collections.sort(adjacentVertices);
		return adjacentVertices;
	}
}

package com.ds.graphs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	int data;
	boolean isVisited;
	List<Vertex> neighbours;
	
	public Vertex(int d) {
		this.data = d;
		neighbours = new ArrayList<>();
	}
}

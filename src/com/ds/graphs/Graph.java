package com.ds.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	
	public void bfs(Vertex root) {
		Queue<Vertex> queue = new LinkedList<>();				// Initializing queue
		queue.add(root);										// add root vertex to the que
		while(!queue.isEmpty()) {								// iterate over queue while it is not empty
			Vertex vertex = queue.poll();						// get head of the queue 
			System.out.println(vertex.data);					// 		-> mark it as visited 
			vertex.isVisited = true;							//			-> iterate over the neighbors
			for(Vertex neighbour: vertex.neighbours) {			// 				-> mark each neighbor visited & add them to queue		
				if(!neighbour.isVisited) {
					neighbour.isVisited = true;		
					queue.add(neighbour);
				}
			}
		}
	}
}

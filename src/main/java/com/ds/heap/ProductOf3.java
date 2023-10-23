package com.ds.heap;

import java.util.*;

/*
*   Given an integer array A of size N. You have to find the product of the three largest integers in array A from range 1 to i,
*   where i goes from 1 to N. Return an array B where B[i] is the product of the largest 3 integers in range 1 to i in array A.
*   If i < 3, then the integer at index i in B should be -1.
*
* */
public class ProductOf3 {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));
        ProductOf3 p=new ProductOf3();
        ArrayList<Integer> out = p.solve(input);
        ArrayList<Integer> out1 = p.solve(new ArrayList<>(
                Arrays.asList(1, 2, 3)));
        ArrayList<Integer> out2 = p.solve(new ArrayList<>(
                Arrays.asList(1, 2)));
        ArrayList<Integer> out3 = p.solve(new ArrayList<>());
        ArrayList<Integer> out4 = p.solve(null);
        System.out.println(out);
        System.out.println(out1);
        System.out.println(out2);
        System.out.println(out3);
        System.out.println(out4);
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) { // [1, 2, 3, 4, 5]
        if(A == null)
            return A;

        ArrayList<Integer> out = new ArrayList<>();
        out.add(-1);
        out.add(-1);
        if(A.size() < 3){
            return out;
        }
        out.add(A.get(0)*A.get(1)*A.get(2));

        ArrayList<Integer> heap = new ArrayList<>();
        for(int i=0; i<3; i++){
            heap.add(A.get(i));
        }
        heapify(heap);
        for(int i=3; i<A.size(); i++){
            heap.add(A.get(i));
            heapify(heap);
            int e1 = getRoot(heap);
            int e2 = getRoot(heap);
            int e3 = getRoot(heap);
            out.add(e1*e2*e3);
            heap.add(e1);
            heap.add(e2);
            heap.add(e3);
            heapify(heap);
        }
        return out;
    }

    public ArrayList<Integer> solve2(ArrayList<Integer> A) { // [1, 2, 3, 4, 5]
        if(A == null)
            return A;

        ArrayList<Integer> out = new ArrayList<>();
        out.add(-1);
        out.add(-1);
        if(A.size() < 3){
            return out;
        }
        out.add(A.get(0)*A.get(1)*A.get(2));

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2-o1);
        for(int i=0; i<3; i++){
            pq.add(A.get(i));
        }

        for(int i=3; i<A.size(); i++){
            pq.add(A.get(i));
            int e1 = pq.poll();
            int e2 = pq.poll();
            int e3 = pq.poll();
            out.add(e1*e2*e3);
            pq.add(e1);
            pq.add(e2);
            pq.add(e3);
        }
        return out;
    }

    private int getRoot(ArrayList<Integer> heap){
        int root = heap.get(0);
        int lastIndex = heap.size()-1;
        swap(heap, 0, lastIndex);
        heap.remove(lastIndex);
        heapify(heap);
        return root;
    }

    private void heapify(ArrayList<Integer> heap){ // O(n)
        int firstNonLeafIndex = (heap.size() - 1)/2;
        while(firstNonLeafIndex >= 0){
            int currentIndex = firstNonLeafIndex;
            while (currentIndex < heap.size()){
                int leftChild = 2*currentIndex+1;
                int rightChild = 2*currentIndex+2;
                int maxIndex=currentIndex;
                if(leftChild < heap.size() && heap.get(leftChild) > heap.get(currentIndex)){
                    maxIndex = leftChild;
                }
                if(rightChild < heap.size() && heap.get(rightChild) > heap.get(maxIndex)){
                    maxIndex = rightChild;
                }
                if(maxIndex!=currentIndex){
                    swap(heap, currentIndex, maxIndex);
                    currentIndex = maxIndex;
                }
                else break;
            }
            firstNonLeafIndex--;
        }
    }

    private void swap(ArrayList<Integer> heap, int src, int dest){
        int temp = heap.get(src);
        heap.set(src, heap.get(dest));
        heap.set(dest, temp);
    }
}

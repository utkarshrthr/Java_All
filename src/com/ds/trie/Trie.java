package com.ds.trie;

public class Trie {
	
	public static final int ALPHABET_SIZE = 26;
	
	static class TrieNode {
		TrieNode[] children = new TrieNode[ALPHABET_SIZE];
		
		boolean isEndOfWord;
		
		public TrieNode() {
			isEndOfWord = false;
		}
	}
	
	public static TrieNode root;
	
	static void insert(String key) 
    { 
        int level; 
        int length = key.length(); 
        int index; 
       
        TrieNode pCrawl = root; 
       
        for (level = 0; level < length; level++) 
        { 
            index = key.charAt(level) - 'a'; 
            if (pCrawl.children[index] == null) 
                pCrawl.children[index] = new TrieNode(); 
       
            pCrawl = pCrawl.children[index]; 
        } 
        // mark last node as leaf 
        pCrawl.isEndOfWord = true; 
    } 
}

package trieImplementation_2;

import java.util.HashMap;

public class Trie_hashmap {

	static int numChar = 26;
	static TrieNode root;
	
	static class TrieNode{
		boolean isEndOfWord;
		HashMap<Character, TrieNode> hm;
		
		TrieNode(){
			isEndOfWord = false;
			hm = new HashMap<>();
		}
	};
	
	public static boolean search(String s){
		TrieNode first = root;
		
		for(int i=0;i<s.length();i++){
			char letter = s.charAt(i);
			
			if(first.hm.containsKey(letter))
				first = first.hm.get(letter);
			else
				return false;	
		}
		if(first.isEndOfWord)
			return true;
		return false;
	}
	
	public static void insert(String s){		
		TrieNode first = root;
		
		for(int i=0;i<s.length();i++){
			char letter = s.charAt(i);
			if(!first.hm.containsKey(letter)){
				TrieNode newnode = new TrieNode();
				first.hm.put(letter,newnode);
				first = newnode;
			}
			else{
				first = first.hm.get(letter);
			}
		}
		first.isEndOfWord = true;
	}
	
	public static void main(String[] args) {
		String input [] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};
		String output[] = {"Not present in trie", "Present in trie"};
		
		root = new TrieNode();
		
		for(int i=0;i<input.length;i++){
			insert(input[i]);
		}
		
		 // Search for different keys
		if(search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);
         
        if(search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);
        
        if(search("ans") == true)
            System.out.println("ans --- " + output[1]);
        else System.out.println("ans --- " + output[0]);

	}
}

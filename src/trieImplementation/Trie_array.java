package trieImplementation;

public class Trie_array {

	static int numChar = 26;
	static TrieNode root;
	
	static class TrieNode{
		boolean isEndOfWord;
		TrieNode [] allchar = new TrieNode[numChar];
		
		TrieNode(){
			isEndOfWord = false;
			for(int i=0;i<numChar;i++)
				allchar[i]=null;
		}
	};
	
	public static boolean search(String s){
		TrieNode first = root;
		
		for(int i=0;i<s.length();i++){
			int index = s.charAt(i) - 'a';
			
			if(first.allchar[index]!=null)
				first = first.allchar[index];
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
			int index = s.charAt(i) - 'a';
			if(first.allchar[index]==null){
				TrieNode newnode = new TrieNode();
				first.allchar[index] = newnode;
				first = newnode;
			}
			else{
				first = first.allchar[index];
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
		
	}

}

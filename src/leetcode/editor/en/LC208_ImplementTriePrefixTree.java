package src.leetcode.editor.en;

import jdk.dynalink.support.ChainedCallSite;

import javax.swing.*;

public class LC208_ImplementTriePrefixTree{
    //leetcode submit region begin(Prohibit modification and deletion)
class Trie {
    class TrieNode{
        private TrieNode[] children;
        private boolean isEnd;
        TrieNode(){
            children = new TrieNode[26];
            isEnd=false;
        }
        public boolean containsKey(char ch){
            return children[ch-'a']!=null;
        }
        public TrieNode get(char ch){
            return children[ch-'a'];
        }
        public void put(char c, TrieNode node){
            children[c-'a']=node;
        }
        public void setEnd(){
            isEnd=true;
        }
        public boolean isEnd(){
            return isEnd;
        }
    }
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char curr = word.charAt(i);
            if(!node.containsKey(curr)){
                node.put(curr,new TrieNode());
            }
            node = node.get(curr);
        }
        node.setEnd();
    }
    
    public boolean search(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(!curr.containsKey(c)) return false;
            curr = curr.get(c);
        }
        return curr.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if(!curr.containsKey(c)) return false;
            curr = curr.get(c);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
//leetcode submit region end(Prohibit modification and deletion)

}

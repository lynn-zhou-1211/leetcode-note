package src.leetcode.editor.en;

import com.sun.jdi.IntegerValue;

import java.lang.annotation.Target;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

public class LC146_LruCache {
    //leetcode submit region begin(Prohibit modification and deletion)
    class LRUCache {
        // 定义node
        class Node {
            int key;
            int value;
            Node prev;
            Node next;

            public Node() {
            }

            public Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        // 核心变量
        Map<Integer, Node> map;
        int capacity;
        int size;
        Node head;
        Node tail;


        public LRUCache(int capacity) {
            this.capacity = capacity;
            size = 0;
            map = new HashMap<>();

            head = new Node();
            tail = new Node();
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            if(map.containsKey(key)){
                Node node = map.get(key);
                // TODO:moveToHead
                deleteNode(node);
                addNode(node);
                return node.value;
            }else{
                return -1;
            }
        }

        public void put(int key, int value) {
            // find node
            // if exists, update
            if(map.containsKey(key)){
                Node node = map.get(key);
                node.value=value;
                // map:
                map.put(key,node);
                // list:move to head
                deleteNode(node);
                addNode(node);
            }
            // if not 判断是否已经存满，
            //   满：删除最后一个元素，存在开头
            //   不满：添加元素到开头
            else {
                Node newNode = new Node(key,value);
                map.put(key,newNode);
                if(size==capacity){
                    map.remove(tail.prev.key);
                    deleteNode(tail.prev);
                    addNode(newNode);
                }else {
                    addNode(newNode);
                    size++;
                }
            }
        }

        private void deleteNode(Node node){
            node.prev.next=node.next;
            node.next.prev = node.prev;
        }

        private void addNode(Node node){
            node.prev = head;
            node.next = head.next;

            head.next.prev = node;
            head.next=node;
        }

    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
//leetcode submit region end(Prohibit modification and deletion)

}

package src.leetcode.editor.en;
import java.util.*;

public class LC380_InsertDeleteGetrandomO1{
    //leetcode submit region begin(Prohibit modification and deletion)

    class RandomizedSet {
        private List<Integer> list;
        private Map<Integer, Integer> map; // Value -> Index in List
        private Random rand;

        public RandomizedSet() {
            list = new ArrayList<>();
            map = new HashMap<>();
            rand = new Random();
        }

        public boolean insert(int val) {
            if (map.containsKey(val)) return false;
            map.put(val, list.size());
            list.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) return false;

            int indexToRemove = map.get(val);
            int lastElement = list.get(list.size() - 1);

            // Swap the element to be removed with the last element
            list.set(indexToRemove, lastElement);
            map.put(lastElement, indexToRemove); // Update map for swapped element

            // Remove the last element in O(1)
            list.remove(list.size() - 1);
            map.remove(val);

            return true;
        }

        public int getRandom() {
            return list.get(rand.nextInt(list.size()));
        }
    }

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
//leetcode submit region end(Prohibit modification and deletion)

}

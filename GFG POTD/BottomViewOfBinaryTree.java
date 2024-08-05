class Solution {
    public void solve(Node root, int x, int y, Map<Integer, Pair<Integer, Integer>> mp) {
        // Base case
        if (root == null) {
            return;
        }
        
        if (!mp.containsKey(x) || mp.get(x).getKey() <= y) {
            mp.put(x, new Pair<>(y, root.data));
        }
        
        solve(root.left, x - 1, y + 1, mp);
        solve(root.right, x + 1, y + 1, mp);
    }
    
    public ArrayList<Integer> bottomView(Node root) {
        Map<Integer, Pair<Integer, Integer>> mp = new TreeMap<>();
        solve(root, 0, 0, mp);
        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Pair<Integer, Integer>> entry : mp.entrySet()) {
            ans.add(entry.getValue().getValue());
        }
        return ans;
    }

    class Pair<K, V> {
        private K key;
        private V value;
        
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
        
        public K getKey() {
            return key;
        }
        
        public V getValue() {
            return value;
        }
    }
}

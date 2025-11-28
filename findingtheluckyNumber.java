class Solution {
    public int findLucky(int[] arr) {
        java.util.Map<Integer, Integer> freq = new java.util.HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int result = -1;
        for (java.util.Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (num == count) {
                result = Math.max(result, num);
            }
        }

        return result;
    }
}

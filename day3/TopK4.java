import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public int[] topKFrequent(int[] nums, int k) {
//     Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
    Map<Integer, Integer> numFrequencyMap = new HashMap<>();
    for (int n : nums)
        numFrequencyMap.put(n, numFrequencyMap.getOrDefault(n, 0) + 1);

    PriorityQueue<Map.Entry<Integer, Integer>> topKElements = new PriorityQueue<>(
            (e1, e2) -> e1.getValue() - e2.getValue());

    for (Map.Entry<Integer, Integer> entry : numFrequencyMap.entrySet()) {
        topKElements.add(entry);
        if (topKElements.size() > k) {
            topKElements.poll();
        }
    }

    // Create a list of top k numbers
    int[] topNumbers = new int[k];

    int i = 0;
    while (!topKElements.isEmpty()) {
        topNumbers[i] = topKElements.poll().getKey();
        i++;
    }

    return topNumbers;
}
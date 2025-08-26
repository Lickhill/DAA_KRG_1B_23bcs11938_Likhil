package exp3;

import java.util.*;

class FreqOfEle {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> keys = new ArrayList<>(frequencyMap.keySet());
        Collections.sort(keys);
        for (int key : keys) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(key);
            pair.add(frequencyMap.get(key));
            result.add(pair);
        }
        return result;
    }

    public static void main(String[] args) {
        FreqOfEle solution = new FreqOfEle();
        int[] arr1 = { 1, 2, 3, 2, 1, 4, 5, 4, 4 };
        System.out.println("Frequency of elements for arr1: " + solution.countFreq(arr1));
        int[] arr2 = { 10, 20, 10, 30, 20, 10 };
        System.out.println("Frequency of elements for arr2: " + solution.countFreq(arr2));
    }
}

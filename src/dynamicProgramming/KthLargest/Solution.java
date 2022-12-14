package dynamicProgramming.KthLargest;

import java.util.PriorityQueue;

class KthLargest {
    //using min Heap
    PriorityQueue<Integer> heap = new PriorityQueue();
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int n : nums)
            add(n);

    }

    public int add(int val) {
        if(heap.size() < k)
            heap.offer(val);
        else if(heap.peek() <val)
        {
            heap.poll();
            heap.add(val);
        }
        return heap.peek();
    }

}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
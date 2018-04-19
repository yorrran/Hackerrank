import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap; 
    
    Solution(){
        this.minHeap = new PriorityQueue<Integer>();
        this.maxHeap = new PriorityQueue<Integer>(10, new comparatorMedian()); 
    }
    
    private static class comparatorMedian implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2){
            return o2-o1;
        }
    }
        
    private void addToList(int sizeofList, int value){
       if(sizeofList % 2 == 0) {
            maxHeap.add(value); 
        }
        else {
            minHeap.add(value);
        }
        
        if(!minHeap.isEmpty() && !maxHeap.isEmpty() && maxHeap.peek()>= minHeap.peek()){
            int minHeapRoot = minHeap.poll();
            int maxHeapRoot = maxHeap.poll();
            minHeap.add(maxHeapRoot);
            maxHeap.add(minHeapRoot);
         }
        
        
    }
        
    private double medianValue(int sizeofList){
        double res;
         
        if(sizeofList % 2 ==  0){
            res = (minHeap.peek() + maxHeap.peek())/2.0;   
        }
        else
        {
            res = maxHeap.peek();
        }
        return res;
            
    }
        

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Solution solution = new Solution();
        int[] a = new int[n];
        for(int a_i=0; a_i<n; a_i++){
            a[a_i] = in.nextInt();
            solution.addToList(a_i, a[a_i]);
            System.out.println(solution.medianValue(a_i+1));
        }
    }
}

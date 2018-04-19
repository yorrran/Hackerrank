import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static class MyQueue<T>{
        Stack<T> newQueue = new Stack<T>();
        Stack<T> oldQueue = new Stack<T>();
        
        private void enqueue(T num){
            newQueue.push(num);
        }
        
        private void stackQueue(){
            if(oldQueue.empty()){
            while(!newQueue.empty()){
                T queueNum = newQueue.pop();
                oldQueue.push(queueNum);
            }
         }
        }
        
        private void dequeue() {
            stackQueue();
            if(!oldQueue.empty()){
                oldQueue.pop();
            }
        }
        
        private T peek() {
            stackQueue();
            if(!oldQueue.empty()){
                return oldQueue.peek();
            }
            return null;
        }
        
    }
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node node = new Node();
    HashMap<Node, Integer> hm = new HashMap<Node, Integer>();
    Boolean checkCycle = false;
    if (head == null){
        return false;
    }
    else if (head.next==null){
        return false;
    }
    else{
        node = head;
        while(node!=null){
            if(hm.containsKey(node)){
                checkCycle = true;
                break;
            }
            hm.put(node, 1);
            node = node.next;
        }
        if (checkCycle){
            return true;
        }
        else{
            return false;
        }  
    
    }
    

}

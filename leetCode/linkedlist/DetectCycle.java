// Problem: https://leetcode.com/problems/linked-list-cycle

package leetcode.linkedlist;

import java.util.*;

public class DetectCycle {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        
        boolean result = false;
        HashMap<ListNode, Integer> visited = new HashMap<>();
        ListNode curr = head;

        while (curr != null) {
            if (!visited.containsKey(curr)) {
                visited.put(curr, 1);
            } else {
                result = true;
                break;
            }

            curr = curr.next;
        }

        return result;
    }
}

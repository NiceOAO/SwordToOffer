package day03复杂链表的复制;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    // Definition for a Node.
    class Node {
        int val;
        Node next;
        Node random;
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null){
            return null;
        }
        // 使用map来存储新旧链表节点的对应关系
        Map<Node, Node> map = new HashMap<>();
        Node oldNode = head;

        // 生成一个无指针的新链表
        while (oldNode != null){
            map.put(oldNode, new Node(oldNode.val));
            oldNode = oldNode.next;
        }

        // 通过map对应节点 构建新链表的 next 以及 random 的指向
        oldNode = head;
        while (oldNode != null) {
            map.get(oldNode).next = map.get(oldNode.next);
            map.get(oldNode).random = map.get(oldNode.random);
            oldNode = oldNode.next;
        }
        return map.get(head);
    }
}

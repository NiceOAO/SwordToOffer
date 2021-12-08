package day02从尾到头打印链表;

import java.util.Stack;

class Solution {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    /*
    使用栈来存储取出的值 循环即可
     */
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode listNode = head;
        while (listNode != null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        int size = stack.size();
        int[] list = new int[size];
        // 注意此处不能用 stack.size(); 会随着pop变短
        for (int i = 0; i < size; i++){
            list[i] = stack.pop().val;
        }
        return list;
    }

}

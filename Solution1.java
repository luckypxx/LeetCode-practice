package leetcode;


 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

class Solution1 {
    public boolean isPalindrome(ListNode head) {

        if(head == null){
            return true;
        }else if(head.next == null){
            return true;
        }else if(head.next.next == null){
            if(head.val == head.next.val){
                return true;
            }else{
                return false;
            }

        }else{
            ListNode node = head;
            int size = 0;
            while(node != null){

                node = node.next;
                size++;
            }
            int[] data = new int[size];
            node = head;
            size = 0;
            while(node != null){
                data[size++] = node.val;
                node = node.next;
            }
            for(int i = 0;i < data.length/2;++i){
                if(data[i] != data[data.length - 1 - i]){
                    return false;
                }
            }
        }

        return true;
    }
}

class Test1{
    public static void main(String[] args) {
        ListNode listNode0 =new ListNode(1);
        ListNode listnode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(-1);
        ListNode listNode3 = new ListNode(-1);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(1);
        listNode0.next = listnode1;
        listnode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        ListNode head = listNode0;
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.isPalindrome(head));

    }

}

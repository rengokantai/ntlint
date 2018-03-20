/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
 
 //jz algo8 04
public class L104MergekSortedLists {
    private Comparator<ListNode> ListNodeComparator = new Comparator<ListNode>() {
        public int compare(ListNode left, ListNode right) {
            return left.val - right.val;
        }
    };
    
    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    
    public ListNode mergeKLists(List<ListNode> lists) {  
        // write your code here
        if(lists.size()==0||lists==null){
            return null;
        }
        Queue<ListNode> heap = new PriorityQueue<ListNode>(lists.size(), ListNodeComparator);
        for(int i=0;i<lists.size();i++){
            if(lists.get(i)!=null){
                heap.offer(lists.get(i));
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(!heap.isEmpty()){
            ListNode head = heap.poll();

            tail.next = head;
            tail=head;
            if(head.next!=null){
                heap.offer(head.next);
            }
        
        }
        return dummy.next;
        
    }
}

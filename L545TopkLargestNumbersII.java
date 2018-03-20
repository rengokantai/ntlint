public class L545TopkLargestNumbersII {
    //jz algo8 3
    /*
    * @param k: An integer
    */
    private int maxSize;
    private Queue<Integer> minheap;
    
    public Solution(int k) {
        // do intialization if necessary
        minheap = new PriorityQueue<>();
        maxSize = k;
    }

    /*
     * @param num: Number to be added
     * @return: nothing
     */
    public void add(int num) {
        // write your code here
        if(minheap.size()<maxSize){
            minheap.offer(num);
            return;
        }
        if(num>minheap.peek()){
            minheap.poll();
            minheap.offer(num);
        }
    }

    /*
     * @return: Top k element
     */
    public List<Integer> topk() {
        // write your code here
        Iterator it = minheap.iterator();
        List<Integer> result = new ArrayList<Integer>();
        while(it.hasNext()){
            result.add((Integer)it.next());
        }
        Collections.sort(result,Collections.reverseOrder());
        return result;
    }
}

import java.util.*;

public class Heap {
    public static ListNode mergeKSortedListPQ(ListNode[] lists){
        PriorityQueue<ListNode> pQ = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for(ListNode lx:lists){
            while (lx != null){
                System.out.print(" "+lx.val);
                pQ.add(lx);
                lx = lx.next;
            }
        }
        ListNode headNode = null;
        ListNode rNode = null;
        System.out.println("\n");
        while (!pQ.isEmpty()){
            if(headNode == null){
                headNode = pQ.poll();
                System.out.print(" * "+headNode.val);
                rNode = headNode;
            }else {
                headNode.next = pQ.poll();
                headNode = headNode.next;
                System.out.print(" ** "+headNode.val);
            }
            headNode.next = null;
        }
        System.out.println("list node value: "+rNode.val);
        return rNode;
    }
    public static ListNode mergeKSortedList(ListNode[] lists){
        List<Integer> arrayList = new ArrayList<>();
        for(ListNode lx:lists){
            while (lx != null){
                arrayList.add(lx.val);
                lx = lx.next;
            }
        }

        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        ListNode head = null;
        ListNode next = null;
        for(Integer no:arrayList){
            ListNode node = new ListNode(no,null);
            if(next == null){
                head = node;
                next = node;
            }else {
                next.next = node;
                next = next.next;
            }
        }
        return head;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        Boolean isFirst = true;
        ListNode mHead = head;
        while (head != null){
            int count = 1;
            ListNode iHead = head;
            while (count <= k && head != null){
                count++;
                head = head.next;
            }
            if(count >=k){
                ListNode tHead = iHead;
                ListNode mH = head != null ? head.next : null;
                while (count> 1){
                    count--;
                    tHead = tHead.next;
                    iHead.next = mH;
                    mH = iHead;
                    iHead = tHead;
                }
                if(isFirst){
                    mHead = iHead;
                    isFirst = false;
                }
            }

        }
        return mHead;
    }

    public int smallestChair(int[][] times, int targetFriend) {
        int targetArrival = times[targetFriend][0], i=0;
        Arrays.sort(times, (x,y) -> x[0] - y[0]);
        PriorityQueue<int[]> queue = new PriorityQueue<>((x,y)->x[0]-y[0]);
        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();

        while(true) {
            while(!queue.isEmpty() && queue.peek()[0] <= times[i][0])
                availableChairs.offer(queue.poll()[1]);
            if(times[i][0] == targetArrival) break;
            queue.offer(new int[] {times[i++][1], availableChairs.isEmpty() ? queue.size():availableChairs.poll()});
        }
        return !availableChairs.isEmpty()? availableChairs.poll() : queue.size();
    }
}

import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Microsoft DSA Practice section");

        int[] arr = {2,0,3,0,1};
        int trappedWater = TrappingRainWater.trappedWater(arr);
        System.out.println("trapped Water:"+trappedWater);

        int[] arrBinary = { 1, 2, 3, 4, 5, 6, 7, 8};
        int positionOfValue = FirstOccurance.binarySearch(arrBinary, 5);
        System.out.println("position: "+String.valueOf(positionOfValue));

        int[] arrBinaryF = { 1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 8};
        int positionOfValueF = FirstOccurance.findFistOccurance(arrBinaryF, 5);
        System.out.println("first occourance: "+String.valueOf(positionOfValueF));

        int[] arrBinaryL = { 1, 1, 2, 3, 4, 4, 5, 5, 5, 5, 6, 7, 8};
        int positionOfValueL = FirstOccurance.findLastOccurance(arrBinaryL, 5);
        System.out.println("Last occourance: "+String.valueOf(positionOfValueL));

        int[] arrBinaryNoOfElement = { 1, 1, 2, 3, 4, 4, 5, 5, 5, 5, 6, 7, 8};
        int element = 5;
        int numberOfElement = FirstOccurance.findLastOccurance(arrBinaryNoOfElement, element) -
                FirstOccurance.findFistOccurance(arrBinaryF, element) + 1;
        System.out.println("numberOfElement: "+String.valueOf(numberOfElement));

//        long ans = SquareRoot.findSquareRootOfReal((long) 2);
//        System.out.println("squareroot of:5.4"+String.valueOf(ans));
        int[] arraySum2Element = { -2, -5, 0, 7, 2, -9, -7};
        TwoElementSum.printTwoElementWhoseSum(arraySum2Element, 9);

        int [] prefixArray = TwoElementSum.getPrefixSum(arraySum2Element);
        for(int i: prefixArray){
            System.out.print(""+i+", ");
        }
        LinkedList linkedList = new LinkedList();
        LinkedList.insert(linkedList,5);
        LinkedList.insert(linkedList,4);
        LinkedList.insert(linkedList,3);
        LinkedList.insert(linkedList,2);
        LinkedList.traverse(linkedList);

        String[] votes = {"FVSHJIEMNGYPTQOURLWCZKAX","AITFQORCEHPVJMXGKSLNZWUY","OTERVXFZUMHNIYSCQAWGPKJL","VMSERIJYLZNWCPQTOKFUHAXG","VNHOZWKQCEFYPSGLAMXJIUTR","ANPHQIJMXCWOSKTYGULFVERZ","RFYUXJEWCKQOMGATHZVILNSP","SCPYUMQJTVEXKRNLIOWGHAFZ","VIKTSJCEYQGLOMPZWAHFXURN","SVJICLXKHQZTFWNPYRGMEUAO","JRCTHYKIGSXPOZLUQAVNEWFM","NGMSWJITREHFZVQCUKXYAPOL","WUXJOQKGNSYLHEZAFIPMRCVT","PKYQIOLXFCRGHZNAMJVUTWES","FERSGNMJVZXWAYLIKCPUQHTO","HPLRIUQMTSGYJVAXWNOCZEKF","JUVWPTEGCOFYSKXNRMHQALIZ","MWPIAZCNSLEYRTHFKQXUOVGJ","EZXLUNFVCMORSIWKTYHJAQPG","HRQNLTKJFIEGMCSXAZPYOVUW","LOHXVYGWRIJMCPSQENUAKTZF","XKUTWPRGHOAQFLVYMJSNEIZC","WTCRQMVKPHOSLGAXZUEFYNJI"};
        System.out.println(RankTeam.byVotes(votes));

        ListNode[] listNodes = {new ListNode(-2, new ListNode(-1,new ListNode(-1, new ListNode(-1, null)))),
                null};
        ListNode node = Heap.mergeKSortedListPQ(listNodes);
        System.out.println("\n\n");
        while (node != null){
            System.out.print(" "+node.val);
            node = node.next;
        }

        Node first = new Node(9);
        first.next = new Node(4);

        Node second = new Node(7);
        second.next = new Node(3);

        Node ans = LinkedList.addTwoNumberLinkedList(first,second);
        LinkedList.traverseNode(ans);
        int[] as = {5,6,1,2,3,7,4,4,9};
        Array.findTwoElement(as, 8);
    }
}

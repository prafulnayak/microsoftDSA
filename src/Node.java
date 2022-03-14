public class Node {
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
}

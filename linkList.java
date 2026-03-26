public class linkList {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static node partition(node head, int x) {
        node small = new node(0);
        node big = new node(0);

        node smalll = small;
        node biggg = big;

        while (head != null) {

            if (head.data < x) {
                smalll.next = head;
                smalll = smalll.next;
            } else {
                biggg.next = head;
                biggg = biggg.next;
            }
            head = head.next; // ✅ move forward
        }

        // End big list
        biggg.next = null;
        // Connect small and big
        smalll.next = big.next;

        return small.next;
    }

    // Helper to print list
    static void print(node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        node head = new node(11);
        head.next = new node(5);
        head.next.next = new node(2);
        head.next.next.next = new node(3);
        head.next.next.next.next = new node(15);

        System.out.print("Before: ");
        print(head);

        head = partition(head, 11);

        System.out.print("After: ");
        print(head);
    }
}

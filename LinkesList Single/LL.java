class LL {
    Node start; // Head of the linked list

    // Inner class to represent a node in the linked list
    class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node

        // Constructor to initialize node with data
        Node(int data) {
            this.data = data;
            this.next = null; // By default, the next node is null
        }
    }

    // Method to insert a new node at the beginning of the list
    void insertfirst(int data) {
        Node newnode = new Node(data); // Create a new node with the given data
        if (start == null) { // If the list is empty
            start = newnode; // Make the new node the head of the list
            return;
        }
        // If the list is not empty, insert the new node at the beginning
        newnode.next = start; // Point new node's next to current head
        start = newnode; // Make new node the new head
    }

    // Method to insert a new node at the end of the list
    void insertlast(int data) {
        Node newnode = new Node(data); // Create a new node with the given data
        if (start == null) { // If the list is empty
            start = newnode; // Make the new node the head of the list
            return;
        }
        // If the list is not empty, traverse to the last node and insert the new node
        Node currNode = start;
        while (currNode.next != null) { // Traverse until the last node
            currNode = currNode.next;
        }
        currNode.next = newnode; // Point the last node's next to the new node
    }

    // Method to print the entire linked list
    void print() {
        if (start == null) { // If the list is empty
            System.out.println("List is empty");
            return; // Exit the method if the list is empty
        }
        Node currNode = start; // Start from the head
        while (currNode != null) { // Traverse the list until the last node
            System.out.print(currNode.data + " "); // Print current node's data
            currNode = currNode.next; // Move to the next node
        }
        System.out.println(); // Print a newline after the list
    }

    // Main method to test the linked list operations
    public static void main(String[] args) {
        LL obj = new LL(); // Create an object of the linked list

        // Inserting nodes at the beginning
        obj.insertfirst(4);
        obj.insertfirst(3);
        obj.insertfirst(2);
        obj.insertfirst(1);

        // Inserting nodes at the end
        obj.insertlast(5);
        obj.insertlast(6);
        obj.insertlast(7);

        // Printing the linked list
        obj.print();
    }
}

import java.util.Stack;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> Node<T> reverseList(Node<T> head) {
    Node<T> prev = null;
    Node<T> current = head;
    Node<T> temp;

    while (current != null) {
      temp = current.next;
      current.next = prev;
      prev = current;
      current = temp;
    }

    return prev;
  }

  public static void main(String[] args) {
    Node<String> x = new Node<>("x");
    Node<String> y = new Node<>("y");
    Node<String> z = new Node<>("z");

    x.next = y; // x -> y
    y.next = z;

    reverseList(x); // y -> x

    // Printing solution
    Node<String> head = Source.reverseList(x);

    while (head != null) {
      System.out.print(head.val + " ");
      head = head.next;
    }
  }
}
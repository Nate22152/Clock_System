public class Node<T> {
    public T averagehour;
    public Node<T> next;
    public Node<T> prev;
    public Node<T> down;

    public void setAveragehour(T averagehour) {
        this.averagehour = averagehour;
    }

    public void setdown(Node<T> down) {
        this.down = down;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    // Accessors
    public T getAveragehour() {
        return averagehour;
    }

    public Node<T> getDown() {
        return down;
    }

    public Node<T> getNext() {
        return next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public Node(T averagehour) {
        this.averagehour = averagehour;
    }
}

public class Node<T> {
    String info;
    Node<T> right;
    Node<T> left;
    Node<T> down;

    public Node(String info){
        this.info = info;
        this.right = null;
        this.left = null;
        this.down = null;
    }

    public String getInfo(){
        return info;
    }
    public void setInfo(String info){
        this.info = info;
    }
    public Node<T> getRight() {
        return right;
    }
    public void setRight(Node<T> right) {
        this.right = right;
    }
    public Node<T> getLeft() {
        return left;
    }
    public void setLeft(Node<T> left) {
        this.left = left;
    }
    public Node<T> getDown() {
        return down;
    }
    public void setDown(Node<T> down){
        this.down = down;
    }

}

package week7;

public class LinkedList<T> {

    private Node<T> first;
    private Node<T> last;

    int size;

    private class Node<T> {
        Node<T> next;
        Node<T> previous;
        T value;


        public Node(Node<T> next, Node<T> previous, T value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }
    }



    public void add(T value) {
        if (size == 0) {
            last = first = new Node<>(null, null, value);
            size++;
            return;
        }
        last.next = new Node<>(null, last, value);
        last = last.next;
        size++;
    }


    public String toString(){
        return toStringLinkedList(first, "[ ");
    }

    public String toStringLinkedList(Node<T> current, String str) {
        return current.next != null ? toStringLinkedList(current.next, str + current.value + ", ") : str + current.value + " ]";
    }

    public T getIndex(int index) {
        int i = 0;
        Node<T> temp = first;
        while (i != index) {
            temp = temp.next;
            i++;
        }
        return temp.value;
    }

    public void addByIndex(int index, T value) {
        if (size == 0) {
            Node<T> tNode = new Node<>(null, null, value);
            first = tNode;
            last = tNode;
            size++;
            return;
        }
        Node<T> temp = first;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        Node<T> after = temp.next;
        Node<T> tNode = new Node<>(null, null, value);
        tNode.next = after;
        tNode.previous = temp;
        temp.next = tNode;
        size++;
    }

    public void setByIndex(int index, T value) {
        Node<T> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.value = value;
    }

    public void removeByIndex(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        delete(getPosition(first, index, 0));
    }

    private Node<T> getPosition(Node<T> current, int index, int i) {
        return index != i ? getPosition(current.next, index, ++i) : current;
    }

    public void removeByValue(Node<T> current, T value) {
        if (current.value.equals(value)) {
            delete(current);
        } else if (current.next != null) {
            removeByValue(current.next, value);
        } else {
            System.err.println("There is not value like that");
            return;
        }
    }

    public void removeFromStart() {
        first = first.next;
        first.previous = null;
    }

    public void removeFromEnd() {
        last = last.previous;
        last.next = null;
    }

    private void delete(Node<T> trash) {
        Node<T> next = trash.next;
        Node<T> previous = trash.previous;
        if (previous != null) {
            previous.next = next;
        } else {
            first = next;
        }
        if (next != null) {
            next.previous = previous;
        }
        size--;
    }



}


package ru.innopolis.mputilov;

public class GenericStack2<T> implements Stack<T> {
    private Node<T> peek;

    @Override
    public void push(T item) {
        if (isEmpty()) {
            peek = new Node<>(null, null, item);
            return;
        }
        Node<T> newPeek = new Node<>(peek, null, item);
        peek.right = newPeek;
        peek = newPeek;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot pop from empty stack");
        }
        T popped = this.peek.item;
        peek = peek.left;
        return popped;
    }

    @Override
    public boolean isEmpty() {
        return peek == null;
    }

    @Override
    public T peek() {
        return peek.item;
    }

    /**
     * private class, no need for getters and setters
     *
     * @param <TT>
     */
    private static class Node<TT> {
        Node<TT> left;
        Node<TT> right;
        TT item;

        Node(Node<TT> left, Node<TT> right, TT item) {
            this.left = left;
            this.right = right;
            this.item = item;
        }

    }
}

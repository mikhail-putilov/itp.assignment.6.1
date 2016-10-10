package ru.innopolis.mputilov;

/**
 * Created by mputilov on 02/10/16.
 */
public class Main {
    public static void main(String[] args) {
        GenericStack2<Number> stack = new GenericStack2<>();
        stack.push(1);
        stack.push(1.23);
        stack.push(3);
        stack.push(0xf);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

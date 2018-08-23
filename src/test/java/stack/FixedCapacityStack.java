package stack;

import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

/**
 * @author jqq
 * @desc 定容栈实现以及测试用例
 * @date 2018/08/23
 * Copyright (c) 2015 jigoon
 **/
public class FixedCapacityStack<Item> {
    private Item[] a;
    private int N;

    public FixedCapacityStack(int cap) {
        this.a = (Item[])new Object[cap];
    }
    public boolean isEmpty() {
        return N == 0;
    }
    public int size() {
        return N;
    }
    public void push(Item item) {
        a[N++] = item;
    }
    public Item pop() {
        return a[--N];
    }

    public static void main(String[] args) {
        FixedCapacityStack<String> s = new FixedCapacityStack<>(100);
        Scanner scanner = new Scanner(System.in);
        //以0作为输入结束标识
        while (!scanner.hasNext("0")) {
            String item = scanner.next();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
}

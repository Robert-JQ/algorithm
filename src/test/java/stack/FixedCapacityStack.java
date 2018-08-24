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
        if (N == a.length) {
            resize(2 * a.length);
        }
        a[N++] = item;
    }

    public Item pop() {
        Item item = a[--N];
        //避免对象游离
        a[N] = null;
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }

    private void resize(int max) {
        //将大小为N < = max的栈移动到一个新的大小为max的数组中
        Item[] temp = (Item[])new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
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

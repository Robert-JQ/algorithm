package stack;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

/**
 * @author jqq
 * @desc 栈(stack)经典用例,栈是一种基于后进先出(LIFO)策略的数据结构
 * @date 2018/08/22
 * Copyright (c) 2015 jigoon
 **/
public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        //以0作为输入结束标识
        while (!scanner.hasNext("0")) {
            stack.push(scanner.nextInt());
        }
        for (int i : stack) {
            StdOut.println(i);
        }
    }
}

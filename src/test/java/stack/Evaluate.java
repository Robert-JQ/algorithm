package stack;

import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author jqq
 * @desc 用栈实现计算算术简单表达式的值,简单起见,这段代码假设表达式没有省略任何括号,
 *       数字和字符均以空白字符相隔(注意:需要严格按照这种松散的格式输入)
 * @date 2018/08/22
 * Copyright (c) 2015 jigoon
 **/
public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("0")) {
            //读取字符,如果是运算符则压入栈
            String s = scanner.next();
            if (s.equals("(")) {

            } else if (s.equals("+")) {
                ops.push(s);
            } else if (s.equals("-")) {
                ops.push(s);
            } else if (s.equals("*")) {
                ops.push(s);
            } else if (s.equals("/")) {
                ops.push(s);
            } else if (s.equals("sqrt")) {
                ops.push(s);
            } else if (s.equals(")")) {
                //如果字符为")",弹出运算符和操作数,计算结果并压入栈
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) {
                    v = vals.pop() + v;
                } else if (op.equals("-")) {
                    v = vals.pop() - v;
                } else if (op.equals("*")) {
                    v = vals.pop() * v;
                } else if (op.equals("/")) {
                    v = vals.pop() / v;
                } else if (op.equals("sqrt")) {
                    v = Math.sqrt(v);
                }
                vals.push(v);
            } else {
                //如果字符既非运算符也不是括号,将它作为double值压入栈
                vals.push(Double.parseDouble(s));
            }
        }
        StdOut.println(vals.pop());
    }
}

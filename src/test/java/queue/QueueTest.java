package queue;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

/**
 * @author jqq
 * @desc 队列(queue)经典用例,队列是一种基于先进先出(FIFO)策略的数据结构
 * @date 2018/08/17
 * Copyright (c) 2015 jigoon
 **/
public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        Scanner scanner = new Scanner(System.in);
        //以0作为输入完毕的标识
        while (!scanner.hasNext("0")) {
            queue.enqueue(scanner.nextInt());
        }
        int N = queue.size();
        for (int i = 0; i < N; i++) {
            StdOut.println(queue.dequeue());
        }
    }
}

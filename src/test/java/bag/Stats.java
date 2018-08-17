package bag;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

/**
 * @author jqq
 * @desc 背包经典用例,
 * @date 2018/08/15
 * Copyright (c) 2015 jigoon
 **/
public class Stats {
    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<>();
        Scanner scanner = new Scanner(System.in);
        //以0作为输入完毕的标识
        while (!scanner.hasNext("0")) {
            numbers.add(scanner.nextDouble());
        }
        int N = numbers.size();
        double sum = 0.0;
        for (double x : numbers) {
            sum += x;
        }
        double mean = sum / N;
        sum = 0.0;
        for (double x : numbers) {
            sum += (x - mean) * (x - mean);
        }
        double std = Math.sqrt(sum / (N - 1));
        StdOut.printf("Mean:%.2f\n", mean);
        StdOut.printf("Std dev:%.2f\n", std);
    }
}

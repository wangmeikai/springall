package com.wmk;

import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0){
            System.out.println(0);
        }else {
            Node[] nodes = new Node[n];
            for (int i = 0;i < n; i ++){
                nodes[i] = new Node(in.nextInt(),in.nextInt());
            }

            BigInteger bigInteger = new BigInteger("0");
            for (int i = 0;i < n;i++){
                bigInteger = bigInteger.add(new BigInteger(nodes[i].getY()+""));
            }
            BigInteger middle = bigInteger.divide(new BigInteger(n + ""));
            int middleInt = middle.intValue();

            BigInteger sum = new BigInteger("0");
            for (int i = 0;i < n;i++){
                sum = sum.add(new BigInteger((Math.abs(nodes[i].getY()-middleInt))+""));
            }
            System.out.println(sum);
        }

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println((int) Math.pow(2,31));
    }

    static class Node{
        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}


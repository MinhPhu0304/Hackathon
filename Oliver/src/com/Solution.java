package com;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {
        if (head == null) {
            return false;
        }
        Set<Integer> traversedNodes = new HashSet<>();

        SinglyLinkedListNode thisNode = head;


        while (thisNode != null) {
            if (traversedNodes.contains(thisNode.data)) {
                return true;
            }
            else {
                traversedNodes.add(thisNode.data);

                try {
                    thisNode = thisNode.next;
                }
                catch (NullPointerException npex) {
                    thisNode = null;
                }
            }
        }

        return false;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println(hasCycle(list.head));
        list.insertNode(3);
        System.out.println(hasCycle(list.head));
        list.insertNode(4);
        list.insertNode(5);
        list.insertNode(3);
        System.out.println(hasCycle((list.head)));
        list.insertNode(2);
        list.insertNode(3);
        System.out.println(hasCycle(list.head));
    }
}

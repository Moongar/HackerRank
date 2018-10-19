package com.moses;

import java.util.ArrayList;

public class LinkedListTutorials {
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
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertNode(12);
        list.insertNode(25);
        list.insertNode(46);
        list.insertNode(55);

        printLinkedList(reverse(list.head));

    }
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if(head==null) return null;
        else if (head.next==null) return head;
        else{
            SinglyLinkedListNode prevNode=null;
            SinglyLinkedListNode currentNode=head;
            SinglyLinkedListNode nextNode=null;
            while (currentNode != null) {
                nextNode = currentNode.next;
                currentNode.next = prevNode;
                prevNode = currentNode;
                currentNode = nextNode;
            }
            return prevNode;
        }
    }

    static void printLinkedList(SinglyLinkedListNode head) {
        while ( head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if (head == null){
            head = new SinglyLinkedListNode(data);
        } else {
            SinglyLinkedListNode node = head;
            while (node.next != null) node = node.next;
            node.next = new SinglyLinkedListNode(data);
        }
        return head;
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
        if(head==null){
            head = new SinglyLinkedListNode(data);
        } else {
            SinglyLinkedListNode node=new SinglyLinkedListNode(data);
            node.next=head;
            head=node;
        }
        return head;
    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        if (head == null){
            head = new SinglyLinkedListNode(data);
        } else {
            if(position==0){
                SinglyLinkedListNode node=new SinglyLinkedListNode(data);
                node.next=head;
                head=node;
            } else {
                SinglyLinkedListNode node=head;
                for(int i=1;i<position;i++){
                    node=node.next;
                }
                SinglyLinkedListNode newNode=new SinglyLinkedListNode(data);
                newNode.next=node.next;
                node.next=newNode;
            }
        }
        return head;
    }

    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if(position==0){
            if(head.next==null) return null;
            else{
                head=head.next;
            }
        } else {
            SinglyLinkedListNode node=head;
            for(int i=1;i<position;i++){
                node=node.next;
            }
            node.next=node.next.next;
        }
        return head;
    }

    static void reversePrint(SinglyLinkedListNode head) {
        if(head!=null){
            ArrayList<Integer> A=new ArrayList<>();
            A.add(head.data);
            while(head.next!=null){
                head=head.next;
                A.add(head.data);
            }
            for(int i=A.size()-1;i>=0;i--) System.out.println(A.get(i));
        }
    }

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if(head1.data!=head2.data) return false;
        SinglyLinkedListNode node1=head1;
        SinglyLinkedListNode node2=head2;
        while(node1.next!=null && node2.next!=null){
            node1=node1.next;
            node2=node2.next;
            if(node1.data!=node2.data) return false;
        }
        if(node2.next!=null || node1.next!=null) return false;
        return true;
    }
}

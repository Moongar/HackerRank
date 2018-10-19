package com.moses;

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

        printLinkedList(insertNodeAtPosition(list.head,10, 2));

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
}

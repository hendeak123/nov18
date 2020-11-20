package com.company;

public class Main {

    public static void main(String[] args) {
        ILinkedList<String> linkedList = new LinkedList<String>();
        linkedList.initializeList("testing", 21);
        linkedList.append("tacos", 31);
        linkedList.append("chicken nugget", 12);
        INode<String> theNode = linkedList.getHead();
        while (theNode != null) {
            System.out.println(theNode);
            theNode = theNode.getNext();
        }
        INode<String> foundNode = linkedList.findNode(31);
        System.out.println(foundNode);
        linkedList.removeNode(12);
        theNode = linkedList.getHead();
        while (theNode != null) {
            System.out.println(theNode);
            theNode = theNode.getNext();
        }
    }
}


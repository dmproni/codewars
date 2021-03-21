package ru.pdl.codewards;

public class LinkedListToAStringConverterNode {
  private int data;
  private LinkedListToAStringConverterNode next;

  public LinkedListToAStringConverterNode(int data, LinkedListToAStringConverterNode next) {
    this.data = data;
    this.next = next;
  }

  public LinkedListToAStringConverterNode(int data) {
    this.data = data;
    this.next = null;
  }

  public int getData() {
    return data;
  }

  public LinkedListToAStringConverterNode getNext() {
    return next;
  }
}

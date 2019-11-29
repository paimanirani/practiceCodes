package org.general;

public class MyQueue<E> {
	private Node firstNode;
	private Node currentNode;
	private int size;

	public MyQueue() {
		firstNode = null;
		currentNode = null;
		size = 0;
	}

	public void push(E element) {
		Node tempNode = currentNode;
		currentNode = new Node(element);
		if (!this.ifExists()) {
			firstNode = currentNode;
		} else {
			tempNode.setNext(currentNode);
		}
		size++;
	}

	public E pop() {
		if (this.ifExists()) {
			E result = (E) firstNode.getElement();
			firstNode = firstNode.getNext();
			size--;
			return result;
		}
		return null;
	}

	public boolean ifExists() {
		if (this.size != 0) {
			return true;
		}
		return false;
	}

	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		MyQueue<Integer> myQueue = new MyQueue<>();
		myQueue.push(5);
		myQueue.push(10);
		myQueue.push(15);
		myQueue.push(20);
		int size = myQueue.getSize();

		for (int i = 0; i < size; i++) {
			System.out.println(myQueue.pop());
		}

	}
}

class Node<E> {
	private E element;
	private Node next;

	public Node(E element) {
		this.element = element;
		next = null;
	}

	public void setNext(Node node) {
		next = node;
	}

	public Node getNext() {
		return next;
	}

	public E getElement() {
		return element;
	}
}
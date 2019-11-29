package org.lint.practice;

public class ReverseFirst_N_LinkedList {

	public static void main(String[] args) {

		MyLinkedList ll = new MyLinkedList();
		 ll.add(5);
		 ll.add(9);
		 ll.add(3);
		 ll.add(1);
		 ll.add(7);
		 ll.add(2);
		 ll.add(4);

		System.out.println("Linked List: " + ll);
		System.out.println("");

		ll.delete(3);
		System.out.println("Delete index 3: " + ll);
		System.out.println("");

		ll.reverse(3);
		System.out.println("Reverse first 3 index: " + ll);
		System.out.println("");

		ll.reverse(2);
		System.out.println("Reverse first 2 index: " + ll);
		System.out.println("");

		 ll.reverse(1);
		 System.out.println("Reverse first 1 index: " + ll);
		 System.out.println("");

	}

}

class MyLinkedList {
	int size = 0;
	Node start;
	Node current;

	public void add(int n) {
		if (isEmpty()) {
			start = new Node(n);
			current = start;
		} else {
			current.nextNode = new Node(n);
			current = current.nextNode;
		}
		size++;
	}

	public void delete(int index) {
		if (index > size - 1) {
			throw new IndexOutOfBoundsException("Index out of bound!!!");
		}
		int count = 0;
		Node tempCurrent = start;
		Node previous = null;
		Node next = null;

		while (count <= index) {
			if (count == 0) {
				previous = null;
				next = tempCurrent.getNextNode();
			} else {
				previous = tempCurrent;
				tempCurrent = next;
				next = next.getNextNode();
			}
			count++;
		}

		previous.setNextNode(next);
		size--;
	}

	public boolean isEmpty() {
		if (this.start == null || size() == 0) {
			return true;
		}
		return false;
	}

	public int size() {
		return size;
	}

	public void reverse(int a) {
		int count = 0;
		Node tempCurrent = start;
		Node tempLast = null;
		Node previous = null;
		Node next = null;
		/**
		 * null->5->9->3 (where 5 is start) after reversing 3->9->5->null we need to
		 * replace null after "5" with the remaining elements(tempLast.nextNode)
		 */
		if (a > 1 && a < size()) {
			while (count < a) {
				if (count == 0) {
					previous = tempCurrent.getNextNode();
					tempCurrent.setNextNode(null);
					tempLast = tempCurrent;
				} else {
					next = tempCurrent;
					tempCurrent = previous;
					previous = previous.getNextNode();
					tempCurrent.setNextNode(next);
				}

				start = tempCurrent;
				count++;
			}
			tempLast.nextNode = previous;
		}

	}

	@Override
	public String toString() {
		int count = 0;
		Node temp = this.start;
		StringBuffer sf = new StringBuffer().append("[ ");
		while (count < size) {
			if (count != 0) {
				sf.append(", ");
			}
			sf.append(temp.value);
			temp = temp.nextNode;
			count++;
		}
		return sf.append(" ]").toString();
	}

}

class Node {
	int value;
	Node nextNode;

	Node(int value) {
		this.value = value;
		this.nextNode = null;
	}

	public int getValue() {
		return value;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

}

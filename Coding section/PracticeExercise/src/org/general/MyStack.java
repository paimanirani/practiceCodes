package org.general;

public class MyStack<E> {
	private Node top;

	MyStack() {
		top = null;
	}

	public void push(E element) {
		Node temp = top;
		top = new Node(element);
		top.setBottomNode(temp);
	}

	public E pop() {
		if (top == null) {
			return null;
		} else {
			E result = top.getValue();
			top = top.getBottomNode();
			return result;
		}
	}

	class Node {
		Node bottomNode;
		E value;

		Node(E element) {
			value = element;
			bottomNode = null;
		}

		public Node getBottomNode() {
			return bottomNode;
		}

		public void setBottomNode(Node bottomNode) {
			this.bottomNode = bottomNode;
		}

		public E getValue() {
			return value;
		}

		public void setValue(E value) {
			this.value = value;
		}

	}
}

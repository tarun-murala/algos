package com.tarun;

/**
 * The Binary values are stored as part of linked list like 0->1->1->0
 * Should return a intValue of it.
 * Implementing separate Node construct
 * @author tarun.murala
 */
public class GetBinaryFromLinkedList {
	// Node Reference
	class Node {
		int value;
		Node next = null; 
		
		public Node(int intValue) {
			this.value = intValue;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
	
	Node head;
	int count = 0;
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getCount() {
		return count;
	}

	public GetBinaryFromLinkedList(int[] array) {
		if(null != array && array.length > 0) {
			this.count = array.length;
			for (int i = 0; i < array.length; i++) {
				if(array[i] == 0 || array[i] == 1) {
					GetBinaryFromLinkedList.Node node = new GetBinaryFromLinkedList.Node(array[i]);
					if(null == this.getHead()) {
						this.setHead(node);
					} else {
						GetBinaryFromLinkedList.Node iteratorNode = this.getHead();
						while(null != iteratorNode.getNext()) {
							iteratorNode = iteratorNode.getNext();
						}
						iteratorNode.setNext(node);
					} 
				} else {
					throw new IllegalArgumentException("Input can be O's or 1's");
				}
			}
		}
	}
	
	public void printSequence() {
		if(null != this.head) {
			GetBinaryFromLinkedList.Node node = this.head;
			while(null != node.getNext()) {
				System.out.print(node.getValue() + " | ");
				node = node.getNext();
			}
			System.out.println();
		}
	}
	
	public int getValue() {
		int sum = 0;
		if(null != head) {
			int index = this.count-1;
			Node node = this.head;
			while(null != node) {
				//System.out.println("Node Value: " + node.getValue() + ": Index: 2^" + index);
				sum += (node.getValue()*Math.pow(2,index));
				node = node.getNext();
				index -= 1;
				//System.out.println("Intermediate Sum: " + sum);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] intArray = new int[] {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
		GetBinaryFromLinkedList getBinaryFromLinkedList = new GetBinaryFromLinkedList(intArray);
		System.out.println("Sum: " + getBinaryFromLinkedList.getValue());
		
		intArray = new int[] {0, 0, 0, 0, 0, 1, 0, 1, 1, 1};
		getBinaryFromLinkedList = new GetBinaryFromLinkedList(intArray);
		System.out.println("Sum: " + getBinaryFromLinkedList.getValue());
	}

}

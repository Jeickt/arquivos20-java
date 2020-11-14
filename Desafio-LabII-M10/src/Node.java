public class Node {
	private Object data;
	private Node nextNode;
	private Node previousNode;

	public Node(Object object) {
		this(object, null);
	}

	// create Node that refers to Object and to next Node
	public Node(Object object, Node node) {
		data = object;
		nextNode = node;
	}

	// return reference to data in node
	public Object getData() {
		return data;
	}

	public void setData(Object element) {
		data = element;
	}

	// return reference to next node in list
	public Node getNext() {
		return nextNode;
	}

	public void setNext(Node o) {
		nextNode = o;
	}

	// return reference to next node in list
	public Node getPrevious() {
		return previousNode;
	}

	public void setPrevious(Node o) {
		previousNode = o;
	}
} // end class Node

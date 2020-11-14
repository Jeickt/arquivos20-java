public class List {
	private Node firstNode;
	private Node lastNode;
	private String name; // string like "list" used in printing

	// construct empty List with "list" as the name
	public List() {
		this("list");
	}

	// construct an empty List with a name
	public List(String listName) {
		name = listName;
		firstNode = lastNode = null;
	}

	public Node getFirst() {
		return firstNode;
	}

	public Node getLast() {
		return lastNode;
	}

	// insert Object at front of List
	public void insertAtFront(Object insertItem) {
		Node n = new Node(insertItem);
		if (isEmpty()) // firstNode and lastNode refer to same object
			firstNode = lastNode = n;

		else {
			firstNode.setPrevious(n);
			n.setNext(firstNode);
			firstNode = n;
		}
	}

	// remove first node from List
	public Object removeFromFront() throws EmptyListException {
		if (isEmpty()) // throw exception if List is empty
			throw new EmptyListException(name);

		Object removedItem = firstNode.getData(); // retrieve data being removed

		// update references firstNode and lastNode
		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.getNext();
		firstNode.setPrevious(null);

		return removedItem; // return removed node data
	} // end method removeFromFront

	// insert Object at end of List
	public void insertAtBack(Object insertItem) {
		Node n = new Node(insertItem);
		if (isEmpty()) // firstNode and lastNode refer to same Object
			firstNode = lastNode = n;

		else {
			lastNode.setNext(n);
			n.setPrevious(lastNode);
			lastNode = n;
		}
	}

	// remove last node from List
	public Object removeFromBack() throws EmptyListException {
		if (isEmpty()) // throw exception if List is empty
			throw new EmptyListException(name);

		Object removedItem = lastNode.getData(); // retrieve data being removed

		// update references firstNode and lastNode
		if (firstNode == lastNode)
			firstNode = lastNode = null;

		else { // locate new last node
			Node beforeLast = lastNode.getPrevious();
			lastNode = beforeLast;
			lastNode.setNext(null);
		}

		return removedItem; // return removed node data

	} // end method removeFromBack

	// determine whether list is empty
	public boolean isEmpty() {
		return firstNode == null; // return true if List is empty
	}
	
	public void insert(String s) {
		Node n = new Node(s);
		if (isEmpty())
			firstNode = lastNode = n;
		else if (s.compareTo(((String) (firstNode.getData()))) < 0)
			insertAtFront(s);
		else if (s.compareTo(((String) (lastNode.getData()))) > 0)
			insertAtBack(s);
		else {
			Node current = firstNode;
			while (true) {
				if (s.compareTo(((String) current.getData())) == 0)
					break;
				else if (s.compareTo(((String) current.getData())) > 0)
					current = current.getNext();
				else {
					Node prev = current.getPrevious();
					prev.setNext(n);
					current.setPrevious(n);
					n.setPrevious(prev);
					n.setNext(current);
					break;
				}
			}
		}
	}
	
	public void printAscending() {
		if (isEmpty()) {
			System.out.println("Empty " + name);
			return;
		}

		System.out.print("The " + name + " is: ");
		Node current = firstNode;

		// while not at end of list, output current node's data
		while (current != null) {
			System.out.print(current.getData().toString() + " ");
			current = current.getNext();
		}

		System.out.println("\n");
	}
	
	public void printDescending() {
		if (isEmpty()) {
			System.out.println("Empty " + name);
			return;
		}

		System.out.print("The " + name + " is: ");
		Node current = lastNode;

		// while not at end of list, output current node's data
		while (current != null) {
			System.out.print(current.getData().toString() + " ");
			current = current.getPrevious();
		}

		System.out.println("\n");
	}
	
}
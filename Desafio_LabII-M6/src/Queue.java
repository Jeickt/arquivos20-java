public class Queue {
	protected int first = 0, last = -1;

	protected Object q[];

	public Queue(int size) {
		q = new Object[size];
	}

	public boolean isEmpty() {
		if (last == first - 1)
			return true;
		return false;
	}

	public boolean isFull() {
		if (last == q.length - 1)
			return true;
		return false;
	}

	/* Insert the element in the final of this queue */
	public void enqueue(Object element) throws OverflowException {
		if (isFull()) {
			throw new OverflowException();
		} else {
			last++;
			q[last] = element;
		}
	}

	/* Retrives and remove the first element of this queue */
	public Object dequeue() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		} else {
			Object o = q[first];
			q[first] = null;
			first++;
			return o;
		}
	}
	
	
	
	public Queue merge(Queue q1, Queue q2){
		Queue q3 = new Queue(30);
		return q3;
		
	}
	
	public static Queue makeQueueFromStack(Stack s) throws UnderflowException, OverflowException {
		Stack sta = new Stack(1000000);
		int count = 0;
		while(!s.isEmpty()) {
			sta.push(s.pop());
			count++;
		}
		Queue que = new Queue(count);
		while(!sta.isEmpty()) {
			que.enqueue(sta.pop());
			count++;
		}
		return que;
	}

	public static void main(String args[]) {
		Queue q = new Queue(5);
		System.out.println("Vazia=" + q.isEmpty());
		try {
			q.enqueue("1");
			q.enqueue("2");
			q.enqueue("3");
			q.enqueue("4");
		} catch (OverflowException e) {
			System.out.println(e.toString());
		}
		try {
			q.dequeue();
			q.dequeue();
			System.out.println(q.isEmpty());
			q.dequeue();
			q.dequeue();
			q.dequeue();
		} catch (UnderflowException e) {
			System.out.println(e.toString());
		}
		System.out.println("Vazia=" + q.isEmpty());
		try {
			q.enqueue("3");
			q.enqueue("4");
		} catch (OverflowException e) {
			System.out.println(e.toString());
		}

	}
}

public class EmptyListException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	// no-argument constructor
	public EmptyListException() {
		this("List"); // call other EmptyListException constructor
	}

	// constructor
	public EmptyListException(String name) {
		super(name + " is empty"); // call superclass constructor
	}

} // end class EmptyListException

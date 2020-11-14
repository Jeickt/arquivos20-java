public class ListTest {

	public static void main(String args[]) {
		List list = new List(); // create the List container

		// insert references to objects in list
		list.insert("Alex");
		list.insert("Mar�lia");
		list.insert("Thomas");
		list.insert("Ingrid");
		list.insert("Carolina");
		list.insert("Ver�nica");
		list.insert("Carlos");
		list.insert("J�lio");
		list.insert("Ab�lio");
		list.insert("Volmir");
		list.printAscending();
		list.printDescending();
		
		// remove objects from list; print after each removal
		try {
			Object removedObject = list.removeFromFront();
			System.out.println(removedObject.toString() + " removed");
			list.printAscending();

			removedObject = list.removeFromFront();
			System.out.println(removedObject.toString() + " removed");
			list.printAscending();

			removedObject = list.removeFromBack();
			System.out.println(removedObject.toString() + " removed");
			list.printDescending();

			removedObject = list.removeFromBack();
			System.out.println(removedObject.toString() + " removed");
			list.printDescending();

			// list.remove (integer);
			// list.print();

		} // end try block

		// catch exception if remove is attempted on an empty List
		catch (EmptyListException emptyListException) {
			emptyListException.printStackTrace();
		}
	}

} // end class ListTest

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new List();  // create the List container

	      
	      // insert references to objects in list
	      list.insertAtFront( new Integer(4) );
	      //list.print();
	      list.insertAtFront( new Integer(8) );
	      //list.print();
	      list.insertAtBack( new Integer(6) );
	      //list.print();
	      list.insertAtBack( new Integer(2) );
	      //list.print();
	      list.insertAtBack( new Integer(5) );
	      //list.print();
	      list.insertAtBack( new Integer(7) );
	      list.print();

	      if (list.troca_ter_quarto())
	    	  list.print();
	      
	      if (list.remove_impar())
	    	  list.print();
	      
	      list = list.interrogacao();
	      list.print();
	}
}
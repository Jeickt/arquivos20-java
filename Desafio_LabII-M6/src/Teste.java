public class Teste {

	public static void main(String[] args) {
		
		Stack pilha = new Stack(10);
		try {
			for (int i=0; i<10; i++)
			{
				pilha.push(i);
			}
		} catch (OverflowException e) {
			e.printStackTrace();
		}
		System.out.println(pilha);
	}

}
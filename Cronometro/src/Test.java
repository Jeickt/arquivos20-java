public class Test {

	public static void main(String[] args) {
		cronometro(654);
	}
	
	public static void cronometro(int min) {
		int hor = min / 60;
		int i, j, k;
		for (i = 0; i <= hor; i++) {
			if (min < 60) {
				for (j = 0; j < min; j++) {
					for (k = 0; k < 60; k++) {
						System.out.printf("%02d:%02d:%02d\n", i, j, k);
						try{
						     Thread.sleep(1000);
						}catch(Exception e){}
					}
					k = 0;
				}
				j = 0;
			}
			else {
				for (j = 0; j < 60; j++) {
					for (k = 0; k < 60; k++) {
						System.out.printf("%02d:%02d:%02d\n", i, j, k);
						try{
						     Thread.sleep(1000);
						}catch(Exception e){}
					}
					k = 0;
				}
				j = 0;
				min -= 60;
			}
		}
		System.out.println("CAMPAÍÍÍÍÍNHA!");
	}
}

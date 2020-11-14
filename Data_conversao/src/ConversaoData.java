import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversaoData {

	public static Date converteParaDate(String dataString) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date data = null;
		try {
			data = df.parse(dataString);
		} catch (ParseException e) {
			System.out.println("Erro ao converter a data.");
		}
		return data;
	}

	public static String converteParaString(Date data) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String dataString = df.format(data);
		return dataString;
	}

	public static void main(String[] args) {
	
		String str = "09/02/2011";
		Date data = converteParaDate(str);
		System.out.println(data.toString());
		
		data = new Date();
		str = converteParaString(data);
		System.out.println(str);
	}

}

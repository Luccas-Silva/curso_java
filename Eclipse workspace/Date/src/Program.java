import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdt1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdt2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdt3 = new SimpleDateFormat("HH:mm:ss");
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
	
		Date y1 = sdt1.parse("13/06/2004");
		Date y2 = sdt2.parse("28/03/2012 13:45:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("x1: "+ x1);
		System.out.println("x2: "+ x2);
		System.out.println("x3: "+ x3);
		System.out.println("y1: "+ y1);
		System.out.println("y2: "+ y2);
		System.out.println("y3: "+ y3);
		System.out.println("------------------------------");
		System.out.println("x1: "+ sdt1.format(x1));
		System.out.println("x2: "+ sdt1.format(x2));
		System.out.println("x3: "+ sdt1.format(x3));
		System.out.println("y1: "+ sdt1.format(y1));
		System.out.println("y2: "+ sdt1.format(y2));
		System.out.println("y3: "+ sdt1.format(y3));
		System.out.println("------------------------------");
		System.out.println("x1: "+ sdt2.format(x1));
		System.out.println("x2: "+ sdt2.format(x2));
		System.out.println("x3: "+ sdt2.format(x3));
		System.out.println("y1: "+ sdt2.format(y1));
		System.out.println("y2: "+ sdt2.format(y2));
		System.out.println("y3: "+ sdt2.format(y3));
		System.out.println("------------------------------");
		System.out.println("x1: "+ sdt3.format(x1));
		System.out.println("x2: "+ sdt3.format(x2));
		System.out.println("x3: "+ sdt3.format(x3));
		System.out.println("y1: "+ sdt3.format(y1));
		System.out.println("y2: "+ sdt3.format(y2));
		System.out.println("y3: "+ sdt3.format(y3));

	}

}

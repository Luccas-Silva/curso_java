package application;

import model.entities.ComboDevice;
import model.entities.ConcretPrinter;
import model.entities.ConcretScanner;

public class Program {

	public static void main(String[] args) {
		
		
		ComboDevice d = new ComboDevice("A001");
		String doc1 = "My dissertation";
		d.processDoc(doc1);
		d.print(doc1);
		System.out.println("Scan result: "+ d.scan());
		System.out.println("");
		
		ConcretPrinter p = new ConcretPrinter("A002");
		String doc2 = "My Letter";
		p.processDoc(doc2);
		p.print(doc2);
		System.out.println();
		
		ConcretScanner s = new ConcretScanner("A003");
		String doc3 = "My Email";
		s.processDoc(doc3);
		System.out.println("Scan result"+s.scan());
		

	}

}

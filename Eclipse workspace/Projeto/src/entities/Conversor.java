package entities;

public class Conversor {
	
	public String textoConvertido(String textoOriginal) {
		
		textoOriginal = textoOriginal.replace("a", "33 ");
		textoOriginal = textoOriginal.replace("b", "55 ");
		textoOriginal = textoOriginal.replace("c", "35 ");
		textoOriginal = textoOriginal.replace("d", "40 ");
		textoOriginal = textoOriginal.replace("e", "43 ");
		textoOriginal = textoOriginal.replace("f", "64 ");
		textoOriginal = textoOriginal.replace("g", "83 ");
		textoOriginal = textoOriginal.replace("h", "06 ");
		textoOriginal = textoOriginal.replace("i", "25 ");
		textoOriginal = textoOriginal.replace("j", "75 ");
		textoOriginal = textoOriginal.replace("k", "86 ");
		textoOriginal = textoOriginal.replace("l", "97 ");
		textoOriginal = textoOriginal.replace("m", "61 ");
		textoOriginal = textoOriginal.replace("n", "27 ");
		textoOriginal = textoOriginal.replace("o", "03 ");
		textoOriginal = textoOriginal.replace("p", "09 ");
		textoOriginal = textoOriginal.replace("q", "41 ");
		textoOriginal = textoOriginal.replace("r", "10 ");
		textoOriginal = textoOriginal.replace("s", "73 ");
		textoOriginal = textoOriginal.replace("t", "70 ");
		textoOriginal = textoOriginal.replace("u", "37 ");
		textoOriginal = textoOriginal.replace("v", "42 ");
		textoOriginal = textoOriginal.replace("w", "56 ");
		textoOriginal = textoOriginal.replace("x", "60 ");
		textoOriginal = textoOriginal.replace("y", "21 ");
		textoOriginal = textoOriginal.replace("z", "95 ");
		textoOriginal = textoOriginal.replace(" ", "@");
		
		return textoOriginal;
	}
	
	public String textoConvertido2(String textoOriginal) {
		
		textoOriginal = textoOriginal.replace("33 ", "a");
		textoOriginal = textoOriginal.replace("55 ", "b");
		textoOriginal = textoOriginal.replace("35 ", "c");
		textoOriginal = textoOriginal.replace("40 ", "d");
		textoOriginal = textoOriginal.replace("43 ", "e");
		textoOriginal = textoOriginal.replace("64 ", "f");
		textoOriginal = textoOriginal.replace("83 ", "g");
		textoOriginal = textoOriginal.replace("06 ", "h");
		textoOriginal = textoOriginal.replace("25 ", "i");
		textoOriginal = textoOriginal.replace("75 ", "j");
		textoOriginal = textoOriginal.replace("86 ", "k");
		textoOriginal = textoOriginal.replace("97 ", "l");
		textoOriginal = textoOriginal.replace("61 ", "m");
		textoOriginal = textoOriginal.replace("27 ", "n");
		textoOriginal = textoOriginal.replace("03 ", "o");
		textoOriginal = textoOriginal.replace("09 ", "p");
		textoOriginal = textoOriginal.replace("41 ", "q");
		textoOriginal = textoOriginal.replace("10 ", "r");
		textoOriginal = textoOriginal.replace("73 ", "s");
		textoOriginal = textoOriginal.replace("70 ", "t");
		textoOriginal = textoOriginal.replace("37 ", "u");
		textoOriginal = textoOriginal.replace("42 ", "v");
		textoOriginal = textoOriginal.replace("56 ", "w");
		textoOriginal = textoOriginal.replace("60 ", "x");
		textoOriginal = textoOriginal.replace("21 ", "y");
		textoOriginal = textoOriginal.replace("95 ", "z");
		textoOriginal = textoOriginal.replace("@", " ");
		
		return textoOriginal;
	}
	
	
}

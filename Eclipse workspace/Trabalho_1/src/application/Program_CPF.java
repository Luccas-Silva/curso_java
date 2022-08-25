package application;

import java.util.Scanner;

public class Program_CPF {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("	Validador de CPF ");
		System.out.println("");
		
		System.out.println(" Digite um número de CPF ");
		System.out.print("  (xxx.xxx.xxx/xx): ");
		String CPF = sc.nextLine();
		System.out.println("");
		
		String[] split = CPF.split("");
		int [] vetCPF = new int [14];
		for (int i=0; i<split.length; i++) {
			if (i == 3 || i == 7 || i == 11) {
				vetCPF[i] = 0;
			}
			else {
				vetCPF[i] = Integer.parseInt(split[i]);	
			}
		}
		
		if (vetCPF[0] == vetCPF[1] && vetCPF[1] == vetCPF[2] && vetCPF[2] == vetCPF[4] && vetCPF[4] == vetCPF[5] && vetCPF[5] == vetCPF[6] && vetCPF[6] == vetCPF[8] && vetCPF[8] == vetCPF[9] && vetCPF[9] == vetCPF[10]){
			System.out.println("	 # CPF INVALIDO #");
        }
        else {
            int Soma1 = vetCPF[0] * 10 + vetCPF[1] * 9 + vetCPF[2] * 8 + vetCPF[4] * 7 + vetCPF[5] * 6 + vetCPF[6] * 5 + vetCPF[8] * 4 + vetCPF[9] * 3 + vetCPF[10] * 2;
            int digitoVerificador1 = Soma1 % 11;

            if (digitoVerificador1 < 2){
                digitoVerificador1 = 0;
            }
            else {
                digitoVerificador1 = 11 - digitoVerificador1;
            }
            
            int Soma2 = vetCPF[0] * 11 + vetCPF[1] * 10 + vetCPF[2] * 9 + vetCPF[4] * 8 + vetCPF[5] * 7 + vetCPF[6] * 6 + vetCPF[8] * 5 + vetCPF[9] * 4 + vetCPF[10] * 3 + digitoVerificador1 * 2;
            int digitoVerificador2 = Soma2 % 11;

            if (digitoVerificador2 < 2){
                digitoVerificador2 = 0;
            }
            else{
                digitoVerificador2 = 11 - digitoVerificador2;
            }
            if (digitoVerificador1 == vetCPF[12] && digitoVerificador2 == vetCPF[13]){
            	System.out.println("	 * CPF VALIDO *");
            }
            else{
            	System.out.println("	# CPF INVALIDO #");
            }
        }
		            
    
		sc.close();
		
	}

}

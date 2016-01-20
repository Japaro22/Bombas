
public class Bum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numCaracteres;
		String palabra="puta dam dice puta puta dice puta dam y la puta lo peta y se fue a la puta e";	
		String cifrada="";
	    char caracter;
	    int contador=0;
		numCaracteres=palabra.length();
		cifrada=palabra;
		for (int i=0;i<numCaracteres;i++){
			caracter=palabra.charAt(i);
			switch (caracter){
			case 'a':
				contador=contador+15;
				break;
			case 'e':
				cifrada=cifrada.replace('e','2');
				contador=contador*2;
				break;
			case 'i':
				cifrada=cifrada.replace('i','3');
				contador=contador*9;
				break;
			case 'o':
				cifrada=cifrada.replace('o','4');
				contador=contador*5;
				break;
			case 'u':
				cifrada=cifrada.replace('u','5');
				contador=contador*2;
				break;
		
				
			}
			
		}
		cifrada=cifrada.replace('p','h').replace('5','o').replace('t','l');
		System.out.println(cifrada+(contador*palabra.length()));
	
		}
	}


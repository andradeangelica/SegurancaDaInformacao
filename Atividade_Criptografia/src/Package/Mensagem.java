package Package;
import java.util.Scanner;
import java.util.Base64;

public class Mensagem {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a mensagem para ser codificada: ");
	        String inputText = scanner.nextLine();

	        String encodedText = encodeText(inputText);

	        System.out.println("Mensagem codificada: " + encodedText);

	        scanner.close();
	    }

	    public static String encodeText(String text) {
	        
	        byte[] bytes = text.getBytes();

	        byte[] encodedBytes = Base64.getEncoder().encode(bytes);

	        return new String(encodedBytes);
	    }
	}


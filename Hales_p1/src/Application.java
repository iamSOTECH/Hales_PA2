import java.util.Scanner;

public class Application {
	public static void main(String[] args)
	{
		Scanner UserInteger = new Scanner(System.in);
		// Accept user input
		System.out.printf("Please input a 4-digit integer: %n");
		int Userinput = UserInteger.nextInt();
		UserInteger.close();
		
		// Break the 4-digit integer into individual numbers
		int digit1 = Userinput / 1000;
			// System.out.println("Digit 1 is " + digit1);
		int digit2 = (Userinput % 1000) / 100;
			// System.out.println("Digit 2 is " + digit2);
		int digit3 = (Userinput % 100) / 10;
			// System.out.println("Digit 3 is " + digit3);
		int digit4 = (Userinput % 10);
			// System.out.println("Digit 4 is " + digit4);

		// Encrypt the individual digits using the Encrypt method in Encrypter class
		Encrypter encryptMethod = new Encrypter();
		digit1 = encryptMethod.encrypt(digit1);	
			// System.out.println("Encrypted digit is " + digit1);
		digit2 = encryptMethod.encrypt(digit2);
			// System.out.println("Encrypted digit is " + digit2);
		digit3 = encryptMethod.encrypt(digit3);
			// System.out.println("Encrypted digit is " + digit3);
		digit4 = encryptMethod.encrypt(digit4);
			// System.out.println("Encrypted digit is " + digit4);
		
		// Swap the digits | 1 with 3 & 2 with 4
		int encryptedNumber1 = digit1;
		int encryptedNumber2 = digit2;
		int encryptedNumber3 = digit3;
		int encryptedNumber4 = digit4;
		int encryptedTemp1 = encryptedNumber1;
		encryptedNumber1 =  encryptedNumber3;
		encryptedNumber3 = encryptedTemp1;
		int encryptedTemp2 = encryptedNumber4;
		encryptedNumber4 = encryptedNumber2;
		encryptedNumber2 = encryptedTemp2;
		
		// Prints the new encrypted number
		System.out.println("The encrypted value is: " + encryptedNumber1 + "" + encryptedNumber2 
		+ "" + encryptedNumber3 + "" + encryptedNumber4);
		
		// Decrypt the individual digits using the Decrypt method in Decrypter class
		Decrypter decryptMethod = new Decrypter();
		digit1 = decryptMethod.decrypt(encryptedNumber1);
		digit2 = decryptMethod.decrypt(encryptedNumber2);
		digit3 = decryptMethod.decrypt(encryptedNumber3);
		digit4 = decryptMethod.decrypt(encryptedNumber4);
		
		// Swap the digits | 1 with 3 & 2 with 4
		int decryptedNumber1 = digit1;
		int decryptedNumber2 = digit2;
		int decryptedNumber3 = digit3;
		int decryptedNumber4 = digit4;
		int decryptedTemp1 = decryptedNumber1;
		decryptedNumber1 =  decryptedNumber3;
		decryptedNumber3 = decryptedTemp1;
		int decryptedTemp2 = decryptedNumber4;
		decryptedNumber4 = decryptedNumber2;
		decryptedNumber2 = decryptedTemp2;
				
		// Prints the new decrypted number
		System.out.println("The decrypted value is: " + decryptedNumber1 + "" + decryptedNumber2
		+ "" + decryptedNumber3 + "" + decryptedNumber4);
	}
}

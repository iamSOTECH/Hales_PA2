public class Encrypter {
	public int encrypt(int value)
	{
		// Add 7 to the digit | divide by 10 | remainder is the new value
		value = (value + 7) % 10;
		return value;
	}
}

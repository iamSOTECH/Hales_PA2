public class Decrypter {
	public int decrypt(int value)
	{
		// Add 3 to the digit | divide by 10 | remainder is the new value
		value = (value + 3) % 10;
		return value;
	}
}

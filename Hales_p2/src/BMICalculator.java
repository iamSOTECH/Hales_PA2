import java.util.Scanner;

public class BMICalculator 
{
	public static void main(String[] args)
	{
		BMICalculator app = new BMICalculator();
		app.readUserData();
		app.calculateBmi();
		app.displayBmi();
	}
	
	public int UnitType;
	public static float weight;
	public static float height;
	public float BMI;
	public String category;
	
	public void readUserData()
	{
		readUnitType();
		readMeasurementData();
	}
	
	// Reads type of units desired
	private void readUnitType()
	{
		Scanner typeScanner = new Scanner(System.in);
		System.out.println("Please enter a unit value.");
		System.out.println("1 for metric units.");
		System.out.println("2 for imperial units.");
		UnitType = typeScanner.nextInt();
		
		while(UnitType != 1 && UnitType != 2)
		{
			System.out.println("Please enter a correct unit value.");
			System.out.println("1 for metric units.");
			System.out.println("2 for imperial units.");
			Scanner errorScanner = new Scanner(System.in);
			UnitType = errorScanner.nextInt();
		}
	}

	// Redirects to calculate with desired units
	private void readMeasurementData()
	{
		if(UnitType == 1)
		{
			readMetricData();			
		}
		else if(UnitType == 2)
		{
			readImperialData();			
		}
	}
	
	// Accepts inputs as metric
	private void readMetricData()
	{
		System.out.printf("Please enter your weight in kilos: ");
		Scanner metricWeight = new Scanner(System.in);
		weight = metricWeight.nextFloat();
		setWeight(weight);
		
		System.out.printf("Please enter your height in meters: ");
		Scanner metricHeight = new Scanner(System.in);
		height = metricHeight.nextFloat();
		setHeight(height);
		metricWeight.close();
		metricHeight.close();

	}
	
	// Accepts inputs as imperial
	private void readImperialData()
	{
		System.out.printf("Please enter your weight in pounds: ");
		Scanner imperialWeight = new Scanner(System.in);
		weight = imperialWeight.nextFloat();
		setWeight(weight);
		
		System.out.printf("Please enter your height in inches: ");
		Scanner imperialHeight = new Scanner(System.in);
		height = imperialHeight.nextFloat();
		setHeight(height);
		imperialWeight.close();
		imperialHeight.close();
	}
	
	// Calculate BMI value
	public void calculateBmi()
	{
		if(UnitType == 1)
		{
			BMI = weight / (height * height);
		}
		
		if(UnitType == 2)
		{
			BMI = (703 * weight) / (height * height);
		}
	}
	
	// Determines the category of BMI range
	private void calculateBmiCategory()
	{
		if(BMI < 18.5)
		{
			category = "Underweight";
		}
		else if(18.5 < BMI && BMI < 24.9)
		{
			category = "Normal weight";
		}
		else if(25 < BMI && BMI < 29.9) 
		{
			category = "Overweight";
		}
		else if(30 < BMI)
		{
			category = "Obese";
		}
	}
	
	// Prints BMI value and category
	public void displayBmi()
	{
		System.out.printf("BMI value: %.1f%n", getBmi());
		System.out.printf("BMI category: %s%n", getBmiCategory());
	}
	
	// Fetches weight
	public static float getWeight()
	{
		return weight;
	}
	
	// Initializes weight value
	private static void setWeight(float weight)
	{
		if(weight < 0)
		{
			return;
		}
	}
	
	// Fetches height
	public static float getHeight()
	{
		return height;
	}
	
	// Initializes height value
	private static void setHeight(float height)
	{
		if(height < 0)
		{
			return;
		}
	}
	
	// Fetches BMI
	public float getBmi()
	{
		return BMI;
	}
	
	// Calls BMI category calculator
	public String getBmiCategory()
	{
		calculateBmiCategory();
		return category;
	}

}

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Scanner cal = new Scanner(System.in);
		double weight, height, BMI;
		System.out.println("Enter weight(kg) and height(cm)");
		weight = cal.nextDouble();
		height = cal.nextDouble();
		BMI = weight / height * height;
		System.out.println(BMI);
		cal.close();
	}
}

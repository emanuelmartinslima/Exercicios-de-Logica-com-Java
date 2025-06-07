package exemplos;

public class Array04 {
	public static void main(String[] args) {
		int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
		
		float avg, sum = 0;
		
		int length = ages.length;
		
		System.out.print("Idades: ");
		
		for(int age : ages) {
			System.out.printf("%d, ", age);
			sum += age;
		}
		
		avg = sum / length;
		
		System.out.printf("%nSoma das idades: %.2f%nMédia das Idades: %.2f", sum, avg);
	}
}

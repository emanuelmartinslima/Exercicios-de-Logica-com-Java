package exemplos.matriz;

public class Matriz02 {
	public static void main(String[] args) {
		int[][] matriz = {
				{1, 2, 3, 4},
				{5, 6, 7}
		};
		
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j]);
			}
		}
	}
}

package finalassignment;

import java.util.Arrays;
import java.util.Scanner;

public class FinalAssignment {

	public static void main(String[] args) {
//		Задача: Потребителят трябва да може да въведе число от 2 до 9,
//		което число представлява едната страна на квадратен двумерен масив (матрица).
//		Програмата трябва да може да пресметне колко е броят на необходимите елементи,
//		с който може да се попълни квадратният двумерен масив и да създаде едномерен масив
//		с тази дължина. Потребителят трябва да може да въведе толкова стойности,
//		че да попълни едномерния масив. След като едномерният масив е попълнен,
//		той трябва да бъде обходен, за да се изчисли общата сума от всичките въведени стойности.
//		Сумата да се изпише на екрана. В двумерния масив трябва да се попълнят стойностите
//		от едномерния. Попълването на двумерния масив трябва да стане вертикално (колона по колона).

		Scanner sc = new Scanner(System.in);
		int size=0;
		do{
			System.out.println("Input size:");
			size=sc.nextInt();
		}while(size<2||size>9);
		int[][] squareArray = new int[size][size]; 
		int[] array = new int[size*size];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Input value for position "+(i+1));
			int temp = sc.nextInt();
			array[i]=temp;
			sum+=temp;
		}
		sc.close();
		System.out.println("Sum = "+sum);
		int counter=0;
		for (int i = 0; i < squareArray[0].length; i++) {
			for (int j = 0; j < squareArray.length; j++) {
				squareArray[j][i]=array[counter++];
			}
		}
		System.out.println(Arrays.deepToString(squareArray));
		for (int i = 0; i < squareArray.length; i++) {
			for (int j = 0; j < squareArray[0].length; j++) {
				System.out.print(squareArray[i][j]+" ");
			}
			System.out.println();
		}
	}
}



package finalassignment;

import java.util.Arrays;
import java.util.Scanner;

public class FinalAssignment {

	public static void main(String[] args) {
//		������: ������������ ������ �� ���� �� ������ ����� �� 2 �� 9,
//		����� ����� ������������ ������ ������ �� ��������� �������� ����� (�������).
//		���������� ������ �� ���� �� ��������� ����� � ����� �� ������������ ��������,
//		� ����� ���� �� �� ������� ����������� �������� ����� � �� ������� ��������� �����
//		� ���� �������. ������������ ������ �� ���� �� ������ ������� ���������,
//		�� �� ������� ���������� �����. ���� ���� ����������� ����� � ��������,
//		��� ������ �� ���� �������, �� �� �� ������� ������ ���� �� �������� �������� ���������.
//		������ �� �� ������ �� ������. � ��������� ����� ������ �� �� �������� �����������
//		�� ����������. ����������� �� ��������� ����� ������ �� ����� ���������� (������ �� ������).

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



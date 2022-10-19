package oops;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,9,1,3};
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		min(arr);
		
		//multi dimensional array
		int[][] arr1 = {{1,2,4},{4,5,6},{8,9,0}};
		print(arr1);
		
		//jaggedArray
		int[][] arr2 = new int[3][];
		arr2[0] = new int[3];
		arr2[1] = new int[4];
		arr2[2] = new int[2];
		int count=0;
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = count++;
			}
		}
		System.out.println("Jagged Array-----");
		print(arr2);
		
		//copy of array
		char[] c1 = {'a','b','c','d','e','g','h','i','j'};
		char[] c2 = Arrays.copyOf(c1, 4);//copy in c2 from c1 from 0 to 3 index
		System.out.println(Arrays.toString(c2));
		char[] c3 = new char[5];
		System.arraycopy(c1, 2, c3, 0, 5);//here we pass from index to copy element from 2 index onward copy array 
		System.out.println(Arrays.toString(c3));

		System.out.println("Addition of two matrices...");
		//addition of two matrices
		int[][] a= {{5,2,3},{4,5,6}};
		int[][] b= {{1,2,3},{4,5,6}};
		
		int sum[][] = new int[2][3];
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				sum[i][j] = a[i][j]+b[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Multiple of metrices..");
		//multiplication of metrices
		int[][] c = {{1,2,3},
					{2,4,5},
					{3,2,5}};
		int[][] d = {{6,7,3},
				    {2,6,1},
				    {3,2,1}};
		
		int[][] multi = new int[3][3];
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<d.length; j++) {
				multi[i][j] = 0;
				for(int k=0; k<multi.length; k++) {
					multi[i][j] += c[i][k]*d[k][j];
				}
				System.out.print(multi[i][j]+" ");
			}
			System.out.println();
		}
	}
	

	static void min(int[] a) {
		int min = a[0];
		for(int i=0; i<a.length; i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("min :"+min);
	}
	
	static void print(int[][] arr){
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
		
	static <E> void printArray(E[] array){
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println();
	}
}

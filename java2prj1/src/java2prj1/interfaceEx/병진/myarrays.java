package java2prj1.interfaceEx.병진;

import java.util.Comparator;

interface mycomparable<T> {
	public int compareTo(T other);
}

public class myarrays {

	public static void sort(Object[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				mycomparable m = (mycomparable) arr[i];

				if (m.compareTo(arr[j]) > 0) {
					Object tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public static void sort(Object[]arr, Comparator c) {
		
		for(int i = 0; i<arr.length -1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				
				if(c.compare(arr[i],  arr[j]) > 0){
					
					Object tmp;
					tmp = arr[i];
					arr[j] = tmp;
				}
			}
		}
	}


}

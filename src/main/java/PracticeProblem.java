/*
File Name: Add/remove
Author: Jim Li
Date Created: May 1, 2026
Date Last Modified: May 1, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String[] addString(String[] array, String str, int index){
		String[] array2 = new String[array.length + 1];
		int j = 0;

    	for (int i = 0; i < array2.length; i++) {
        	if (i == index) {
        	    array2[i] = str;
        	} else {
        	    array2[i] = array[j];
        	    j++;
        	}
   		}
		return array2;
	}

	public static char[] removeChars(char[] array, char target){
		int counter = 0;
		for (int i = 0; i < array.length; i++){
			if (array[i] == target){
				counter++;
			}
		}
		char[] array2 = new char[array.length - counter];
		int j = 0;
		for (int i = 0; i < array.length; i++){
			if (target != array[i]){
				array2[j] = array[i];
				j++;
			}
		}
		return array2;
	}

}

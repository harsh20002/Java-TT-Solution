import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {5, 6, 4, 8};
		
		int st = 0;
		int en = arr.length-1;
		
		while(st<=en){
		    int temp = arr[st];
		    arr[st] = arr[en];
		    arr[en] = temp;
		    st++;
		    en--;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

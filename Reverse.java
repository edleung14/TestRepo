import java.util.Scanner;
public class Reverse {
	public static void main(String[] args)
	{
		int[] list;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many indexes?");
		list = new int[scan.nextInt()];
		for(int i=0;i<list.length;i++){
			System.out.println("Enter a number for index "+i);
			list[i]= scan.nextInt();
		}
		for(int i : list){
			System.out.print(i);
		}
		System.out.println();

		int i = 0;
		int temp = 0;
		while(i<(list.length/2)){
			temp=list[i];
			list[i]=list[Math.abs(i-(list.length-1))];
			list[Math.abs(i-(list.length-1))]=temp;
			i++;
			
		}
		
		for(int j : list){
			System.out.print(j);
		}
		
	}

}

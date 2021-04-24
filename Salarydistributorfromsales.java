package labreport4q2;
import java.util.*;
public class Salarydistributorfromsales {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of Employee: ");
		final int N = input.nextInt();
		double sale[] = new double [N];
		double [] wage = new double[N];
		for (int i =0; i<sale.length; i++){
		System.out.print("Enter sale for employer "+(i+1)+": ");
		sale[i]=input.nextDouble();
		wage[i]=getWage(sale[i]);

		input.nextLine();
		}
		String [] header ={"  Rs.200-299:","  Rs.300-399:","  Rs.400-499:","  Rs.500-599:","  Rs.600-699:","  Rs.700-799:","  Rs.800-899:","  Rs.900-999:","  Rs.1000 and over:"};
		int counter [] = new int [9];
		for( int i = 0; i < wage.length; i++){
		System.out.print("Wage for employer "+(i+1)+": Rs.");
		System.out.println(wage[i]);
		if (wage[i] <300){
		counter[0]++;
		}else if (wage[i] >= 300 && wage[i] < 400){
		counter[1]++;
		}else if (wage[i] >= 400 && wage[i] < 500){
		counter[2]++;
		}else if (wage[i] >= 500 && wage[i] < 600){
		counter[3]++;
		}else if (wage[i] >= 600 && wage[i] < 700){
		counter[4]++;
		}else if (wage[i] >= 700 && wage[i] < 800){
		counter[5]++;
		}else if (wage[i] >= 800 && wage[i] < 900){
		counter[6]++;
		}else if (wage[i] >= 900 && wage[i] < 1000){
		counter[7]++;
		}else { counter[8]++;
		}
		}
		System.out.println("{   Salary Range  }    {No. of Employee}");
		for (int i = 0 ;i < header.length; i++)
		System.out.println(header[i]+"                 "+counter[i]);
		}
		public static double getWage(double sale){
		double wage = 200 + (sale*0.09);
		return wage;

	}

}

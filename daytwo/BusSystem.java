package daytwo;

import java.util.Scanner;
public class BusSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int seats=1;
		int bfare=0;
		int buscol=0;
		int bus=1;
		int total=0;
		while(bus<=4)
		{
			System.out.println("enter bus fare amount");
		    bfare=scan.nextInt();
		    buscol=0;
		    seats=1;
			while(seats<=7)
			{
				System.out.println("enter amount");
				int money=scan.nextInt();
				
				if(money>=bfare)
				{
					System.out.println("you can travel");
					buscol=buscol+bfare;
					
				}
				else
				{
					System.out.println("cannot travel");
				}
				seats++;
				
			}
			total=total+buscol;
			System.out.println("bus collection is "+buscol);
		}
		System.out.println("total amount collected from 4 bus "+total);
		scan.close();
	}

}

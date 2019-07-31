package daytwo;

import java.util.Random;

public class GenOTP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder b=new StringBuilder();
		Random r=new Random();
		int digit=0;
		while(digit<6)
		{
			b.append(r.nextInt(10));
			digit++;
		}
		System.out.println("OTP is "+b.toString());
	}

}

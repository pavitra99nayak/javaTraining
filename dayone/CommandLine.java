package dayone;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		String name="";
		String cName="";
		float salary=0.0F;
		int exp=0;
		float credit,loan;
	    credit=salary/3;
		loan=salary/4;
		name=args[0];
		cName=args[1];
		salary=Float.parseFloat(args[2]);
		exp=Integer.parseInt(args[3]);
		System.out.println("Details of employee: "+name+" "+cName+" "+salary+" "+exp+" "+credit+" "+loan);
		if(exp>0 & exp<3)
			System.out.println("leam leader");
		else if(exp>=3 & exp<8)
			System.out.println("project manager");
		else if(exp>=8)
			System.out.println("business manager");
		else
			System.out.println("same position");
			
	}

}

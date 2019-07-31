package daytwo;

public class BubbleSort {
	public static void sort(String cake)
	{
		byte[] choco=cake.getBytes();
		int pos=0,com=0;
		while(pos<choco.length-1)
		{
			com=0;
			while(com<choco.length-pos-1)
			{
				if(choco[com]>choco[com+1])
				{
					choco[com]^=choco[com+1];
					choco[com+1]^=choco[com];
					choco[com]^=choco[com+1];
					
				}
				com++;
			}
			pos++;
		}
		System.out.println(new String(choco));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="DataScience";
	
		 BubbleSort.sort(s);
 
	}

}

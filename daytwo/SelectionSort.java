package daytwo;
public class SelectionSort {
	public static void sort(String[] oreo)
	{
		int pos=0,com=0;
		String temp=null;
		while(pos<oreo.length)
		{
			com=pos+1;
			while(com<oreo.length)
			{
				if(oreo[pos].compareTo(oreo[com])>0)
				{
					temp=oreo[pos];
					oreo[pos]=oreo[com];
					oreo[com]=temp;
				}
				com++;
					
			}
			pos++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] orgs={"birlasoft","ZOHO","Cognizant","Infosys","amazon"};
		SelectionSort.sort(orgs);
		for(String yet:orgs)
		{
			System.out.println(yet);
		}
	
	}

}

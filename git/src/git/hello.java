package git;

public class hello {
	
public static void main(String[] args) {
		
		String aa[]= {"aa","bb","aa"};
		
		
		for(int i=0;i<aa.length;i++)
		{
			for(int j=i+1;j<aa.length;j++)
			{
				if(aa[i]==aa[j])
				{
					System.out.println(aa[j]);
				}
			}
	
		}
		
	}

}


import java.lang.*;
import java.io.*;

class PatternX
{
	void Display(int iNo1, int iNo2)
	{
		if(iNo1 < 0)
		{
			iNo1 = -iNo1;
		}

		if(iNo2 < 0)
		{
			iNo2 = -iNo2;
		}

		if(iNo1 != 0 && iNo2 != 0)
		{
			for(int i = 1; i <= iNo1; i++)
			{
				for(int j = iNo2; j >= 1; j--)
				{
					System.out.print(j+"\t");
				}
				System.out.println();
			}
		}
	}
}

class Main
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Count of Rows and Columns");
		int iValue1 = Integer.parseInt(bobj.readLine());
		int iValue2 = Integer.parseInt(bobj.readLine());

		PatternX pobj = new PatternX();
		pobj.Display(iValue1,iValue2);	
	}
}
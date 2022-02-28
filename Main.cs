
using System;

class PatternX
{
    public void Display(int iNo1, int iNo2)
    {
        if(iNo1 < 0)
        {
            iNo1 = -iNo1;
        }

        if(iNo2 < 0)
        {
            iNo2  = -iNo2;
        }

        if(iNo1 != 0 && iNo2 != 0)
        {
            for(int i = 1; i <= iNo1; i++)
            {
                for(int j = iNo2; j >= 1; j--)
                {
                    Console.Write(j+"\t");
                }
                Console.WriteLine();
            }
        }
        else
        {
            return;
        }
    }
}

class main
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Enter Number of Rows");
        int iValue1 = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Enter Number of Columns");
        int iValue2 = Convert.ToInt32(Console.ReadLine());

        PatternX pobj = new PatternX();
        pobj.Display(iValue1,iValue2);
    }
}
package com.example;

public class TrianglePattern
{
	public static void main(String[] args)
	{
		int rows = 9;
		for (int a = rows -1; a>=0; a--)
		{
			for (int b=0 ; b<=a;b++)
			{
				System.out.println(" * " + " ");
			}
			
			System.out.println( );
		}
		
	}

}

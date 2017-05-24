
//
// This is the driver for the Cebysev project.
// It generates the first 10 Cebysev polynomials
// using the polynomial and term classes, then
// prints them to the console window.


import java.util.ArrayList;

public class Cebysev
{


	public static void main(String[] args)
	{




		ArrayList<Polynomial> ceby = new ArrayList<Polynomial>();
		ArrayList<Term> term1 = new ArrayList<Term>();
		Term t1 = new Term(1,0);
		term1.add(t1);
		Polynomial a = new Polynomial(term1);
		ceby.add(a);
		ArrayList<Term> term2 = new ArrayList<Term>();
		Term t2 = new Term(1,1);
		term2.add(t2);
		Polynomial b = new Polynomial(term2);
		ceby.add(b);

		for(int i = 2; i < 10; i++)
		{
			Polynomial p = ceby.get(i-1);
			Polynomial g = ceby.get(i-2);
			Term m = new Term(2,1);
			p = p.distribute(m);

			Polynomial n = p.subtract(g);

			ceby.add(n);
		}


		for(int i = 0; i < 10; i++)
		{
			System.out.println(ceby.get(i));
			System.out.println();

		}





	}

}

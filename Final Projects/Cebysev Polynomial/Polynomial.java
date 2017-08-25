//
// This is the code for the Polynomial class.
// It has an arraylist of terms.
// It has various methods for polynomial manipulation,
// including methods to distribute a term or subtract
// another polynomial.


import java.util.ArrayList;

public class Polynomial
{

	private ArrayList<Term> terms = new ArrayList<Term>();


	public Polynomial(ArrayList<Term> x)
	{
		terms = x;
	}


	public ArrayList<Term> getTerms()
	{
		return terms;
	}



	public Polynomial distribute(Term t)
	{
		ArrayList<Term> newP = new ArrayList<Term>();
		for(int i = 0; i < terms.size(); i++)
		{
			Term x = terms.get(i).multiply(t);
			newP.add(x);

		}
		Polynomial g =new Polynomial(newP);
		return g;

	}


	public Polynomial subtract(Polynomial p)
	{

		ArrayList<Term> ts = getTerms();
		ArrayList<Term> ots = p.getTerms();


		for(int i = 0; i < ots.size(); i++)
		{
			Term ot = ots.get(i);
			Term zero = new Term(0, ot.getE());
			boolean foundsimilar = false;

			for(int j = 0; j< ts.size(); j++)
			{
				Term t = ts.get(i);
				if(t.isSimilar(ot))
				{
					foundsimilar = true;
					Term nt = t.subtract(ot);

				}




			}
			if(!foundsimilar)
			{
				ts.add((zero.subtract(ot)));
			}

		}
		Polynomial x = new Polynomial(ts);
		x.sort();
		x.simplify();

		return x;

	}


	public String toString()
	{
		String res = "";
		for(int i = 0; i < terms.size(); i++)
		{
			if(i!= terms.size()-1)
			{
				res += (terms.get(i) + "  +  ");
			}
			else
			{
				res += (terms.get(i));
			}

		}
		return res;

	}

	private void sort()
	{
		int j;
		Term temp;

		ArrayList<Term> ts = terms;


		for(int n = 1; n< ts.size(); n++)
		{
			temp = ts.get(n);
			j = n;

			while(j>0 && temp.getE() > ts.get(j-1).getE())
			{
				ts.set(j, ts.get(j-1));
				j--;
			}

			ts.set(j, temp);
		}


	}

	private void simplify()
	{
		for(int i = 0; i < terms.size()-1; i++)
		{
			if(terms.get(i).isSimilar(terms.get(i+1)))
			{
				terms.set(i, terms.get(i).add(terms.get(i+1)));
				terms.remove(terms.get(i+1));
				i--;
			}

		}

	}

}










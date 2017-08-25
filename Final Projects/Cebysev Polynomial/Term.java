//
// This is the code for the Term class.
// It contains a coefficient and an exponent
// as instance fields, and several methods for
// term manipulation.


public class Term
{


	private int coef;
	private int exp;


	public Term(int c, int e)
	{
		coef = c;
		exp = e;
	}



	public int getC()
	{
		return coef;
	}



	public int getE()
	{
		return exp;
	}


	public Term multiply(Term t)
	{
		int newC = coef * t.getC();
		int newE = exp + t.getE();
		Term x = new Term(newC, newE);
		return x;
	}



	public String toString()
	{
		String res="";
		if(exp == 0)
		{
			res = ""+coef;
		}

		if(exp ==1 )
		{
			res = coef + "x";
		}

		if(exp!= 1 && exp != 0)
		{
			res = coef +"x^" + exp;
		}
		return res;

	}

	public boolean isSimilar(Term t)
	{
		return (exp == t.getE());
	}

	public Term subtract(Term t)
	{
		Term x = null;
		if(this.isSimilar(t))
		{
			int newC;
			newC = coef - t.getC();
			x = new Term(newC, exp);
		}
		else
		{
			System.out.println(this + " is not similiar to " + t); // for debugging. this should never be printed
		}
		return x;

	}


	public Term add(Term t)
	{
		Term x = null;
		if(this.isSimilar(t))
		{
			int newC;
			newC = coef + t.getC();
			x = new Term(newC, exp);
		}
		else
		{
			System.out.println(this + " is not similar to " +t);
		}
		return x;
	}




}









package CleanCodeLogger.task5;

public class Interest1 
{
	public double simpleInterest(double p,double r,double t)
	{
		r = r/100;
		double si = (p*r*t)/100;
		return si;
	}
	public double compoundInterest(double p,double r,double t)
	{
		r=r/100;
		double q = 1+r;
		double ci = p*Math.pow(q,t)-p;
		return ci;
	}


}

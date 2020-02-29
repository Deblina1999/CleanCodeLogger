package CleanCodeLogger.task5;
import java.util.*;
import java.util.logging.Logger;
public class App
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		Logger log = Logger.getLogger(App.class.getName());
		Construction1 c = new Construction1();
		double area;
		String str = "";
		log.info("Enter the material standard");
		str = sc.nextLine();
		log.info("Enter the total area of the house in square feets");
		area=sc.nextDouble();
		String str1="no";
		if(str.equalsIgnoreCase("Standard Material"))
		{
			log.info("Should it be a fully automated house?  Say yes or no");
			str1 = sc.next();
		}
		log.info("Total cost for construction = "+c.construction(area,str,str1));



/*------------------------- Calculation of Interest------------------------------*/
		Interest1 i = new Interest1();
		double p, r, t;
		log.info("Enter the Principle amount");
		p = sc.nextDouble();
		log.info("Enter the time period");
		t = sc.nextDouble();
		log.info("Enter the rate of interest per annum in percentage");
		r = sc.nextDouble();
		r = r/100;
		log.info("Enter n value");
		String s1 = sc.nextLine();
		if(s1.equalsIgnoreCase("Simple Interest"))
		{
			log.info("The simple interest is = "+i.simpleInterest(p,r,t));
		}
		else
			log.info("The compound interest is = "+i.compoundInterest(p,r,t));
		sc.close();

	}
}


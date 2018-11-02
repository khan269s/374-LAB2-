
/**
 * @Trevor Douglas 190103730
 * @version     1.0                 (current version number of program)
 *
 */
import java.util.Scanner;

public class EmployeeApplication{



	public static void main(String[] args)
    {
    	Employee[] eD = new Employee[3];
		int eDSize = 0;
		EmployeeApplication eA = new EmployeeApplication();
		eA.addEs(eD);
		eA.prints(eD);
		Employee[] sorted = new Employee[3];
		sorted = eA.sorteDByName(eD,3);
		eA.prints(sorted);

    }


	public Employee[] sorteDByName(Employee[] database, int databaseSize)
    {
        Employee[] srtD = database;
        for(int i=1; i<(databaseSize); i++)
        {
            for(int j=0; j<(databaseSize-i); j++)
            {
                if (srtD[j].getlN().compareTo(srtD[j+1].getlN())>0)
                {
                    Employee temp = srtD[j+1];
                    srtD[j+1] = srtD[j];
                    srtD[j] = temp;
                }
            }
        }
        return srtD;
    }

	public void addEs(Employee[] eD)
	{
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 3; ++i)
		{
			eD[i] = new Employee();
			System.out.print("Enter an Employee's First Name: ");
			String fName = input.nextLine();
			System.out.print("Enter an Employee's Last  Name: ");
			String lName = input.nextLine();
			System.out.print("Enter an Employee's Address: ");
			String addr = input.nextLine();
			System.out.print("Enter an Employee's Phone Number: ");
			String NUM = input.nextLine();
			System.out.print("Enter an Employee's Hire Date: ");
			String hireDate = input.nextLine();
			System.out.print("Enter an Employee's starting Salary: ");
			String dol = input.nextLine();

			eD[i].setSTUFFUP(fName, lName, addr,  NUM, hireDate,  dol);



		}
	}

	public void prints(Employee[] eD)
	{
		for (int i = 0; i < 3; ++i)
		{

			eD[i].printEmployeeData();

		}

	}

}


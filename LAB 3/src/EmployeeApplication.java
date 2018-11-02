
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
		sorted = eA.sortedByName(eD,3);
		eA.prints(sorted);

    }


	public Employee[] sortedByName(Employee[] database, int databaseSize)
    {
        Employee[] sortD = database;
        for(int iterator1=1; iterator1<(databaseSize); iterator1++)
        {
            for(int j=0; j<(databaseSize-iterator1); j++)
            {
                if (sortD[j].getLastName().compareTo(sortD[j+1].getLastName())>0)
                {
                    Employee temp = sortD[j+1];
                    sortD[j+1] = sortD[j];
                    sortD[j] = temp;
                }
            }
        }
        return sortD;
    }

	public void addEs(Employee[] eD)
	{
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 3; ++i)
		{
			eD[i] = new Employee();
			System.out.print("Enter an Employee's First Name: ");
			String firstName = input.nextLine();
			System.out.print("Enter an Employee's Last  Name: ");
			String lastName = input.nextLine();
			System.out.print("Enter an Employee's Address: ");
			String address = input.nextLine();
			System.out.print("Enter an Employee's Phone Number: ");
			String number = input.nextLine();
			System.out.print("Enter an Employee's Hire Date: ");
			String hireDate = input.nextLine();
			System.out.print("Enter an Employee's starting Salary: ");
			String salary = input.nextLine();

			eD[i].InitializeVariable(firstName, lastName, address,  number, hireDate, salary);



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


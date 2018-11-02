/**
 * @Trevor Douglas 190103730
 * @version     1.0                 (current version number of program)
 *
 */

public class Employee
{
    private String firstName;
    private String lastName;
    private String address;
    private String number;
    private String hireDate;
    private String salary;

    public Employee (){}

    public void InitializeVariable(String firstName, String lastName, String address, String number,
    String hireDate, String salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.number = number;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public String getAddress()
    {
        return this.address;
    }

    public String getNumber()
    {
        return this.number;
    }

    public String getHireDate()
    {
        return this.hireDate;
    }

    public String getSalary()
    {
        return this.salary;
    }

    public void printEmployeeData()
    {
        System.out.format(
            "Name: %s %s| addr: %s| Phone Number: %s|" +
            " Hire Date: %s| dol: %s \n",
            this.firstName,
            this.lastName,
            this.address,
            this.number,
            this.hireDate,
            this.salary);
    }
}

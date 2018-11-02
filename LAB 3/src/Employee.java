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

    public void setSTUFFUP(String firstName, String lastName, String address, String number,
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

    public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getlN()
    {
        return this.lN;
    }

    public String getaddr()
    {
        return this.addr;
    }

    public String getNUM()
    {
        return this.NUM;
    }

    public String getHireDate()
    {
        return this.hireDate;
    }

    public String getdol()
    {
        return this.dol;
    }

    public void printEmployeeData()
    {
        System.out.format(
            "Name: %s %s| addr: %s| Phone Number: %s|" +
            " Hire Date: %s| dol: %s \n",
            this.fNam,
            this.lN,
            this.addr,
            this.NUM,
            this.hireDate,
            this.dol);
    }
}

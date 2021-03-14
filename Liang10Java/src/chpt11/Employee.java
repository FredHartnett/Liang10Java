package chpt11;

//Intro to Java Programming 10th ed. Y. Daniel Liang

public class Employee extends Person {
    private String office;
    private double salary;
    private int day;
    private int month;
    private int year;
    private MyDate hireDate;

    public Employee(String name, String address, String phoneNum,
                   String emailAddr, String office, double salary,int year, int month, int day) {
        super(name,address,phoneNum,emailAddr);
        this.office = office;
        this.salary = salary;
        this.day = day;
        this.month = month;
        this.year = year;
        hireDate = new MyDate(this.year,this.month,this.day);
    }

    public Employee(String name, String address, String phone,
                    String email, String office, double salary) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        //this.dateHired = new MyDate();
    }

    public Employee() { }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNum='" + getPhoneNum() + '\'' +
                ", emailAddr='" + getEmailAddr() + '\'' +
                ", office='" + getOffice() + '\'' +
                ", salary='" + getSalary() + '\'' +
                ", hire date='" + getMonth() + "-" + getDay() + "-" + getYear() + '\'' + "}";
    }

    public MyDate getHireDate() {
        return hireDate;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

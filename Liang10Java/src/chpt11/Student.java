package chpt11;

public class Student extends Person {
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 3;
    public final static int JUNIOR = 2;
    public final static int SENIOR = 4;

    public Student(String name, String address, String phoneNum,
                   String emailAddr, int status) {
        super(name,address,phoneNum,emailAddr);
        this.status = status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public String getStatus() {
        switch (status) {
            case 1: return "FRESHMAN";
            case 2: return "SOPHOMORE";
            case 3: return "JUNIOR";
            case 4: return "SENIOR";
            default: return "UNKNOWN";
        }
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNum='" + getPhoneNum() + '\'' +
                ", emailAddr='" + getEmailAddr() + '\'' +
                ", class status='" + getStatus() + '\'' + "}";
    }

}

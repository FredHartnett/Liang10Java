package chpt11;

//Intro to Java Programming 10th ed. Y. Daniel Liang

public class Person {
    private String name;
    private String address;
    private String phoneNum;
    private String emailAddr;

    public Person(String name, String address, String phoneNum, String emailAddr) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.emailAddr = emailAddr;
    }

    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", emailAddr='" + emailAddr + '\'' +
                '}';
    }
}

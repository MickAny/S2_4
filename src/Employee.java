public class Employee {
    private String phoneNumber;
    private int ID;
    private String name;
    private double exp;

    public Employee(int ID, String name, String phoneNumber,  double exp) {
        this.phoneNumber = phoneNumber;
        this.ID = ID;
        this.name = name;
        this.exp = exp;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public double getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return "(ID: " + ID + ") Name: " + name + " | Phone: " + phoneNumber + " | Experience: " + exp + " years";
    }
}
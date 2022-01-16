package ContactsApp;

class Contacts implements java.io.Serializable{
    private String name;
    private String number;
    private String Name;
    private String Phone;

    public Contacts(String firstName, String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void printInfo() {
        System.out.println("Name:" + Name + ", Phone:" + Phone);
    }
}
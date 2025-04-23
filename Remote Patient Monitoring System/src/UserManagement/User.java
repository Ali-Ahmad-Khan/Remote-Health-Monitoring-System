package UserManagement;

public class User {
    private int userID;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String email;

    public User(int userID, String name, int age, String gender, String address, String email) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.email = email;
    }

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + userID + ", Name: " + name + ", Email: " + email;
    }
}

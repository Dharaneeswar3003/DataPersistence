import java.util.ArrayList;
import java.util.List;

class Friend {
    private String name;
    private int Age;
    private String email;

    // requires: name, Age, and email should be valid inputs
    // modifies: this
    // effects: creates a Friend object with the given name, age, and email
    public Friend(String name, int Age, String email) {
        this.name = name;
        this.Age = Age;
        this.email = email;
    }

    // getters and setters...
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }
    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + Age + ", Email: " + email;
    }
}
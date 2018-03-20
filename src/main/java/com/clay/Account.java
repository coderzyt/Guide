package main.java.com.clay;

/**
 * Account
 */
public class Account {
    String firstName;

    String lastName;

    final String ACCOUNT_DATE_FILE = "AccountData.txt";

    public Account(String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isValid() {

    }

    public boolean save() {
        FileUtil futil = new FileUtil();
        String dataLine = getLastName() + ", " + getFirstName(); 
        return futil.writeToFile(ACCOUNT_DATE_FILE, dataLine, true, true);
    }
}


package emailApp;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private  int defaultPasswordLenght = 10;
    private String email;
    private String companySuffix= "pentty.com";



    //Constructor to ask for the first name and the last name
    public Email (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;


        //call setDepartment method
        this.department = setDepartment();
        System.out.println(this.department);

        //call Passowrdset
        this.password = randomPassword(defaultPasswordLenght);

        email = firstName.toLowerCase() + "." +lastName.toLowerCase() + '@' + department.toLowerCase() +  "." + companySuffix.toLowerCase();
    }

    private String setDepartment () {
        System.out.print("New worker: " + firstName + ". Enter the following: Department codes\n1 Sales\n2 Development\n3 Accounting\n0 None\n Enter your department code:  ");
        Scanner input = new Scanner(System.in);
        int departmentChoice = input.nextInt();
        if (departmentChoice == 1) {
            return "Sales";
        } else if (departmentChoice == 2) {
            return "Development";
        } else if (departmentChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }

    private String randomPassword (int lenght) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%&";
        char[] password = new char [lenght];
        for (int i=0; i<lenght; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);

        }
        return new String(password);


    }


    //set the mailbox capacity
    public void setMailBoxCapacity (int capacity) {
        this.mailBoxCapacity = capacity ;
    }

    public void setAlternateEmail (String altEmail) {
        this.alternateEmail = altEmail;

    }

    public  void  setPassword (String password) {
        this.password = password;
    }
    public int getMailBoxCapacity () {return mailBoxCapacity;}
    public String getAlternateEmail () {return alternateEmail;}
    public String getPassword () {return password;}

    public String showInfo() {
        return "\nDisplay Name: " + firstName + " " + lastName +
                "\nCompany email: " + email +
                "\nMailbox capacity: " + mailBoxCapacity + "mb";
    }
}

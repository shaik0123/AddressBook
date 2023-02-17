package com.addressbookmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUcTwo {
    public ArrayList<Contact> contactbook = new ArrayList<>();
    public void addContact()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = scan.nextLine();
        System.out.println("Enter Last Name");
        String lastName = scan.nextLine();
        System.out.println("Enter Address");
        String address = scan.nextLine();
        System.out.println("Enter City");
        String city = scan.nextLine();
        System.out.println("Enter State");
        String state = scan.nextLine();
        System.out.println("Enter Zip Code");
        int zip = scan.nextInt();
        System.out.println("Enter Phone Number");
        long mobileNo = scan.nextLong();
        System.out.println("Enter E-mail");
        String email = scan.next();
        Contact contact = new Contact(firstName, lastName, address, city, state,  email,mobileNo, zip);
        contactbook.add(contact);
        System.out.println("Contact added Successfully");
    }
    public void displayPerson()
    {
        System.out.println("\n Person Details is:");
        for (Contact person : contactbook)
        {
            System.out.println(person.toString());
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome To Address Book ");
        AddressBookUcTwo address = new AddressBookUcTwo();
        address.addContact();
        address.displayPerson();
    }
}

class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String email;
    private long mobileNo;
    private int zip;


    public Contact(String firstName, String lastName, String address, String city, String state, String email, long mobileNo, int zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address= address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.mobileNo = mobileNo;
        this.zip = zip;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String toString() {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", Address="+address+", city=" + city
                + ", state=" + state + ", pincode=" + zip + ", MobileNo=" + mobileNo + "]" + "\n";
    }
}


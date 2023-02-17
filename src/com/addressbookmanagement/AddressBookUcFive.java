package com.addressbookmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUcFive {
    public ArrayList<Contact> contactbook = new ArrayList<>();
    public void addContact()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Name");
        String first = scan.nextLine();
        System.out.println("Enter Last Name");
        String last = scan.nextLine();
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
        Contact contact = new Contact(first, last, address, city, state,  email,mobileNo, zip);
        contactbook.add(contact);
        System.out.println("Contact added Successfully");
        System.out.println("\n You can add multiple person's entry");
    }
    public void displayPerson()
    {
        System.out.println("\n Person Details is:");
        for (Contact person : contactbook)
        {
            System.out.println(person.toString());
        }
    }
    public void editPerson() {

        System.out.println("\n enter First name to edit details:");

        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        for (Contact person : contactbook) {
            System.out.println(person.toString());

            if (name.equals(person.getFirstName())) {

                System.out.println("\"Select the option to edit: \n"
                        + "1) Mobile no\n"
                        + "2) Email-Id\n"
                        + "3) Address\n"
                        + "4) Quit");
                int numb = scan.nextInt();

                switch (numb) {
                    case 1: {
                        System.out.println("enter new Mobile number:");
                        long mobileNo = scan.nextLong();

                        person.setMobileNo(mobileNo);
                        System.out.println("mobile no. is updated\n");
                        break;
                    }
                    case 2: {
                        System.out.println("enter new Email-id:");
                        String email = scan.nextLine();

                        person.setEmail(email);
                        System.out.println("Email-id is updated\n");
                        break;
                    }
                    case 3: {
                        System.out.println("enter your city");
                        String city = scan.nextLine();

                        System.out.println("enter your state");
                        String state = scan.nextLine();

                        System.out.println("enter your zip code");
                        int zip = scan.nextInt();

                        person.setCity(city);
                        person.setState(state);
                        person.setZip(zip);
                        System.out.println("Address is updated\n");
                        break;
                    }
                    default:
                        System.out.println("please enter right choice");
                }
            } else
                System.out.println("Person is not registered");
        }
        System.out.println(toString());
    }

    public void deletePerson()
    {
        System.out.println("enter First name to delete details:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        for (int i=0; i < contactbook.size(); i++)
        {
            String personName = contactbook.get(i).getFirstName();

            if (name.equals(personName))
            {
                contactbook.remove(i);
                System.out.println("this person details is deleted");
                break;
            }
            else
                System.out.println("please enter valid name");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome To The Address Book Problem-");
        AddressBookUcFive address = new AddressBookUcFive();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add Contact");
        System.out.println("2.Display Contact");
        System.out.println("3.Edit Contact");
        System.out.println("4.Delete Contact");
        System.out.println("4.Exit");
        int k=0;
        while(k==0)
        {
            System.out.println("Enter the choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    address.addContact();
                    break;
                case 2:
                    address.displayPerson();
                    break;
                case 3:
                    address.editPerson();
                    break;

                case 4:
                    address.deletePerson();
                    break;
                case 5:
                    System.out.println("Exit");
                    k = 1;
                    break;
            }
        }

    }
}

package com.addressbookmanagement;

import java.util.Scanner;

public class AddressBookUcOne {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");
        Contacts contact = new Contacts();
        contact.createContacts();
        System.out.println(contact.toString());
    }

    static class Contacts {
        private String firstName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {

            this.firstName = firstName;
        }

        private String lastName;

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        private String city;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        private int zip;

        public int getZip() {
            return zip;
        }

        public void setZip(int zip) {
            this.zip = zip;
        }

        private String state;

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        private long phoneNum;

        public long getPhoneNum() {
            return phoneNum;
        }

        public void setPhoneNum(long phoneNum) {
            this.phoneNum = phoneNum;
        }


        public void createContacts() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter First Name : ");
            setFirstName(sc.nextLine());
            System.out.print("Enter Last Name : ");
            setLastName(sc.nextLine());
            System.out.print("Enter City Name : ");
            setCity(sc.nextLine());
            System.out.print("Enter State Name : ");
            setState(sc.nextLine());
            System.out.print("Enter Zip Code : ");
            setZip(sc.nextInt());
            System.out.print("Enter Phone Number : ");
            setPhoneNum(sc.nextLong());
        }

        public String toString() {

            String str = "Contacts: [First_Name = " + getFirstName() + ", Last_Name = " + getLastName() +
                    ", City = " + getCity() + ", State = " + getState() + ", Zip = " + getZip() + ", PhoneNumber = " + getPhoneNum() + "]";
            return str;

        }
    }
}
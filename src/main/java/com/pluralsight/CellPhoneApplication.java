package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        CellPhone newPhone = new CellPhone();
        CellPhone cellphone1 = new CellPhone();  // Create the first CellPhone object
        CellPhone cellphone2  = new CellPhone();  // Create the second CellPhone object

        Scanner scanner = new Scanner(System.in);

        // asks question for cellphone1
        cellphone1.setSerialNumber(Integer.parseInt(askQuestion(scanner,"What is the serial number?")));
        cellphone1.setModel(askQuestion(scanner,"What model is the phone?"));
        cellphone1.setCarrier(askQuestion(scanner,"Who is the carrier?"));
        cellphone1.setPhoneNumber(askQuestion(scanner,"What is the phone number?"));
        cellphone1.setOwner(askQuestion(scanner,"Who is the owner of the phone?"));

        //asks question for cellphon2
        cellphone2.setSerialNumber(Integer.parseInt(askQuestion(scanner,"What is the serial number?")));
        cellphone2.setModel(askQuestion(scanner,"What model is the phone?"));
        cellphone2.setCarrier(askQuestion(scanner,"Who is the carrier?"));
        cellphone2.setPhoneNumber(askQuestion(scanner,"What is the phone number?"));
        cellphone2.setOwner(askQuestion(scanner,"Who is the owner of the phone?"));

        //display both cellphones
        display(cellphone1);
        display(cellphone2);

        //dails the phone.
        cellphone1.dial("855-555-2222");

        //first number to call new number
        cellphone1.dial(cellphone2.getPhoneNumber());

        //second phone to call the first number
        cellphone2.dial(cellphone1.getPhoneNumber());

        scanner.close(); //closes the scanner.
    }

    //method to display the phone
    public static void display(CellPhone phone){
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("-------------------------");

    }

    //method to ask the quesiton.
    public  static String askQuestion(Scanner scanner, String question ){

        System.out.println(question + " ");
        return scanner.nextLine().trim();
    }
}

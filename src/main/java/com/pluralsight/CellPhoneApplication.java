package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        CellPhone newPhone = new CellPhone();

        Scanner scanner = new Scanner(System.in);

        newPhone.setSerialNumber(Integer.parseInt(askQuestion(scanner,"What is the serial number?")));
        newPhone.setModel(askQuestion(scanner,"What model is the phone?"));
        newPhone.setCarrier(askQuestion(scanner,"Who is the carrier?"));
        newPhone.setPhoneNumber(askQuestion(scanner,"What is the phone number?"));
        newPhone.setOwner(askQuestion(scanner,"Who is the owner of the phone?"));

        System.out.println(newPhone);

        newPhone.dail("855-555-2222");
    }

    public  static String askQuestion(Scanner scanner, String question ){

        System.out.println(question + " ");
        return scanner.nextLine().trim();
    }
}

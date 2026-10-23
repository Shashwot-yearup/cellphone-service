package com.pluralsight;

public class CellPhone {

    //private properties
    private int serialNumber;
    private  String model;
    private  String carrier;
    private  String phoneNumber;
    private String owner;

    public CellPhone() {

        //sets the defaults  for the properties of this class
        this.serialNumber = 0;
        this.model = "";
        this.phoneNumber = " ";
        this.carrier = " ";
        this.owner = " ";
    }

    // created a dail method.
    public void dial(String phoneNumber){
        System.out.println(owner + " s.phone is calling " + phoneNumber);
    }

    // created a another dial method @@(string overload)
    public void dial(CellPhone somePhone) {
        System.out.println(owner + " s.phone is calling " + somePhone.getPhoneNumber());
        //created a
    }
    // the getter and setter
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getModel() {
        return model;
    }


    //method to sout the answers.
    @Override
    public String toString() {
        return "CellPhone{" +
                "serialNumber = " + serialNumber +
                ", model = '" + model + '\'' +
                ", carrier = '" + carrier + '\'' +
                ", phoneNumber = '" + phoneNumber + '\'' +
                ", owner = '" + owner + '\'' +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }
}

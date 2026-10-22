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

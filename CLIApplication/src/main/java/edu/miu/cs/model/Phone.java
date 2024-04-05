package edu.miu.cs.model;

public class Phone {
    private String phoneNumber;
    private String phoneLabel;

    public Phone(String phoneNumber, String phoneLabel) {
        this.phoneNumber = phoneNumber;
        this.phoneLabel = phoneLabel;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneLabel() {
        return phoneLabel;
    }

    public void setPhoneLabel(String phoneLabel) {
        this.phoneLabel = phoneLabel;
    }
}

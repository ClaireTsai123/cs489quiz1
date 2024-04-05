package edu.miu.cs.model;

public class Email {
    private String emailAddress;
    private String emailLabel;

    public Email(String emailAddress, String emailLabel) {
        this.emailAddress = emailAddress;
        this.emailLabel = emailLabel;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailLabel() {
        return emailLabel;
    }

    public void setEmailLabel(String emailLabel) {
        this.emailLabel = emailLabel;
    }

    @Override
    public String toString() {
        return "\t {" +
                "emailAddress " + emailAddress + '\'' +
                ", emailLabel " + emailLabel + '\'' +
                '}';
    }
}

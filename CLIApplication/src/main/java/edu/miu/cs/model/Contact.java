package edu.miu.cs.model;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    private String firstName;
    private String lastName;
    private String companyName;
    private String jobTitle;

    private List<Email> emails;
    private List<Phone> Phones;

    public Contact(){}

    public Contact(String firstName, String lastName, String companyName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<Phone> getPhones() {
        return Phones;
    }

    public void setPhones(List<Phone> phones) {
        Phones = phones;
    }


}

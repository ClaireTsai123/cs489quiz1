package edu.miu.cs.db;

import edu.miu.cs.model.Contact;
import edu.miu.cs.model.Email;
import edu.miu.cs.model.Phone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DataLoader {
    public static List<Contact> createContactList() {
        List<Contact> contactList = new ArrayList<>();
        Contact c1 = new Contact("David", "Sanger", "Argos LLC", "Sales Manager");
        Email e1 = new Email("dave.sang@gmail.com", "Home");
        Email e2 = new Email("dsanger@argos.com", "Work");
        List<Email> emails = new ArrayList<>();
        emails.add(e1);
        emails.add(e2);
        c1.setEmails(emails);
        Phone p1 = new Phone("240-133-001", "Home");
        Phone p2 = new Phone("240-112-0123", "Mobile");
        List<Phone> phones1 = new ArrayList<>();
        phones1.add(p1);
        phones1.add(p2);
        c1.setPhones(phones1);
        contactList.add(c1);
        Contact c2 = new Contact("Carlos", "Jimenez", "Zappos", "Director");
        contactList.add(c2);
        Contact c3 = new Contact("Ali", "Gafar", "BMI Services", "HR Manager");
        Phone p3 = new Phone("412-116-9988", "Work");
        List<Phone> phones2 = new ArrayList<>();
        phones2.add(p3);
        Email e3 = new Email("ali@bmi.com", "Work");
        List<Email> emails1 = new ArrayList<>();
        emails1.add(e3);
        c3.setEmails(emails1);
        c3.setPhones(phones2);
        contactList.add(c3);
        contactList.sort(Comparator.comparing(Contact::getLastName));
        return contactList;
    }

}

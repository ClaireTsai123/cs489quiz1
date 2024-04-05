package edu.miu.cs;

import edu.miu.cs.db.DataLoader;
import edu.miu.cs.model.Contact;
import edu.miu.cs.model.Email;
import edu.miu.cs.model.Phone;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Contact> contactList = DataLoader.createContactList();
        printInJSONFormat(contactList);
    }

    private static void printInJSONFormat(List<Contact> contactList) {
        StringBuilder sb = new StringBuilder("[\n");
//        System.out.println("[");
        for (Contact contact : contactList) {
            sb.append(String.format("  {\n    \"FirstName\": \"%s\",\n", contact.getFirstName()));
            sb.append(String.format("    \"LastName\": \"%s\",\n", contact.getLastName()));
            sb.append(String.format("    \"Company\": \"%s\",\n", contact.getCompanyName()));
            sb.append(String.format("    \"Job Title\": \"%s\",\n", contact.getJobTitle()));

            List<Email> emails = contact.getEmails();
            if (emails != null && !emails.isEmpty()) {
                sb.append("    \"Email Addresses\": [\n");
                for (int i = 0; i < emails.size(); i++) {
                    Email email = emails.get(i);
                    sb.append(String.format("      {\"Email\": \"%s\", \"Label\": \"%s\"}", email.getEmailAddress(), email.getEmailLabel()));
                    if (i < emails.size() - 1)
                        sb.append(",");
                    sb.append("\n");
                }
                sb.append("    ],\n");
            }

            List<Phone> phones = contact.getPhones();
            if (phones != null && !phones.isEmpty()) {
                sb.append("    \"Phone Numbers\": [\n");
                for (int i = 0; i < phones.size(); i++) {
                    Phone phone = phones.get(i);
                    sb.append(String.format("      {\"Phone No\": \"%s\", \"Label\": \"%s\"}", phone.getPhoneNumber(), phone.getPhoneLabel()));
                    if (i < phones.size() - 1)
                        sb.append(",");
                    sb.append("\n");
                }
                sb.append("    ]\n");
            }

            sb.append("  },\n");
        }
        if (!contactList.isEmpty())
            sb.deleteCharAt(sb.length() - 2);
        sb.append("]");
        System.out.println(sb.toString());
    }
}

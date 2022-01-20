package ContactsApp;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.*;

public class ContactManagerApplicationTest {

    public ContactManagerApplicationTest() {
    }
    //static Hashtable<String, Contacts> phonebook;
public static void main(String[] args) {
        String contactFilePath = "src/contactList";
        Path directoryPath = Paths.get(contactFilePath);
        try {
            if (Files.notExists(directoryPath)) {
                Files.createDirectory(directoryPath);
            } else {
                System.out.println("already created");
            }
        } catch (IOException var13) {
            var13.printStackTrace();
        }

        Path txt = Paths.get(contactFilePath, "contacts.txt");

        try {
            if (Files.notExists(txt)) {
                Files.createFile(txt);
            }
        } catch (IOException var12) {
            var12.printStackTrace();
        }

        boolean goOut = false;
        ContactsListUpdate phonebook = new ContactsListUpdate();

        while(!goOut) {
            System.out.println("1. Add contact");
            System.out.println("2. View contacts");
            System.out.println("3. Search contacts");
            System.out.println("4. Delete contact");
            System.out.println("5.Exit!");

            try {
                Scanner scanner = new Scanner(System.in);
                scanner.useDelimiter("\n");
                System.out.println("Enter one of the options");
                int option = scanner.nextInt();
                String name;
                Contacts c;
                switch(option) {
                    case 1:
                        System.out.println("Enter a name");
                        scanner.nextLine();
                        name = scanner.nextLine();
                        System.out.println("Enter a number");
                        String number = scanner.nextLine();
                        c = new Contacts(name, number);
                        phonebook.addContact(c);
                        System.out.println(c.getName() + " successfully added to contacts!");
                        break;
                    case 2:
                        phonebook.contactList();
                        break;
                    case 3:
                        System.out.println("Enter a name");
                        scanner.nextLine();
                        name = scanner.nextLine();
                        c = phonebook.searchName(name);
                        if (c != null) {
                            System.out.println("Contact found!");
                            System.out.println(c.toFileString());
                        } else {
                            System.out.println("No contact found for " + name);
                        }
                        break;
                    case 4:
                        System.out.println("Enter a name");
                        scanner.nextLine();
                        name = scanner.nextLine();
                        phonebook.removeContact(name);
                        System.out.println(name + " successfully deleted from contacts");
                        break;
                    case 5:
                        phonebook.saveContacts();
                        goOut = true;
                        break;
                    default:
                        System.out.println("default case change later");
                }
            } catch (Exception var11) {
                var11.printStackTrace();
            }
        }

    }
}

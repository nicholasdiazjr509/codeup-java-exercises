package ContactsApp;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;


public class ContactsListUpdate {
    public ArrayList<Contacts> contacts = new ArrayList();
    public ArrayList<String> contactStrings = new ArrayList();

    public ContactsListUpdate() {
    }

    public void addContact(Contacts c) {
        this.contacts.add(c);
        String var10000 = c.getName();
        String contactInfo = var10000 + " " + c.getNumber();
        this.contactStrings.add(contactInfo);
        if (this.existContact(c)) {
            System.out.println("This contact already exists");
        } else {
            try {
                Path p = null;
                Files.write(p, this.contactStrings, StandardOpenOption.APPEND);
            } catch (IOException var5) {
                var5.printStackTrace();
            }
        }

    }

    public boolean existContact(Contacts c) {
        for(int i = 0; i < this.contacts.size(); ++i) {
            if (c.equals(this.contacts.indexOf(i))) {
                return true;
            }
        }

        return false;
    }

    public void contactList() {
        Path fileTxt = Paths.get("src/contactList/contacts.txt");
        Object listOfContacts = new ArrayList();

        try {
            listOfContacts = Files.readAllLines(fileTxt);
        } catch (IOException var5) {
            var5.printStackTrace();
        }

        Iterator var3 = ((List)listOfContacts).iterator();

        while(var3.hasNext()) {
            String contacts = (String)var3.next();
            System.out.println(contacts);
        }

    }

    public void searchName(Path path, String searchName) throws IOException {
        Scanner scan = new Scanner(path);

        while(scan.hasNext()) {
            String line = scan.nextLine().toLowerCase();
            if (line.contains(searchName.toLowerCase(Locale.ROOT))) {
                System.out.println(line);
            }
        }

    }

    public void removeContact(Path p, Contacts searchContact) throws IOException {
        new Scanner(System.in);
        new Scanner(p);

        try {
            Files.delete(p);
        } catch (NoSuchFileException var6) {
            System.err.format("%s: no such file or directory%n", p);
        } catch (DirectoryNotEmptyException var7) {
            System.err.format("%s not empty%n", p);
        } catch (IOException var8) {
            System.err.println(var8);
        }

    }

    public Contacts searchName(String name) {
        return this.searchName(name);
    }

    public void removeContact(String name) {
    }

    public void saveContacts() {
    }
}

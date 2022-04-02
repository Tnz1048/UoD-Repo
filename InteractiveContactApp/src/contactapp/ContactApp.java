
package contactapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import uod.gla.io.File;
import uod.gla.menu.Finalisable;
import uod.gla.menu.MenuBuilder;
import uod.gla.menu.MenuItem;
import uod.gla.util.CollectionUtils;
import uod.gla.util.Reader;
import uod.gla.util.Sequence;

/**
 * @author Chigozie
 */
public class ContactApp implements Finalisable {
    
    private static ContactApp object = new ContactApp();
    private static Sequence seq = new Sequence(1, 2_000_000_000);
    private static List<Contact> CONTACTS = new ArrayList<>();
    
    private static File seqFile = new File("Data", "seq");
    private static File contactFile = new File("data", "contacts");
    
    public static void main(String[] args) {
        Sequence tseq = seqFile.<Sequence>retrieve(true);
        List<Contact> tcontacts = contactFile.<List<Contact>>retrieve(true);
        if (tseq != null) {
            seq = tseq;
        }
        if (tcontacts != null) {
            CONTACTS = tcontacts;
        }
        System.out.println("Welcome to Interactive Contact Application");
        MenuItem c = new MenuItem("C", "Create New Contact", object, "createContact");
        MenuItem l = new MenuItem("L", "Display Contacts", object, "listContacts");
        MenuItem e = new MenuItem("E", "Edit Contacts", object, "editContacts");
        MenuItem d = new MenuItem("D", "Delete Contacts", object, "deleteContacts");
        MenuBuilder.displayMenu(object, c, l, e, d); // Please see comments below
        /*
        Towards the end of the 5th part of the video, you'd have noticed that 
        the contacts did not save when X was used to terminate the program.
        The reason for that is I used the wrong version of MenuBuilder.displayMenu()
        The one that enables the X to work is the one that takes in a Finalisable
        object as part of its arguments. So instead of 
        MenuBuilder.displayMenu(c, l, e, d);
        it should be 
        MenuBuilder.displayMenu(object, c, l, e, d);
        Remember that object (see line 22 above) is really just a way to provide
        access to the relevant methods in ContactApp so that the menu system
        can call the relevant methods to perform tasks as required.
        */
        System.out.println("Goodbye!");
        object.finalise();
    }
    
    public static void createContact() {
        MenuItem p = new MenuItem("P", "Create Personal Contact", object, "createPersonalContact");
        MenuItem b = new MenuItem("B", "Create Business Contact", object, "createBusinessContact");
        MenuBuilder.displayMenuOnce(p, b);
    }
    
    public static void createPersonalContact() {
        String fn = Reader.readName("First Name: ");
        String ln = Reader.readName("Last Name: ");
        String ph = Reader.readNumber("Phone Number: ", 11);
        String em = Reader.readEmail("Email: ");
        String nn = Reader.readLine("Nickname: ");
        PersonalContact p = new PersonalContact(fn, ln, ph, em, nn, seq.next());
        CONTACTS.add(p);
    }
    
    public static void createBusinessContact() {
        String fn = Reader.readName("First Name: ");
        String ln = Reader.readName("Last Name: ");
        String ph = Reader.readNumber("Phone Number: ", 11);
        String em = Reader.readEmail("Email: ");
        String ws = Reader.readLine("Website: ");
        BusinessContact b = new BusinessContact(fn, ln, ph, em, ws, seq.next());
        CONTACTS.add(b);
    }
    
    public static void listContacts() {
        Collections.sort(CONTACTS);
        for (Contact c : CONTACTS) {
            System.out.println(c);
        }
    }
    
    public static void editContacts() {
        Contact c = search();
        if (c == null) {
            System.out.println("No contact found!");
            return;
        }
        System.out.println("The following contact has been found...");
        System.out.println(c);
        System.out.println();
        boolean edited = false;
        if (Reader.readBoolean("Do you want to edit the first name? ")) {
            c.setFirstName(Reader.readName("Enter new first name: "));
            edited = true;
        }
        if (Reader.readBoolean("Do you want to edit the last name? ")) {
            c.setLastName(Reader.readName("Enter new last name: "));
            edited = true;
        }
        if (Reader.readBoolean("Do you want to edit the phone number? ")) {
            c.setPhoneNumber(Reader.readNumber("Enter new phone number: "));
            edited = true;
        }
        if (Reader.readBoolean("Do you want to edit the email? ")) {
            c.setEmail(Reader.readEmail("Enter new email: "));
            edited = true;
        }
        if (c instanceof PersonalContact) {
            if (Reader.readBoolean("Do you want to edit the nickname? ")) {
                ((PersonalContact)c).setNickname(Reader.readLine("Enter new nick name: "));
                edited = true;
            }
        } else {
            if (Reader.readBoolean("Do you want to edit the website? ")) {
                ((BusinessContact)c).setWebsite(Reader.readLine("Enter new website: "));
                edited = true;
            }
        }
        
        if (edited) {
            System.out.println("Changes have been saved!");
        } else {
            System.out.println("No changes were made!");
        }

    }
    
    private static Contact search() {
        String key = Reader.readLine("Enter a contact detail: ");
        Collection<Contact> contactsFound = CollectionUtils.search(key, CONTACTS);
        if (contactsFound.isEmpty()) {
            return null;
        } else if (contactsFound.size() == 1) {
            return ((List<Contact>)contactsFound).get(0);
        } else {
            return Reader.readObject("Please choose a contact: ", contactsFound);
        }
    }
    
    public static void deleteContacts() {
        Contact c = search();
        if (c == null) {
            System.out.println("No contact found!");
            return;
        }
        System.out.println("The following contact has been found...");
        System.out.println(c);
        System.out.println();
        if (Reader.readBoolean("Do you want to delete the contact?")) {
            CONTACTS.remove(c);
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Deletion aborted!");
        }
    }

    @Override
    public void finalise() {
        seqFile.save(seq);
        contactFile.save((Serializable)CONTACTS);
    }
    
}


package contactapp;

import java.io.Serializable;

/**
 * @author Chigozie
 */
public abstract class Contact implements Serializable, Comparable<Contact> {
    
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    
    private final String id;

    public Contact(String firstName, String lastName, 
            String phoneNumber, String email, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.id = id;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(Contact o) {
        if (!this.firstName.equals(o.getFirstName())) {
            return this.firstName.compareTo(o.getFirstName());
        } else {
            return this.lastName.compareTo(o.getLastName());
        }
    }
    
}

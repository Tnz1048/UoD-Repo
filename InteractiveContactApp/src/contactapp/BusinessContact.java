
package contactapp;

/**
 * @author Chigozie
 */
public class BusinessContact extends Contact {
    
    private String website;
    
    public BusinessContact(String firstName, String lastName, 
            String phoneNumber, String email, String website, String id) {
        super(firstName, lastName, phoneNumber, email, id);
        this.website = website;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        // 1: Sharon Dann
        // > 02893298928, sharond@gmail.com
        // > www.website.com
        return getId() + ": " + getFirstName() + " " + getLastName() 
                + "\n > " + getPhoneNumber() + ", " + getEmail()
                + "\n > " + getWebsite();
    }
    
    
    
}

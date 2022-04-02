
package contactapp;

/**
 * @author Chigozie
 */
public class PersonalContact extends Contact {
    
    private String nickname;
    
    public PersonalContact(String firstName, String lastName, 
            String phoneNumber, String email, String nickname, String id) {
        super(firstName, lastName, phoneNumber, email, id);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        // 1: Sharon Dann (nickname)
        // > 02893298928, sharond@gmail.com
        return getId() + ": " + getFirstName() + " " + getLastName() 
                + " (" + nickname + ")" + "\n > " 
                + getPhoneNumber() + ", " + getEmail();
    }
    
    
    
}

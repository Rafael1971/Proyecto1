package net.software.backendcursojava.shared.dto;

public class userDTO {
    private static final long serialVersionUID =1L;

    private long id;
    private String iserId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptedpassword;
    
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getIserId() {
        return iserId;
    }
    public void setIserId(String iserId) {
        this.iserId = iserId;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEncryptedpassword() {
        return encryptedpassword;
    }
    public void setEncryptedpassword(String encryptedpassword) {
        this.encryptedpassword = encryptedpassword;
    }
    
}

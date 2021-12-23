class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (firstName != null && !firstName.equals("")){
            this.firstName = firstName;
        }else {
            this.firstName = null;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null && !lastName.equals("")){
            this.lastName = lastName;
        }else {
            this.lastName = null;
        }
    }

    public String getFullName() {
        return (firstName != null && lastName != null) ? firstName + " " + lastName:
                (firstName == null && lastName == null) ? "Unknown" :
                 firstName != null ? firstName : lastName  ; // write your code here
    }
}
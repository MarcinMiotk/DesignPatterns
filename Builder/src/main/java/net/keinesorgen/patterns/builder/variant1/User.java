package net.keinesorgen.patterns.builder.variant1;

/**
 *
 */
public class User {

    public static final UserBuilder Builder(String firstName, String lastName) {
        return new UserBuilder(firstName, lastName);
    }

    //required
    private final String firstName;
    //required
    private final String lastName;
    // ----------------------------------------
    //optional
    private final int age;
    //optional
    private final String phone;
    //optional
    private final String address;
    // optional
    private String[] childrens;
    // ----------------------------------------

    public User(UserBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.age = builder.getAge();
        this.phone = builder.getPhone();
        this.address = builder.getAddress();
        this.childrens = builder.getChildrens();
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the childrens
     */
    public String[] getChildrens() {
        return childrens;
    }
}

package net.keinesorgen.patterns.builder.variant1;

/**
 *
 */
public class UserBuilder {

    //required
    private final String firstName;
    //required
    private final String lastName;
    // ----------------------------------------
    //optional
    private int age;
    //optional
    private String phone;
    //optional
    private String address;
    // optional
    private String[] childrens;

    UserBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * We can do additional logic here. For example validation.
     *
     * @return Built user
     */
    public User build() throws UserStateException {
        if (age > 100) {
            throw new UserStateException("Age is oif of range");
        }
        return new User(this);
    }

    public UserBuilder setChildrens(String... children) {
        this.childrens = children;
        return this;
    }

    /**
     * @param age the age to set
     */
    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    /**
     * @param phone the phone to set
     */
    public UserBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * @param address the address to set
     */
    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * @return the firstName
     */
    protected String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    protected String getLastName() {
        return lastName;
    }

    /**
     * @return the age
     */
    protected int getAge() {
        return age;
    }

    /**
     * @return the phone
     */
    protected String getPhone() {
        return phone;
    }

    /**
     * @return the address
     */
    protected String getAddress() {
        return address;
    }

    protected String[] getChildrens() {
        return childrens;
    }

}

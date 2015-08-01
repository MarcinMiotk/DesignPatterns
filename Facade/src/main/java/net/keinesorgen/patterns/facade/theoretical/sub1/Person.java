package net.keinesorgen.patterns.facade.theoretical.sub1;

import java.util.Objects;

/**
 *
 */
public class Person {

    private final String login;
    private String phoneNumber;
    private int age;

    public Person(String login) {
        this.login = login;
    }

    public Person(String login, String phoneNumber, int age) {
        this.login = login;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return getLogin().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        return true;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

}

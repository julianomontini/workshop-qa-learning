package models;

import java.util.ArrayList;
import java.util.List;

public class Profile {
    private String job;
    private String company;
    private String ssn;
    private String residence;
    private List <Float> current_location = new ArrayList<>();
    private String blood_group;
    private List<String> website = new ArrayList<> ();
    private String username;
    private String name;
    private String sex;
    private String address;
    private String mail;
    private String birthdate;
    private int id;


    // Getter Methods

    public String getJob() {
        return job;
    }

    public String getCompany() {
        return company;
    }

    public String getSsn() {
        return ssn;
    }

    public String getResidence() {
        return residence;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public String getMail() {
        return mail;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public int getId() {
        return id;
    }

    // Setter Methods

    public void setJob(String job) {
        this.job = job;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Float> getCurrent_location() {
        return current_location;
    }

    public void setCurrent_location(List<Float> current_location) {
        this.current_location = current_location;
    }

    public List<String> getWebsite() {
        return website;
    }

    public void setWebsite(List<String> website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "username='" + username + '\'' +
                ", id=" + id +
                '}';
    }
}
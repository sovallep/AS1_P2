package parcial2as1.model;

import java.util.*;

public class CompanyEntity {

    public CompanyEntity() {
    }

    private int id;
    private String name;
    private String legalname;
    private String direction;
    private int phoneNumber;
    private String email;
    private String nit;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLegalname() {
        return legalname;
    }

    public String getDirection() {
        return direction;
    }
    
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getNit() {
        return nit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name ) {
        this.name = name;
    }

    public void setLegalname(String Legalname) {
        this.legalname = legalname;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

}
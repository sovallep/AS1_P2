package parcial2as1.model;

import java.util.*;

public class TransportEntity {

    public TransportEntity() {
    }

    private int id;
    private int model;
    private int companyId;
    private int price;

    public int getId() {
        return id;
    }
    
    public int getModel() {
        return model;
    }
    
    public int getCompanyId() {
        return companyId;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setModel(int model) {
        this.model = model;
    }
    
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

}
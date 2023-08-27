package models;

import java.util.Date;

public class product {

    private Integer id;
    private String name;
    private String unitOfMeasure;
    private Date registrationDate;

    public product(Integer id, String name, String unitOfMeasure) {
        this.id = id;
        this.name = name;
        this.unitOfMeasure = unitOfMeasure;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

}

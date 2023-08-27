package models;

import java.util.Date;

/**
 *
 * @author delanhese
 */
public class client {

    private Integer id;
    private String name;
    private Integer clientType;
    private String cpfCnpj;
    private String phone;
    private String email;
    private String observation;
    private Date registrationDate;

    public client(Integer id, String name, Integer clientType, String cpfCnpj, String phone, String email, String observation) {
        this.id = id;
        this.name = name;
        this.clientType = clientType;
        this.cpfCnpj = cpfCnpj;
        this.phone = phone;
        this.email = email;
        this.observation = observation;
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

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

}

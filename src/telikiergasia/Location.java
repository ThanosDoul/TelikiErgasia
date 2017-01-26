/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telikiergasia;

/**
 *
 * @author user
 */
public class Location {
    private String location;
    private String adress;
    private int adressNumber;
    private String postalCode;

    public Location(String location, String adress, int adressNumber, String postalCode) {
        this.location = location;
        this.adress = adress;
        this.adressNumber = adressNumber;
        this.postalCode = postalCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAdressNumber() {
        return adressNumber;
    }

    public void setAdressNumber(int adressNumber) {
        this.adressNumber = adressNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    
    
    
    
}

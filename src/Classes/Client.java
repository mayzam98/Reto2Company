/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author mayko
 */
public class Client extends Person{
    private String address;
    private String phone;

    public Client(String name, String lastName, String identification, String e_mail, String address, String phone) {
        super(name, lastName, identification, e_mail);
        this.address = address;
        this.phone = phone;
    }
    
    
    @Override
    public String getInformationDescription(){
        String personInformation = "Nombre: " + super.getName() +
                "\n" + "Apellidos:  " + super.getLastName() + "\n" +
                "Identificacion: " + super.getIdentification() + "\n" +
                "e-mail: "+super.getE_mail() + "\nDireccion: " + this.address + "\nTelefono: " + this.phone;
        System.out.println(personInformation);
        return personInformation;
    
    }
    
    @Override
    public String getInformation(){
        String personInformation = super.getName() + "\n" +
                super.getLastName() + "\n" +
                super.getIdentification() + "\n" +
                super.getE_mail() + "\n" + this.address + "\n" + this.phone;
        System.out.println(personInformation);
        return personInformation;
    
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
}

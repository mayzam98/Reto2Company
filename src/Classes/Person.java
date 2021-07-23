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
public class Person {

    
    String  name;
    private String lastName;
    private String identification;
    private String e_mail;

    public Person(String name, String lastName, String identification, String e_mail) {
        this.name = name;
        this.lastName = lastName;
        this.identification = identification;
        this.e_mail = e_mail;
    }
    
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the identification
     */
    public String getIdentification() {
        return identification;
    }

    /**
     * @param identification the identification to set
     */
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    /**
     * @return the e_mail
     */
    public String getE_mail() {
        return e_mail;
    }

    /**
     * @param e_mail the e_mail to set
     */
    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
    
    public String getInformation(){
        String personInformation = name + "\n" + lastName + "\n" + identification + "\n" + e_mail ;
        return personInformation;
    }
    
    public String getInformationDescription(){
        String personInformation = "Nombre: " + name + "\n" + "Apellidos:  " + lastName + "\n" + "Identificacion: " + identification + "\n" + "e-mail: "+e_mail ;
        return personInformation;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author mayko
 */
public class Administrative  extends Employee{

    private String category;
    private ArrayList<Employee> listSubordinates = new ArrayList();
    
    
        public Administrative(String name, String lastName, String identification, String e_mail, double salary, Position position, String category) {
        super(name, lastName, identification, e_mail, salary, position);
        this.category = category;
        
    }
    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the subordinates
     */
    public ArrayList<Employee> getSubordinates() {
        return listSubordinates;
    }

    /**
     * @param subordinates the subordinates to set
     */
    public void setSubordinates(ArrayList<Employee> subordinates) {
        this.listSubordinates = subordinates;
    }
    
    
    

    
    
    @Override
    public String getInformationDescription(){
        String stringSubordinates = "";
        for(Employee employee : listSubordinates){
            stringSubordinates = stringSubordinates + "\n" +employee.getName() + " " + employee.getLastName();
        }
        String personInformation = "Nombre: " + super.getName() + 
                "\n" + "Apellidos:  " + super.getLastName() + "\n" + 
                "Identificacion: " + super.getIdentification() + "\n" + "e-mail: " + 
                super.getE_mail() + "\nSalario: " + super.getSalary() + "\nCargo: " + super.getPosition().getNamePosition() + "\nNivel de jerarquia: " +
                super.getPosition().getHierarchicalLevel()+ "\nCategoria: "+ this.getCategory() + "\nSubordinados: " + stringSubordinates;
        System.out.println(personInformation);
        return personInformation;
    }
    
    
    @Override
    public String getInformation(){
        String stringSubordinates = "";
        for(Employee employee : listSubordinates){
            stringSubordinates = stringSubordinates + "\n" +employee.getName() + " " + employee.getLastName();
        }
        String personInformation = super.getName() + "\n" +
                super.getLastName() + "\n" +
                super.getIdentification() + "\n" +
                super.getE_mail() + "\n" + super.getSalary()+ "\n" + super.getPosition().getNamePosition() + "\n" + super.getPosition().getHierarchicalLevel() + "\n" + this.getCategory() + "\n" + stringSubordinates;
        System.out.println(personInformation);
        return personInformation;
    
    }
    
    public void addSubordinate(Employee employee){
        this.listSubordinates.add(employee);
    }
    
    
    
    
    
    
}

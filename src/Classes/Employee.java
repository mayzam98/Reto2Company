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
public class Employee extends Person{
    
    private double salary;
    private Position position;
    public Employee(String name, String lastName, String identification, String e_mail, double salary, Position position) {
        super(name, lastName, identification, e_mail);
        this.salary = salary;
        this.position = position;
           
        
    }
    
    
    
    @Override
    public String getInformationDescription(){
        String personInformation = "Nombre: " + super.getName() + 
                "\n" + "Apellidos:  " + super.getLastName() + "\n" + 
                "Identificacion: " + super.getIdentification() + "\n" + "e-mail: " + 
                super.getE_mail() + "\nSalario: " + this.getSalary() + "\nCargo: " + this.getPosition().getNamePosition() + "\nNivel de jerarquia: " +
                this.getPosition().getHierarchicalLevel();
        System.out.println(personInformation);
        return personInformation;
    }
    
    
    @Override
    public String getInformation(){
        String personInformation = super.getName() + "\n" +
                super.getLastName() + "\n" +
                super.getIdentification() + "\n" +
                super.getE_mail() + "\n" + this.getSalary()+ "\n" + this.getPosition().getNamePosition() + "\n" + this.getPosition().getHierarchicalLevel();
        System.out.println(personInformation);
        return personInformation;
    
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the position
     */
    public Position getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Position position) {
        this.position = position;
    }
    
    
}

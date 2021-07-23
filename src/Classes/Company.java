/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mayko
 */
public class Company {
    private String companyName;
    private String nit;
    private String address;
    private ArrayList<Employee>  listEmployee = new ArrayList();
    private ArrayList<Client>    listClient = new ArrayList<>();
    private ArrayList<Administrative> listAdministrative = new ArrayList<>();

    public Company(String companyName, String nit, String address, ArrayList<Employee> listEmployee) {
        this.companyName = companyName;
        this.nit = nit;
        this.address = address;
        this.listEmployee = listEmployee;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
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
     * @return the listEmployee
     */
    public ArrayList<Employee> getListEmployee() {
        return listEmployee;
    }

    /**
     * @param listEmployee the listEmployee to set
     */
    public void setListEmployee(ArrayList<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }

    /**
     * @return the listClient
     */
    public ArrayList<Client> getListClient() {
        return listClient;
    }

    /**
     * @param listClient the listClient to set
     */
    public void setListClient(ArrayList<Client> listClient) {
        this.listClient = listClient;
    }
    
    public void addEmployee(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nIngrese el nombre del empleado: ");
        String name = sc.nextLine();
        System.out.print("\nIngrese los apellidos del empleado : ");
        String lastName = sc.nextLine();
        System.out.print("\nIngrese identificacion del empleado: ");
        String identification = sc.nextLine();
        System.out.print("\nIngrese el e-mail del empleado: ");
        String e_mail = sc.nextLine();
        
        
        System.out.print("\nIngrese el cargo del empleado: ");
        String namePosition = sc.nextLine();
        System.out.print("\nIngrese el nivel jerarquico del cargo: ");
        int hierarchicalLevel = sc.nextInt();
        System.out.print("\nIngrese el salario del empleado: ");
        double salary = sc.nextDouble();
        Position position = new Position(namePosition, hierarchicalLevel);
                
                
        
        Employee nuevo = new Employee(name,  lastName,  identification,  e_mail,  salary,  position);
        
        this.listEmployee.add(nuevo);
        

    }
    
    public void addAdministrative(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nIngrese el nombre del administrativo: ");
        String name = sc.nextLine();
        System.out.print("\nIngrese los apellidos del administrativo : ");
        String lastName = sc.nextLine();
        System.out.print("\nIngrese identificacion del administrativo: ");
        String identification = sc.nextLine();
        System.out.print("\nIngrese el e-mail del administrativo: ");
        String e_mail = sc.nextLine();
        
        
        System.out.print("\nIngrese el cargo del administrativo: ");
        String namePosition = sc.nextLine();
        System.out.print("\nIngrese el nivel jerarquico del administrativo: ");
        int hierarchicalLevel = sc.nextInt();
        sc.nextLine();
        
        System.out.print("\nIngrese la categoria del administrativo: ");
        String  category = sc.nextLine();
        
        System.out.print("\nIngrese el salario del administrativo: ");
        double salary = sc.nextDouble();
        Position position = new Position(namePosition, hierarchicalLevel);
                
                
        
        Administrative nuevo = new Administrative(name,  lastName,  identification,  e_mail,  salary,  position, category);
        
        this.listAdministrative.add(nuevo);
    }
    
    
    
    public void addClient(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese el nombre del cliente: ");
        String name = sc.nextLine();
        System.out.print("\nIngrese los apellidos del cliente : ");
        String lastName = sc.nextLine();
        System.out.print("\nIngrese identificacion del cliente: ");
        String identification = sc.nextLine();
        System.out.print("\nIngrese el e-mail del cliente: ");
        String e_mail = sc.nextLine();
        System.out.print("\nIngrese la direccion del cliente: ");
        String address = sc.nextLine();
        System.out.print("\nIngrese el telefono del cliente: ");
        String phone = sc.nextLine();
     
        Client nuevo = new Client(name,  lastName,  identification,  e_mail,  address,  phone); 
        
        this.listClient.add(nuevo);
    }
    
    public void showEmployee(){
        System.out.println("\n=============================");
        System.out.println("\nInformacion Empleados: ");
        for(Employee employee : this.listEmployee ){
            System.out.println("*************************");
            employee.getInformationDescription();
            System.out.println("*************************");
        }
    }
    
    public void showAdministrative(){
        System.out.println("\nInformacion Administrativos: ");
        for(Administrative administrative : this.listAdministrative ){
            System.out.println("*************************");
            administrative.getInformationDescription();
            System.out.println("*************************");
        }
    }
    
    public void showClient(){
        System.out.println("\nInformacion clientes: ");
        for(Client client : this.listClient ){
            System.out.println("*************************");
            client.getInformationDescription();
            System.out.println("*************************");            
        }
        
        
        
    }
    
    public void modClient(String identification){
       Scanner sc = new Scanner(System.in);
             
       for(Client client : listClient){
        if(client.getIdentification().equals(identification)){
            System.out.println("\nIngrese el indice del dato a modificar: \n" +
                    "1-Nombres\n" + "2-Apellidos\n " + "3-Identificacion\n" + "4-E-mail\n" + "5-Direccion\n" + "6-Telefono");
            int mod = sc.nextInt();
            sc.nextLine();
            switch(mod){
                case 1:
                    System.out.print("\nIngrese los nombres correctos: ");
                    String nombreCorrecto = sc.nextLine();
                    //nombreCorrecto = sc.nextLine();
                    client.setName(nombreCorrecto);
                    break;
                case 2:
                    System.out.print("\nIngrese los apelllidos correctos: ");
                    String apellidoCorrecto = sc.nextLine();
                    client.setLastName(apellidoCorrecto);
                    break;
                case 3:
                    System.out.print("\nIngrese la identificacion correcta: ");
                    String identificacion = sc.nextLine();
                    client.setIdentification(identificacion);
                    break;
                case 4:
                    System.out.print("\nIngrese el e-mail correcto: ");
                    String mail = sc.nextLine();
                    client.setE_mail(mail);
                    break;
                case 5:
                    System.out.print("\nIngrese la direccion  correcta: ");
                    String direccion = sc.nextLine();
                    client.setAddress(direccion);
                    break;
                case 6:
                    System.out.print("\nIngrese el telefono correcto: ");
                    String telefono = sc.nextLine();
                    client.setPhone(telefono);
                    break;
            }
        }
       }
    }
    
    
    
    public void modEmployee(String identification){
       Scanner sc = new Scanner(System.in);
             
       for(Employee employee : listEmployee){
        if(employee.getIdentification().equals(identification)){
            System.out.println("\nIngrese el indice del dato a modificar: \n" +
                    "1-Nombres\n" + "2-Apellidos\n " + "3-Identificacion\n" + "4-E-mail\n" + "5-Salario\n" + "6-cargo");
            int mod = sc.nextInt();
            sc.nextLine();
            switch(mod){
                case 1:
                    System.out.print("\nIngrese los nombres correctos: ");
                    String nombreCorrecto = sc.nextLine();
                    //nombreCorrecto = sc.nextLine();
                    employee.setName(nombreCorrecto);
                    break;
                case 2:
                    System.out.print("\nIngrese los apelllidos correctos: ");
                    String apellidoCorrecto = sc.nextLine();
                    employee.setLastName(apellidoCorrecto);
                    break;
                case 3:
                    System.out.print("\nIngrese la identificacion correcta: ");
                    String identificacion = sc.nextLine();
                    employee.setIdentification(identificacion);
                    break;
                case 4:
                    System.out.print("\nIngrese el e-mail correcto: ");
                    String mail = sc.nextLine();
                    employee.setE_mail(mail);
                    break;
                case 5:
                    System.out.print("\nIngrese el salario correcta: ");
                    Double salary = sc.nextDouble();
                    employee.setSalary(salary);
                    break;
                case 6:
                    
                    System.out.print("\nIngrese el cargo correcto: ");
                    String namePosition = sc.nextLine();
                    System.out.print("\nIngrese el nivel de jerarquia correcto: ");
                    int jerarquia = sc.nextInt();
                    
                    Position position = new Position(namePosition, jerarquia);
                    employee.setPosition(position);
                    break;
            }
        }
       }
    }
    
    public void modAdministrative(String identification){
       Scanner sc = new Scanner(System.in);
             
       for(Administrative administrative : listAdministrative){
        if(administrative.getIdentification().equals(identification)){
            System.out.println("\nIngrese el indice del dato a modificar: \n" +
                    "1-Nombres\n" + "2-Apellidos\n " + "3-Identificacion\n" + "4-E-mail\n" + "5-Salario\n" + "6-Cargo\n" + "7-Añadir subordinado");
            int mod = sc.nextInt();
            sc.nextLine();
            switch(mod){
                case 1:
                    System.out.print("\nIngrese los nombres correctos: ");
                    String nombreCorrecto = sc.nextLine();
                    //nombreCorrecto = sc.nextLine();
                    administrative.setName(nombreCorrecto);
                    break;
                case 2:
                    System.out.print("\nIngrese los apelllidos correctos: ");
                    String apellidoCorrecto = sc.nextLine();
                    administrative.setLastName(apellidoCorrecto);
                    break;
                case 3:
                    System.out.print("\nIngrese la identificacion correcta: ");
                    String identificacion = sc.nextLine();
                    administrative.setIdentification(identificacion);
                    break;
                case 4:
                    System.out.print("\nIngrese el e-mail correcto: ");
                    String mail = sc.nextLine();
                    administrative.setE_mail(mail);
                    break;
                case 5:
                    System.out.print("\nIngrese el salario correcta: ");
                    Double salary = sc.nextDouble();
                    administrative.setSalary(salary);
                    break;
                case 6:
                    
                    System.out.print("\nIngrese el cargo correcto: ");
                    String namePosition = sc.nextLine();
                    System.out.print("\nIngrese el nivel de jerarquia correcto: ");
                    int jerarquia = sc.nextInt();
                    
                    Position position = new Position(namePosition, jerarquia);
                    administrative.setPosition(position);
                    break;
                    
                case 7:
                    System.out.print("Ingrese el doocumento de identidad del subordinado a añadir: ");
                    String id = sc.nextLine();
                    boolean flag = false;
                     for(Employee employee : listEmployee){
                         if(employee.getIdentification().equals(id)){
                                flag = true; 
                                administrative.addSubordinate(employee);
                                System.out.println("\nSubordinado " + employee.name + " añadido");

                        } 
                     }
                     if(!flag){
                         System.out.println("\nEl empleado no existe");
                     }
                    
                    break;
            }
        }
       }
    }
}
    
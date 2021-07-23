/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2company;

import Classes.Company;
import Classes.Employee;
import Classes.Person;
import Classes.Position;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mayko
 */
public class Reto2Company {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //Position positionCeo = new Position("Presidente", 1);
        //Employee ceo = new Employee("Maykol Andres", "Zambrano Montilla", "1004518052", "maykol9820@gmail.com", 5000000, positionCeo);
        ArrayList<Employee> initCompanyEmployee= new ArrayList();
        //initCompanyEmployee.add(ceo);
        
        Company empresa = new Company("Mundo Express", "112202551", "Calle 5 # 12 - 50", initCompanyEmployee);
        //empresa.addEmployee();
        //empresa.showEmployee();
        //empresa.modEmployee("87654321");
        //empresa.showEmployee();
        //empresa.addClient();
        
        //empresa.modClient("12345678");
        //empresa.showClient();
        boolean runSowfware = true;
        boolean firstTime = true;
        while(runSowfware){
            if(firstTime){
                firstTime = false;
            }
            else{
                System.out.println();
                System.out.println("Presione enter para continuar");
                new Scanner(System.in).nextLine();
            }
            
            
            System.out.println("==================== MENU EMPRESA ====================");
            System.out.println("Seleccione la opcion deseada: \n 1-Añadir Empleado \n 2-Mostrar Informacion Empleados \n 3-Modificar Informacion Empleados" +
                    "\n 4-Añadir Administrativo \n 5- Mostrar Informacion Administrativos \n 6- Modificar Informacion Administrativos" +
                    "\n 7-Añadir Cliente \n 8- Mostrar Informacion Clientes \n 9- Modificar Informacion Cliente \n 10-Salir");
            System.out.print("(#)");
            String identification = null;
            int option = sc.nextInt();
            switch(option){
                case 1:
                    empresa.addEmployee();
                break;
                case 2:
                    empresa.showEmployee();
                break;
                case 3:
                    System.out.print("Ingrese la identificacion del empleado a modificar informacion: ");
                    identification = sc.nextLine();
                    identification = sc.nextLine();
                    empresa.modEmployee(identification);
                break;
                case 4:
                    empresa.addAdministrative();
                break;
                case 5:
                    empresa.showAdministrative();
                break;
                case 6:
                    System.out.print("Ingrese la identificacion del administrativo a modificar informacion: ");
                    identification = sc.nextLine();
                    identification = sc.nextLine();
                    empresa.modAdministrative(identification);
                break;
                case 7:
                    empresa.addClient();
                break;
                case 8:
                    empresa.addClient();
                break;
                case 9: 
                    System.out.print("Ingrese la identificacion del cliente a modificar informacion: ");
                    identification = sc.nextLine();
                    empresa.modClient(identification);
                break;
                
                case 10:
                    runSowfware = false;
                break;
                
                    
            }
            
            
        }
        
        
        
    }
    
}

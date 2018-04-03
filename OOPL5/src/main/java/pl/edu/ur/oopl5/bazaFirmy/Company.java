/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5.bazaFirmy;

import java.util.Scanner;

/**
 *
 * @author Przemysław Paliński
 */
public class Company {
    private Worker[] workerTab = new Worker[100];

    public Company() {
        for (int i = 0; i < this.workerTab.length; i++) {
            this.workerTab[i] = new Worker("", "", 0, "");
        }
    }
    
    public void setWorkerOnIndex(int index){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String name = input.nextLine();
        System.out.println("Podaj nazwisko: ");
        String surname = input.nextLine();
        System.out.println("Podaj pozycje: ");
        String position = input.nextLine();
        System.out.println("Podaj wiek: ");
        int age = input.nextInt();
        this.workerTab[index] = new Worker(name, surname, age, position);
    }
    
    public void writeWorkers(){
        for (int i = 0; i < workerTab.length; i++) {
            System.out.println("-----------------------------");
            System.out.println(workerTab[i].toString());           
        }
        System.out.println("-----------------------------");
    }
    
}

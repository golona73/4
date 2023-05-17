/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    int menu;
    System.out.println("1 - Dodawanie nowego studenta"+ "\n" +"2 - Wyświetlanie listy sudentów");
    menu = sc.nextInt();
    
      switch(menu)  {  
        case 1:

          System.out.println("Podaj Imię: ");
          String name= sc.next();
          System.out.println("Podaj Nazwisko: ");
          String lastname= sc.next();
          System.out.println("Podaj wiek: ");
          int age= sc.nextInt();
    
    try{
      Service s = new Service();
      s.addStudent(new Student(name, lastname, age));
       
     
      } catch (IOException e) {

    }
          break;
        case 2:
          try{
            Service s = new Service();
            var students= s.getStudents();
            for (Student current : students){
              System.out.println(current.ToString());
            }
          }catch (IOException e) {
      }
          break;
      }
      
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
 
class Employee
{
String Name="Sripathi Hema";
int age=21;
String city="Bhubaneswar";
public void display()
{
System.out.println("The name is "+Name);
System.out.println("The age is "+age);
System.out.println("The city is "+city);
}
}
public class Assgn1 
{
    public static void main(String args[])
    {
    Employee e1=new Employee();
    Employee e2=new Employee();
    e1.display();
    e2.display();
    }
}

package Proyectos.POJO;
public  class  Main { 
    public  static  void  main (String[] args) { 

        // Un objeto de Employee se llama POJO 

        Employee  employee1  =  new  Employee (); 
        employee1.setId( 101 ); 
        employee1.name = "John" ; 
        employee1.salary = 1000.0 ; 

        Employee  employee2  =  new  Employee ( 102 ); 
        employee2.name = "Smith" ; 
        employee2.salary = 2000.0 ; 

        Employee  employee3  =  new  Employee (); 
        employee3.setId( 103 ); 
        employee3.name = "Peter" ; 
        employee3.salary = 3000.0 ; 

        Employee[] employees = new  Employee [] { employee1, employee2, employee3 }; 

    } 
}
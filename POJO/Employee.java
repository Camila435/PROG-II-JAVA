package POJO;
public  class  Employee { 
    private  int id; 
    public String name; 
    protected  double salary; 

    public  Employee () { 
        System.out.println( "Constructor sin argumentos" ); 
    } 

    public  Employee ( int id) { 
        this .id = id; 
    } 

    public  void  setId ( int id) { 
        this .id = id; 
    } 

    public  int  getId () { 
        return id; 
    } 
}

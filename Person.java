abstract sealed class Person permits Student, Employee{
    
    private String name;
    private String email;

    public Person(String namen, String email){
        this.name = namen;
        this.email = email;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}

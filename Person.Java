class Person{
    private String first;
    private String last;

    // Default constructor with default values for first and last names
    public Person(){
        first = "noFirst";
        last = "noLast";
    }

    // Constructor with parameters to set first and last names
    public Person(String first, String last){
        this.first = first;
        this.last = last;
    }

    // Method to set name
    public void setName(String first, String last){
        this.first = first;
        this.last = last;

    }

    // Method to get the full name
    public String getName(){
        return first+" "+last;
    }

    // Method to print the full name
    public void printName(){
        System.out.println(getName());
    }

    // toString method to provide string representation of Person object
    @Override
    public String toString() {
        return getName();
    }
}
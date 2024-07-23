class Doctor extends Person{

    private String specialty;

    // Default constructor with default values for first, last names, and specialty
    public Doctor(){
        super(); // Calls the default constructor of Person class
        specialty = "noSpecialty";

    }

    // Constructor with parameters to set first, last names, and specialty
    public Doctor(String first, String last, String specialty){
        super(first, last); // Calls the constructor of Person class with parameters
        this.specialty= specialty;

    }

    // Method to set specialty
    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }

    // Method to get specialty
    public String getSpecialty(){
        return specialty;
    }

    // Method to print doctor's name and specialty
    public void printInfo(){
        super.printName(); // Calls the printName method of Person class to print name
        System.out.println(specialty);
    }

    // toString method to provide string representation
    @Override
    public String toString() {
        return super.toString() + ", Specialty: " + specialty;
    }

}
class Patient extends Person{
    // Private data members
    private int ID;
    private Date dateAdmitted;
    private Date dateDischarged;
    private Date DOB;
    private Doctor physician;

    // Constructor with parameters to initialize patient data
    Patient(String first, String last, int ID, Date dateAdmitted, Date dateDischarged, Date DOB, Doctor physician){
        super(first,last);
        this.ID = ID;
        this.dateAdmitted = dateAdmitted;
        this.dateDischarged=dateDischarged;
        this.DOB = DOB;
        this.physician = physician;
    }

    // Getters and setters for data members
    public void setID(int ID){
        this.ID = ID;
    }

    public int getID(){
        return ID;
    }

    public void setDateAdmitted(Date dateAdmitted){
        this.dateAdmitted=dateAdmitted;
    }

    public Date getDateAdmitted(){
        return dateAdmitted;
    }

    public void setDateDischarged(Date dateDischarged){
        this.dateDischarged=dateDischarged;
    }

    public Date getDateDischarged(){
        return dateDischarged;
    }

    public void setDOB(Date DOB){
        this.DOB=DOB;
    }

    public Date getDOB(){
        return DOB;
    }

    public void setPhysician(Doctor physician){
        this.physician=physician;
    }

    public Doctor getPhysician(){
        return physician;
    }




    // toString method to provide string representation
    @Override
    public String toString() {
        return  "Patient: "+super.getName()+"\n"+
                "ID: " + ID +"\n"+
                "Date Of Birth: " + DOB +"\n"+
                "Attending Physician: " + physician +"\n"+
                "Date Admitted: " + dateAdmitted +"\n"+
                "Date Discharged: " + dateDischarged +"\n"
                ;
    }

}
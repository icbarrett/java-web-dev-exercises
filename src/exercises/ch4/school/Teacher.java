package exercises.ch4.school;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    // getter and setter
    public String getFirstName9() { return this.firstName; };

    private void setFirstName(String aFirstName) {
        firstName = aFirstName; }

    public String getLastName() { return this.lastName; }

    public void setLastName(String aLastName) {
        lastName = aLastName; }

    public String getSubject() { return this.subject; }

    public void setSubject(String aSubject) {
        subject = aSubject; }

    public int getYearsTeaching() {return this.yearsTeaching; }

    private void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}

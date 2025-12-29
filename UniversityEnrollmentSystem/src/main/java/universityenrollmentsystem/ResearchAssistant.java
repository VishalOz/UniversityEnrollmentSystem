package universityenrollmentsystem;

public class ResearchAssistant extends Person{
    String projectTitle;
    int hoursPerWeek;
    String supervisorName;

    public ResearchAssistant (String name, String surname) {
        super(name, surname);
        this.name = name;
        this.surname = surname;
    }

    public String getProjectTitle() {
        return projectTitle;
    }
    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }


    public int hoursPerWeek() {
        return hoursPerWeek;
    }
    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }


    public String supervisorName() {
        return supervisorName;
    }
    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public String toString() {
        return  super.toString() + "ResearchAssistant| "+ "Project tittle: "+ projectTitle+ ", Hours Per Week: "+
                hoursPerWeek+ ", Supervisor Name: "+ supervisorName;
    }
}

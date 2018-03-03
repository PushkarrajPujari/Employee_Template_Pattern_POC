package Office;

/**
 * @author Pushkarraj
 * @since 03-03-2018.
 */
public class Employee {
    public final void startDay(){
        System.out.println("Starting "+this.getClass().getName()+ " Day");
        reachOffice();
        toDoList();
        meeting();
        doWork();
        leaveOffice();
        System.out.println("Ending "+this.getClass().getName()+ " Day");
    }
    protected void reachOffice(){
        System.out.println(this.getClass().getName()+ "Reached Office");
        System.out.println("Logging Check-In Time");
    }
    protected void toDoList(){
        System.out.println("Nothing to do");
    }
    protected void meeting(){
        System.out.println("No meetings scheduled");
    }
    protected void doWork(){
        System.out.println("No Work Assigned");
    }

    protected void leaveOffice(){
        System.out.println("Logging Check-Out Time");
        System.out.println(this.getClass().getName()+ "Left Office for the Day");
    }

}


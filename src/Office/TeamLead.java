package Office;

import Office.Employee;

/**
 * @author Pushkarraj
 * @author 03-03-2018.
 */
public class TeamLead extends Employee {
    protected void toDoList(){
        System.out.println("Office.TeamLead has 25 things on this todo list");
    }

    protected void doWork(){
        System.out.println("Office.TeamLead is leading the team");
    }
}

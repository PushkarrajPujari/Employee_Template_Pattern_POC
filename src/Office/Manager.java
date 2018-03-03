package Office;

import Office.Employee;

/**
 * @author Pushkarraj
 * @since 03-03-2018.
 */
public class Manager extends Employee {
    protected void toDoList(){
        System.out.println("Office.Manager has 10 things on this todo list");
    }

    protected void meeting(){
        System.out.println("Office.Manager has 1 meeting scheduled after lunch");
    }

    protected void doWork(){
        System.out.println("Office.Manager is managing stuff");
    }

}

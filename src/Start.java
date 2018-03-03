import Office.Manager;
import Office.TeamLead;

/**
 * @author Pushkarraj
 * @since 03-03-2018.
 */
public class Start {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.startDay();
        TeamLead teamLead = new TeamLead();
        teamLead.startDay();
    }
}

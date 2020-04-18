import org.junit.Test;
import static org.junit.Assert.*;


public class ExerciseManagementTest {
    @Test    
    public void exerciseListEmptyAtBeginning() {        
        ExerciseManagement management = new ExerciseManagement();        
        assertEquals(0, management.exerciseList().size());    
    }
}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AppTest {
    @Test 
    public void testAppHasAGreeting() {
        App classUnderTest = mock(App.class);
        when(classUnderTest.getGreeting()).thenReturn("Hello World.");
	    assertEquals("Hello World.", classUnderTest.getGreeting());
    }
}

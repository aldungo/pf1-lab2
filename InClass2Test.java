import java.io.*;

/**
 * Test cases for inclass2.java - Force calculation program
 * Tests various scenarios for Newton's second law (F = ma)
 * This is a simple testing framework that doesn't require external dependencies
 */
public class InClass2Test {
    
    private static int testsRun = 0;
    private static int testsPassed = 0;
    
    public static void main(String[] args) {
        InClass2Test tester = new InClass2Test();
        
        System.out.println("Running InClass2 Test Suite...\n");
        
        tester.testBasicPositiveValues();
        tester.testDecimalValues();
        tester.testZeroAcceleration();
        tester.testZeroMass();
        tester.testLargeValues();
        tester.testSmallDecimalValues();
        tester.testNegativeAcceleration();
        tester.testPromptMessages();
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Test Results: " + testsPassed + "/" + testsRun + " tests passed");
        
        if (testsPassed == testsRun) {
            System.out.println("🎉 All tests passed!");
        } else {
            System.out.println("❌ Some tests failed. Check the output above.");
        }
    }
    
    private void runTest(String testName, Runnable test) {
        testsRun++;
        try {
            test.run();
            testsPassed++;
            System.out.println("✅ " + testName + " - PASSED");
        } catch (AssertionError e) {
            System.out.println("❌ " + testName + " - FAILED: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ " + testName + " - ERROR: " + e.getMessage());
        }
    }
    
    private void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
    
    private String runProgramWithInput(String input) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        
        try {
            System.setOut(new PrintStream(outputStream));
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            
            inclass2.main(new String[]{});
            
            return outputStream.toString();
        } finally {
            System.setOut(originalOut);
            System.setIn(originalIn);
        }
    }
    
    /**
     * Test case 1: Basic positive values
     * Mass: 10 kg, Acceleration: 5 m/s²
     * Expected Force: 50 N
     */
    private void testBasicPositiveValues() {
        runTest("Basic Positive Values", () -> {
            String input = "10\n5\n";
            String output = runProgramWithInput(input);
            
            assertTrue(output.contains("Please enter the mass of the object (kg):"), 
                      "Missing mass prompt");
            assertTrue(output.contains("Please enter the acceleration of the object (m/s^2):"), 
                      "Missing acceleration prompt");
            assertTrue(output.contains("The force applied to the object is 50.0 N."), 
                      "Incorrect force calculation for 10kg * 5m/s²");
        });
    }
    
    /**
     * Test case 2: Decimal values
     * Mass: 2.5 kg, Acceleration: 4.2 m/s²
     * Expected Force: 10.5 N
     */
    private void testDecimalValues() {
        runTest("Decimal Values", () -> {
            String input = "2.5\n4.2\n";
            String output = runProgramWithInput(input);
            
            assertTrue(output.contains("The force applied to the object is 10.5 N."), 
                      "Incorrect force calculation for 2.5kg * 4.2m/s²");
        });
    }
    
    /**
     * Test case 3: Zero acceleration
     * Mass: 5 kg, Acceleration: 0 m/s²
     * Expected Force: 0 N
     */
    private void testZeroAcceleration() {
        runTest("Zero Acceleration", () -> {
            String input = "5\n0\n";
            String output = runProgramWithInput(input);
            
            assertTrue(output.contains("The force applied to the object is 0.0 N."), 
                      "Incorrect force calculation for 5kg * 0m/s²");
        });
    }
    
    /**
     * Test case 4: Zero mass
     * Mass: 0 kg, Acceleration: 10 m/s²
     * Expected Force: 0 N
     */
    private void testZeroMass() {
        runTest("Zero Mass", () -> {
            String input = "0\n10\n";
            String output = runProgramWithInput(input);
            
            assertTrue(output.contains("The force applied to the object is 0.0 N."), 
                      "Incorrect force calculation for 0kg * 10m/s²");
        });
    }
    
    /**
     * Test case 5: Large values
     * Mass: 1000 kg, Acceleration: 9.8 m/s²
     * Expected Force: 9800 N
     */
    private void testLargeValues() {
        runTest("Large Values", () -> {
            String input = "1000\n9.8\n";
            String output = runProgramWithInput(input);
            
            assertTrue(output.contains("The force applied to the object is 9800.0 N."), 
                      "Incorrect force calculation for 1000kg * 9.8m/s²");
        });
    }
    
    /**
     * Test case 6: Small decimal values
     * Mass: 0.1 kg, Acceleration: 0.5 m/s²
     * Expected Force: 0.05 N
     */
    private void testSmallDecimalValues() {
        runTest("Small Decimal Values", () -> {
            String input = "0.1\n0.5\n";
            String output = runProgramWithInput(input);
            
            assertTrue(output.contains("The force applied to the object is 0.05 N."), 
                      "Incorrect force calculation for 0.1kg * 0.5m/s²");
        });
    }
    
    /**
     * Test case 7: Negative acceleration (deceleration)
     * Mass: 5 kg, Acceleration: -2 m/s²
     * Expected Force: -10 N
     */
    private void testNegativeAcceleration() {
        runTest("Negative Acceleration", () -> {
            String input = "5\n-2\n";
            String output = runProgramWithInput(input);
            
            assertTrue(output.contains("The force applied to the object is -10.0 N."), 
                      "Incorrect force calculation for 5kg * -2m/s²");
        });
    }
    
    /**
     * Test case 8: Verify prompt messages are correct
     */
    private void testPromptMessages() {
        runTest("Prompt Messages", () -> {
            String input = "1\n1\n";
            String output = runProgramWithInput(input);
            
            assertTrue(output.contains("Please enter the mass of the object (kg):"), 
                      "Missing or incorrect mass prompt");
            assertTrue(output.contains("Please enter the acceleration of the object (m/s^2):"), 
                      "Missing or incorrect acceleration prompt");
            assertTrue(output.contains("The force applied to the object is"), 
                      "Missing force output statement");
            assertTrue(output.contains(" N."), 
                      "Missing units in output");
        });
    }
}

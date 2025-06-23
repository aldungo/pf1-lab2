# Testing Guide for inclass2.java

## Overview
This guide provides comprehensive information about testing the `inclass2.java` program, which implements Newton's second law of motion (F = ma) calculator.

## Testing Approaches

### 1. Simple Java Testing Framework (InClass2Test.java)
This is a self-contained Java testing framework that doesn't require external dependencies.

#### Features:
- **No external dependencies** - Uses only standard Java libraries
- **Comprehensive test coverage** - Tests various scenarios including edge cases
- **Clear output** - Shows pass/fail status with detailed error messages
- **Easy to run** - Can be executed with standard Java commands

#### Test Cases Included:
1. **Basic Positive Values**: Tests with simple positive integers (10kg, 5m/s²)
2. **Decimal Values**: Tests with decimal inputs (2.5kg, 4.2m/s²)
3. **Zero Acceleration**: Tests edge case where acceleration is 0
4. **Zero Mass**: Tests edge case where mass is 0
5. **Large Values**: Tests with large numbers (1000kg, 9.8m/s²)
6. **Small Decimal Values**: Tests with very small decimal numbers
7. **Negative Acceleration**: Tests deceleration scenarios (-2m/s²)
8. **Prompt Messages**: Verifies correct user prompts and output format

### 2. Running the Tests

#### Method 1: Using the Test Runner Script
```bash
./run_tests.sh
```

#### Method 2: Manual Compilation and Execution
```bash
# Compile both files
javac inclass2.java
javac InClass2Test.java

# Run the test suite
java InClass2Test

# Clean up
rm *.class
```

#### Method 3: Individual Test Verification
You can also test manually by running the main program:
```bash
javac inclass2.java
java inclass2
```
Then enter test values like:
- Mass: 10, Acceleration: 5 → Expected: 50.0 N
- Mass: 2.5, Acceleration: 4.2 → Expected: 10.5 N

## Test Coverage Analysis

### Physics Correctness
- ✅ Basic multiplication (F = m × a)
- ✅ Decimal precision handling
- ✅ Zero values (0 × n = 0, n × 0 = 0)
- ✅ Negative values (force direction)
- ✅ Large number handling

### Input/Output Testing
- ✅ Correct prompt messages
- ✅ Input reading functionality
- ✅ Output formatting
- ✅ Units display (N for Newtons)

### Edge Cases
- ✅ Zero mass
- ✅ Zero acceleration
- ✅ Negative acceleration
- ✅ Very small numbers
- ✅ Very large numbers

## Adding More Tests

To add additional test cases to `InClass2Test.java`:

1. Create a new test method following the pattern:
```java
private void testYourTestCase() {
    runTest("Your Test Case Name", () -> {
        String input = "mass_value\nacceleration_value\n";
        String output = runProgramWithInput(input);
        
        assertTrue(output.contains("expected_output"), 
                  "Error message if test fails");
    });
}
```

2. Add the method call to the `main` method:
```java
tester.testYourTestCase();
```

## Using JUnit (Optional Advanced Setup)

If you want to use JUnit for more advanced testing features:

1. **Download JUnit JAR files**:
   - junit-platform-console-standalone-1.9.3.jar (or latest version)

2. **Compile with JUnit**:
```bash
javac -cp junit-platform-console-standalone-1.9.3.jar:. *.java
```

3. **Run with JUnit**:
```bash
java -cp junit-platform-console-standalone-1.9.3.jar:. org.junit.platform.console.ConsoleLauncher --class-path . --scan-class-path
```

## Continuous Integration

For automated testing in CI/CD pipelines, you can create a simple GitHub Actions workflow:

```yaml
name: Java Tests
on: [push, pull_request]
jobs:
  test:
    runs-on: ubuntu-latest
    steps:
    - uses: actions/checkout@v2
    - name: Set up JDK 11
      uses: actions/setup-java@v2
      with:
        java-version: '11'
        distribution: 'adopt'
    - name: Run tests
      run: ./run_tests.sh
```

## Troubleshooting

### Common Issues:

1. **Compilation Error**: Make sure both `inclass2.java` and `InClass2Test.java` are in the same directory
2. **Class Not Found**: Ensure proper compilation order (main class first, then test class)
3. **Test Failures**: Check that the expected output format matches exactly what the program produces

### Expected Output Format:
The program should output exactly:
```
Please enter the mass of the object (kg): 
Please enter the acceleration of the object (m/s^2): 
The force applied to the object is [calculated_value] N.
```

## Best Practices

1. **Test Early and Often**: Run tests after each code change
2. **Cover Edge Cases**: Always test boundary conditions
3. **Verify Calculations**: Double-check physics calculations manually
4. **Check Output Format**: Ensure exact string matching for prompts
5. **Document Test Cases**: Explain what each test validates

## Performance Considerations

The current tests are lightweight and should run quickly. For larger test suites:
- Consider parallel test execution
- Add performance benchmarks
- Monitor memory usage during testing

---

*This testing framework provides a solid foundation for validating the inclass2.java program. The tests are designed to catch common programming errors while ensuring the physics calculations are correct.*

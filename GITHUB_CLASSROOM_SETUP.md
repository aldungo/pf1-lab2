# GitHub Classroom Autograding Setup Guide

## Overview
This repository contains a complete autograding solution for the `inclass2.java` physics calculator assignment using GitHub Classroom. The autograding system provides automated testing, detailed feedback, and point allocation for student submissions.

## Files Structure

```
.github/
├── classroom/
│   └── autograding.json          # Autograding test configuration
└── workflows/
    └── classroom.yml             # GitHub Actions workflow

# Test files (included in repository)
InClass2Test.java                 # Comprehensive test suite
run_tests.sh                      # Test runner script
TESTING_GUIDE.md                  # Detailed testing documentation
TESTING_SUMMARY.md                # Executive summary
```

## Autograding Configuration

### Point Distribution (Total: 100 points)

| Category | Points | Description |
|----------|--------|-------------|
| **Compilation** | 15 | Code compiles without errors |
| **Basic Calculations** | 40 | Correct F=ma implementation |
| **Edge Cases** | 30 | Handles zero and negative values |
| **Format & Prompts** | 10 | Correct user interface |
| **Comprehensive Testing** | 5 | All advanced tests pass |

### Test Cases

1. **Compilation Test (10 pts)** - Verifies `inclass2.java` compiles
2. **Test Compilation (5 pts)** - Verifies test suite compiles
3. **Basic Positive Values (10 pts)** - Tests `10kg × 5m/s² = 50N`
4. **Decimal Values (10 pts)** - Tests `2.5kg × 4.2m/s² = 10.5N`
5. **Zero Acceleration (10 pts)** - Tests `5kg × 0m/s² = 0N`
6. **Zero Mass (10 pts)** - Tests `0kg × 10m/s² = 0N`
7. **Large Values (10 pts)** - Tests `1000kg × 9.8m/s² = 9800N`
8. **Small Decimals (10 pts)** - Tests `0.1kg × 0.5m/s² = 0.05N`
9. **Negative Acceleration (10 pts)** - Tests `5kg × -2m/s² = -10N`
10. **Prompt Messages (5 pts)** - Verifies mass prompt
11. **Output Format (5 pts)** - Verifies acceleration prompt
12. **Comprehensive Suite (5 pts)** - All tests in test suite pass

## GitHub Classroom Setup Instructions

### Step 1: Create Assignment Repository Template

1. **Upload all files** to your template repository:
   ```
   inclass2.java (student starter code)
   InClass2Test.java
   run_tests.sh
   .github/classroom/autograding.json
   .github/workflows/classroom.yml
   README.md
   TESTING_GUIDE.md
   ```

2. **Ensure file permissions** - The `run_tests.sh` should be executable

### Step 2: Configure GitHub Classroom Assignment

1. **Go to GitHub Classroom** (classroom.github.com)
2. **Create New Assignment**
3. **Select your template repository**
4. **Enable Autograding**:
   - ✅ Enable feedback pull requests
   - ✅ Enable autograding
   - ✅ Import from .github/classroom/autograding.json

### Step 3: Student Workflow

When students accept the assignment:

1. **Repository is created** from your template
2. **Student completes** the `inclass2.java` code
3. **Push to GitHub** triggers autograding
4. **Results are displayed** in GitHub Actions tab
5. **Points are calculated** automatically
6. **Feedback is provided** through GitHub interface

## Features

### ✅ **Automatic Grading**
- Runs on every push/pull request
- Provides immediate feedback
- Calculates total score automatically

### ✅ **Comprehensive Testing**
- 12 different test cases
- Physics calculation validation
- Input/output format checking
- Edge case handling

### ✅ **Detailed Feedback**
- Individual test results
- Error messages for failed tests
- Step-by-step execution logs
- Summary report generation

### ✅ **Professional Setup**
- Uses GitHub Actions
- Follows education best practices
- Scalable for large classes
- Consistent grading criteria

## Student Instructions

### Assignment Requirements
Students need to complete the `inclass2.java` file to:

1. **Read user input** for mass and acceleration
2. **Calculate force** using F = ma
3. **Display result** with proper formatting
4. **Handle all data types** (integers, decimals, zero, negative)

### Expected Output Format
```
Please enter the mass of the object (kg): [user input]
Please enter the acceleration of the object (m/s^2): [user input]
The force applied to the object is [calculated force] N.
```

### Testing Locally
Students can test their code locally using:
```bash
# Compile and run program
javac inclass2.java
java inclass2

# Run comprehensive test suite
./run_tests.sh
```

## Instructor Benefits

### 🎯 **Immediate Assessment**
- No manual grading required
- Consistent evaluation criteria
- Instant feedback for students

### 📊 **Analytics**
- Track assignment completion
- Identify common issues
- Monitor student progress

### 🔧 **Easy Maintenance**
- Modify test cases as needed
- Update point distribution
- Add new requirements

## Troubleshooting

### Common Issues:

1. **Tests not running**: Check file permissions on `run_tests.sh`
2. **Compilation errors**: Verify Java syntax in template
3. **Wrong output format**: Check exact string matching in tests
4. **Timeout errors**: Increase timeout values in autograding.json

### Debug Steps:
1. Check GitHub Actions logs
2. Review autograding.json syntax
3. Test locally with provided scripts
4. Verify file paths and names

## Customization

### Adding New Tests:
1. **Edit autograding.json** - Add new test object
2. **Update point values** - Adjust scoring as needed
3. **Modify InClass2Test.java** - Add corresponding test method

### Changing Point Distribution:
- Edit the "points" field in each test
- Update documentation to match
- Total should equal desired maximum score

---

This autograding solution provides a complete, professional-grade assessment system for your physics calculator assignment, ensuring consistent grading while providing valuable learning feedback to students.

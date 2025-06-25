# 🔒 Student-Safe Setup Guide for GitHub Classroom

## The Problem: How to Hide Tests from Students

When you create a GitHub Classroom assignment, you need to give students the starter code but **hide your test files** so they can't cheat by looking at expected outputs.

## The Solution: Two-Repository Strategy

### Repository Structure Overview

```
📁 Your Full Template Repository (PRIVATE - Students Never See This)
├── inclass2.java                     ← Complete working solution
├── InClass2Test.java                 ← Your secret test suite  
├── run_tests.sh                      ← Testing scripts
├── .github/classroom/autograding.json ← Autograding config
├── .github/workflows/classroom.yml   ← GitHub Actions
└── All documentation files

📁 Student Repository (AUTO-CREATED - What Students Get)
├── inclass2_student_version.java     ← Renamed to inclass2.java
├── README.md                         ← Assignment instructions only
└── [No test files - they can't cheat!]
```

## Step-by-Step Setup Process

### Step 1: Prepare Your Template Repository

1. **Create your full template** with all files (as you have now)
2. **Test everything** to ensure it works perfectly
3. **Create the student starter version** (see `inclass2_student_version.java`)

### Step 2: Configure GitHub Classroom Assignment

1. **Go to classroom.github.com**
2. **Create New Assignment**
3. **Select your template repository**
4. **Important:** In "Advanced Settings":
   - ✅ Enable autograding
   - ✅ Import from `.github/classroom/autograding.json`
   - ✅ **Add excluded files** (this is key!):
     ```
     InClass2Test.java
     run_tests.sh
     .github/
     TESTING_*.md
     GITHUB_CLASSROOM_SETUP.md
     create_classroom_package.sh
     pom.xml
     ```

### Step 3: Replace Complete Solution with Starter Code

Before creating the assignment, you need to replace the working `inclass2.java` with the student version:

1. **Rename** `inclass2.java` to `inclass2_SOLUTION.java` (keep the working version)
2. **Rename** `inclass2_student_version.java` to `inclass2.java`
3. **Commit and push** these changes
4. **Now create the GitHub Classroom assignment**

## What Happens When Students Accept the Assignment

### 1. Repository Creation
- GitHub Classroom **clones your template**
- **Excludes** the files you specified
- **Creates** a private repository for each student
- **Adds** the student to their repository

### 2. Student Repository Contents
Students only see:
```
inclass2.java          ← Starter code with TODOs
README.md              ← Assignment instructions  
```

### 3. Hidden Test Execution
- When students push code, **GitHub Actions runs**
- Tests execute using your **original template** (with all test files)
- Students see **results** but never see **test code**
- Example student view:
  ```
  ✅ Compilation Test (10/10 points)
  ❌ Basic Calculation (0/10 points) - Expected output not found
  ✅ Input Prompts (5/5 points)
  ```

## Security Features Explained

### 🛡️ What Students CANNOT See:
- ❌ Your test files (`InClass2Test.java`)
- ❌ Expected output values
- ❌ Test input combinations  
- ❌ Grading criteria details
- ❌ Other students' solutions
- ❌ Your complete working solution

### ✅ What Students CAN See:
- ✅ Their own starter code
- ✅ Assignment instructions
- ✅ Test results (pass/fail only)
- ✅ Basic feedback ("Expected output not found")
- ✅ Their own commit history
- ✅ GitHub Actions run status

### 🔍 How Tests Stay Hidden:
1. **Server-side execution**: Tests run on GitHub's servers, not student machines
2. **Template isolation**: Students never access your template repository
3. **File exclusion**: Specified files are never copied to student repos
4. **Private repositories**: Each student's work is isolated
5. **Instructor access**: You can see all student repositories

## Example: What Student Sees vs. Reality

### Student's View (Their Repository):
```java
// This is all they see in inclass2.java
public class inclass2 {
    public static void main(String[] args) {
        // TODO: Complete this program
        // Calculate force using F = ma
    }
}
```

### Reality (Your Template - Hidden from Students):
```java
// Your actual test in InClass2Test.java (they never see this)
private void testBasicCalculation() {
    String input = "10\n5\n";
    String output = runProgramWithInput(input);
    assertTrue(output.contains("The force applied to the object is 50.0 N."));
}
```

### Student Sees Test Results:
```
❌ Basic Calculation Test - FAILED (0/10 points)
Expected output format not found. Check your calculation and output format.
```

## Quick Setup Checklist

- [ ] 1. Create template repository with all files
- [ ] 2. Replace `inclass2.java` with student starter version
- [ ] 3. Test the autograding locally
- [ ] 4. Create GitHub Classroom assignment
- [ ] 5. Configure file exclusions in advanced settings
- [ ] 6. Test by accepting the assignment yourself
- [ ] 7. Verify students only see intended files
- [ ] 8. Deploy to students

## Troubleshooting

### "Students can see test files"
- Check your exclusion patterns in GitHub Classroom settings
- Verify you're using the correct template repository
- Ensure files are properly excluded before assignment creation

### "Tests not running"
- Verify `.github/` folder exists in your template
- Check `autograding.json` syntax
- Ensure GitHub Actions is enabled for your organization

### "Students getting wrong starter code"
- Make sure you replaced the complete solution with starter code
- Check file names match exactly (`inclass2.java`)
- Verify student version compiles without errors

---

This setup ensures **complete test security** while providing students with clear requirements and immediate feedback. They get the learning benefits without being able to reverse-engineer your test cases!

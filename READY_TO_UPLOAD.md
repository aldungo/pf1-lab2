# 🎓 GitHub Classroom Assignment - Ready to Upload!

## 🔒 IMPORTANT: Test Security Notice

**Your test files are protected!** Students will **NOT** be able to see:
- `InClass2Test.java` (your test suite)
- Expected output values  
- Grading criteria
- Any files you exclude in GitHub Classroom settings

**Students only get:**
- Starter code (`inclass2_student_version.java` → renamed to `inclass2.java`)
- Assignment instructions (`README.md`)
- Test results feedback (pass/fail only)

📖 **See `STUDENT_SAFE_SETUP.md` for complete security setup instructions.**

---

## Quick Start Guide

You now have a **complete GitHub Classroom autograding assignment** ready to use! Here's everything you need:

### 📁 What You Have

1. **Complete Assignment Files** - All source code, tests, and documentation
2. **Autograding Configuration** - `.github/classroom/autograding.json` (12 test cases, 100 points)
3. **GitHub Actions Workflow** - `.github/workflows/classroom.yml` for automated testing
4. **Comprehensive Documentation** - Setup guides and testing instructions
5. **Ready-to-Use ZIP** - `github_classroom_assignment.zip` for easy upload

## 🚀 Upload to GitHub Classroom (3 Steps)

### Step 1: Create Template Repository
1. Go to GitHub.com and create a **new repository**
2. Upload `github_classroom_assignment.zip` and extract, OR
3. Upload individual files maintaining the folder structure:
   ```
   /
   ├── inclass2.java
   ├── InClass2Test.java
   ├── run_tests.sh
   ├── README.md
   ├── .github/
   │   ├── classroom/autograding.json
   │   └── workflows/classroom.yml
   └── [documentation files]
   ```

### Step 2: Set Up GitHub Classroom Assignment
1. Go to **classroom.github.com**
2. Create **New Assignment**
3. Select your template repository
4. **Enable Autograding** ✅
5. **Import from .github/classroom/autograding.json** ✅

### Step 3: Test & Deploy
1. **Test the assignment** by accepting it yourself
2. **Verify autograding** runs correctly
3. **Share assignment link** with students

## 📊 Grading Breakdown (100 Points Total)

| Test Category | Points | What It Tests |
|---------------|--------|---------------|
| **Compilation** | 15 | Code compiles without errors |
| **Basic Math** | 20 | Simple F=ma calculations |
| **Decimals** | 20 | Precision with decimal numbers |
| **Edge Cases** | 20 | Zero values, negative numbers |
| **Large/Small Numbers** | 20 | Extreme value handling |
| **User Interface** | 5 | Correct prompts and formatting |

## 🧪 Test Cases Overview

### Physics Calculations Tested:
- ✅ `10 kg × 5 m/s² = 50 N` (Basic)
- ✅ `2.5 kg × 4.2 m/s² = 10.5 N` (Decimals)
- ✅ `5 kg × 0 m/s² = 0 N` (Zero acceleration)
- ✅ `0 kg × 10 m/s² = 0 N` (Zero mass)
- ✅ `1000 kg × 9.8 m/s² = 9800 N` (Large values)
- ✅ `0.1 kg × 0.5 m/s² = 0.05 N` (Small decimals)
- ✅ `5 kg × -2 m/s² = -10 N` (Negative acceleration)

### Interface Requirements:
- ✅ Prompt: "Please enter the mass of the object (kg): "
- ✅ Prompt: "Please enter the acceleration of the object (m/s^2): "
- ✅ Output: "The force applied to the object is [value] N."

## 👨‍🎓 Student Experience

### What Students Need to Do:
1. **Accept the assignment** (creates their repository)
2. **Complete the code** in `inclass2.java`
3. **Test locally** using `./run_tests.sh`
4. **Push to GitHub** (triggers autograding)
5. **View results** in GitHub Actions tab

### What Students Get:
- ✅ **Immediate feedback** on every push
- ✅ **Detailed test results** showing what passed/failed
- ✅ **Local testing capability** for development
- ✅ **Clear requirements** and documentation

## 🔧 Features Included

### For Instructors:
- **Zero manual grading** - Everything automated
- **Consistent scoring** - Same criteria for all students
- **Detailed analytics** - See who's struggling where
- **Easy modifications** - Change tests or points anytime

### For Students:
- **Clear expectations** - Know exactly what's required
- **Instant feedback** - No waiting for manual grading
- **Multiple attempts** - Can keep improving until deadline
- **Learning focused** - Detailed error messages help debug

## 📚 Documentation Included

1. **GITHUB_CLASSROOM_SETUP.md** - Complete instructor setup guide
2. **TESTING_GUIDE.md** - Detailed testing documentation
3. **TESTING_SUMMARY.md** - Executive summary of testing approach
4. **README.md** - Student-facing assignment instructions

## 🎯 Assignment Learning Objectives

Students will demonstrate:
- ✅ **Java programming fundamentals** (variables, input/output, calculations)
- ✅ **Physics application** (Newton's second law: F = ma)
- ✅ **Problem solving** (handling different data types and edge cases)
- ✅ **Code quality** (proper formatting and user interface)

## 🆘 Support & Troubleshooting

### If Tests Don't Run:
1. Check that `.github/` folder structure is correct
2. Verify `autograding.json` syntax
3. Ensure `run_tests.sh` is executable

### If Grading Seems Wrong:
1. Review individual test outputs in GitHub Actions
2. Check expected vs actual output formatting
3. Verify student code matches required interface

---

## 🔒 Test Security & Student Repository Setup

### How GitHub Classroom Protects Your Tests

**Important:** Students **CANNOT** see your test files! Here's how it works:

#### Template Repository (Instructor Only)
Your template repository contains **ALL** files:
```
/ (INSTRUCTOR TEMPLATE - STUDENTS CAN'T SEE THIS)
├── inclass2.java                    ✅ Students get this
├── README.md                        ✅ Students get this  
├── InClass2Test.java               ❌ HIDDEN from students
├── run_tests.sh                    ❌ HIDDEN from students
├── .github/classroom/autograding.json  ❌ HIDDEN from students
├── .github/workflows/classroom.yml     ❌ HIDDEN from students
└── [all documentation]             ❌ HIDDEN from students
```

#### Student Repository (Auto-Created)
When students accept the assignment, they get **ONLY**:
```
/ (STUDENT REPOSITORY - WHAT THEY SEE)
├── inclass2.java                   ✅ Starter code with TODO comments
├── README.md                       ✅ Assignment instructions
└── [minimal files needed to complete assignment]
```

#### Test Execution (Server-Side Only)
- Tests run on **GitHub's servers** using your template
- Students **never download** or see the test files
- Results are shown in the **GitHub Actions** interface
- Students see **pass/fail** but not the **test code itself**

### Setting Up Protected Testing

#### Method 1: Separate Template Structure (Recommended)
Create **two versions** of your repository:

1. **Student Template** (`student-template` branch):
   - Contains only `inclass2.java` (with starter code)
   - Contains `README.md` (assignment instructions)
   - **No test files**

2. **Full Template** (`main` branch):
   - Contains **everything** (tests, autograding, etc.)
   - Used by GitHub Classroom for testing
   - **Never seen by students**

#### Method 2: GitHub Classroom File Exclusion
When creating the assignment in GitHub Classroom:
1. Select your full template repository
2. In "Advanced Options" → **Exclude files from student repositories**
3. Add patterns to exclude:
   ```
   InClass2Test.java
   run_tests.sh
   .github/
   *Test.java
   TESTING_*.md
   ```

### 🛡️ Security Features

1. **Template Isolation**: Students never access your template repository
2. **Server-Side Testing**: Tests run on GitHub's infrastructure, not student machines
3. **Result-Only Feedback**: Students see pass/fail, not test implementation
4. **Private Repositories**: Each student's work is private to them and instructors
5. **Instructor Override**: You maintain full control over what students receive

### What Students Actually See

#### In Their Repository:
```java
// inclass2.java - What students get
import java.util.Scanner;

/**
 * Name: [STUDENT FILLS IN]
 * Date: [STUDENT FILLS IN] 
 * Purpose: Lab 2 - Force Calculator
 * Calculate force using Newton's Second Law (F = ma)
 */

public class inclass2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // TODO: Declare variables for mass, acceleration, and force
        
        // TODO: Prompt user for mass
        
        // TODO: Read mass input
        
        // TODO: Prompt user for acceleration  
        
        // TODO: Read acceleration input
        
        // TODO: Calculate force using F = ma
        
        // TODO: Display result with proper formatting
    }
}
```

#### In GitHub Actions (Test Results):
Students see results like:
```
✅ Compilation Test - PASSED (10/10 points)
❌ Basic Calculation Test - FAILED (0/10 points)
✅ Input Prompt Test - PASSED (5/5 points) 
⏳ Decimal Test - RUNNING...
```

#### What Students DON'T See:
- The actual test code (`InClass2Test.java`)
- Expected output values
- Test input combinations
- Grading rubric details
- Other students' code

## 🚀 Upload to GitHub Classroom (3 Steps)

### Step 1: Create Template Repository
1. Go to GitHub.com and create a **new repository**
2. Upload `github_classroom_assignment.zip` and extract, OR
3. Upload individual files maintaining the folder structure:
   ```
   /
   ├── inclass2.java
   ├── InClass2Test.java
   ├── run_tests.sh
   ├── README.md
   ├── .github/
   │   ├── classroom/autograding.json
   │   └── workflows/classroom.yml
   └── [documentation files]
   ```

### Step 2: Set Up GitHub Classroom Assignment
1. Go to **classroom.github.com**
2. Create **New Assignment**
3. Select your template repository
4. **Enable Autograding** ✅
5. **Import from .github/classroom/autograding.json** ✅

### Step 3: Test & Deploy
1. **Test the assignment** by accepting it yourself
2. **Verify autograding** runs correctly
3. **Share assignment link** with students

## 📊 Grading Breakdown (100 Points Total)

| Test Category | Points | What It Tests |
|---------------|--------|---------------|
| **Compilation** | 15 | Code compiles without errors |
| **Basic Math** | 20 | Simple F=ma calculations |
| **Decimals** | 20 | Precision with decimal numbers |
| **Edge Cases** | 20 | Zero values, negative numbers |
| **Large/Small Numbers** | 20 | Extreme value handling |
| **User Interface** | 5 | Correct prompts and formatting |

## 🧪 Test Cases Overview

### Physics Calculations Tested:
- ✅ `10 kg × 5 m/s² = 50 N` (Basic)
- ✅ `2.5 kg × 4.2 m/s² = 10.5 N` (Decimals)
- ✅ `5 kg × 0 m/s² = 0 N` (Zero acceleration)
- ✅ `0 kg × 10 m/s² = 0 N` (Zero mass)
- ✅ `1000 kg × 9.8 m/s² = 9800 N` (Large values)
- ✅ `0.1 kg × 0.5 m/s² = 0.05 N` (Small decimals)
- ✅ `5 kg × -2 m/s² = -10 N` (Negative acceleration)

### Interface Requirements:
- ✅ Prompt: "Please enter the mass of the object (kg): "
- ✅ Prompt: "Please enter the acceleration of the object (m/s^2): "
- ✅ Output: "The force applied to the object is [value] N."

## 👨‍🎓 Student Experience

### What Students Need to Do:
1. **Accept the assignment** (creates their repository)
2. **Complete the code** in `inclass2.java`
3. **Test locally** using `./run_tests.sh`
4. **Push to GitHub** (triggers autograding)
5. **View results** in GitHub Actions tab

### What Students Get:
- ✅ **Immediate feedback** on every push
- ✅ **Detailed test results** showing what passed/failed
- ✅ **Local testing capability** for development
- ✅ **Clear requirements** and documentation

## 🔧 Features Included

### For Instructors:
- **Zero manual grading** - Everything automated
- **Consistent scoring** - Same criteria for all students
- **Detailed analytics** - See who's struggling where
- **Easy modifications** - Change tests or points anytime

### For Students:
- **Clear expectations** - Know exactly what's required
- **Instant feedback** - No waiting for manual grading
- **Multiple attempts** - Can keep improving until deadline
- **Learning focused** - Detailed error messages help debug

## 📚 Documentation Included

1. **GITHUB_CLASSROOM_SETUP.md** - Complete instructor setup guide
2. **TESTING_GUIDE.md** - Detailed testing documentation
3. **TESTING_SUMMARY.md** - Executive summary of testing approach
4. **README.md** - Student-facing assignment instructions

## 🎯 Assignment Learning Objectives

Students will demonstrate:
- ✅ **Java programming fundamentals** (variables, input/output, calculations)
- ✅ **Physics application** (Newton's second law: F = ma)
- ✅ **Problem solving** (handling different data types and edge cases)
- ✅ **Code quality** (proper formatting and user interface)

## 🆘 Support & Troubleshooting

### If Tests Don't Run:
1. Check that `.github/` folder structure is correct
2. Verify `autograding.json` syntax
3. Ensure `run_tests.sh` is executable

### If Grading Seems Wrong:
1. Review individual test outputs in GitHub Actions
2. Check expected vs actual output formatting
3. Verify student code matches required interface

---

## 🎉 You're All Set!

This is a **professional-grade autograding solution** that will:
- Save you hours of manual grading
- Provide consistent, fair assessment  
- Give students immediate, helpful feedback
- Scale to any class size

**Just upload to GitHub and create your classroom assignment!** 

*The entire system has been tested and is ready to use immediately.*

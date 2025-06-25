#!/bin/bash

# GitHub Classroom Assignment Package Creator
# This script creates a complete package for uploading to GitHub Classroom

echo "📦 Creating GitHub Classroom Assignment Package..."

# Create a temporary directory for the package
PACKAGE_DIR="github_classroom_package"
mkdir -p "$PACKAGE_DIR"

# Copy all necessary files
echo "📄 Copying assignment files..."

# Core assignment files
cp inclass2.java "$PACKAGE_DIR/"
cp InClass2Test.java "$PACKAGE_DIR/"
cp run_tests.sh "$PACKAGE_DIR/"
cp README.md "$PACKAGE_DIR/"

# Documentation
cp TESTING_GUIDE.md "$PACKAGE_DIR/"
cp TESTING_SUMMARY.md "$PACKAGE_DIR/"
cp GITHUB_CLASSROOM_SETUP.md "$PACKAGE_DIR/"

# GitHub Classroom configuration
mkdir -p "$PACKAGE_DIR/.github/classroom"
mkdir -p "$PACKAGE_DIR/.github/workflows"
cp .github/classroom/autograding.json "$PACKAGE_DIR/.github/classroom/"
cp .github/workflows/classroom.yml "$PACKAGE_DIR/.github/workflows/"

# Maven configuration (optional)
cp pom.xml "$PACKAGE_DIR/"

# Make run_tests.sh executable
chmod +x "$PACKAGE_DIR/run_tests.sh"

echo "✅ Package created successfully!"
echo ""
echo "📁 Package contents:"
find "$PACKAGE_DIR" -type f | sort

echo ""
echo "🚀 Next steps:"
echo "1. Upload the entire '$PACKAGE_DIR' directory to your GitHub repository"
echo "2. Use this repository as a template in GitHub Classroom"
echo "3. Enable autograding when creating the assignment"
echo ""
echo "📋 Assignment Summary:"
echo "- Total Points: 100"
echo "- Test Cases: 12"
echo "- Automatic Grading: ✅"
echo "- Detailed Feedback: ✅"
echo "- Local Testing: ✅"

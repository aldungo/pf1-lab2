#!/bin/bash

# Test runner script for inclass2.java
# This script compiles and runs the test suite

echo "🔧 Compiling Java files..."

# Compile the main program
javac inclass2.java
if [ $? -ne 0 ]; then
    echo "❌ Failed to compile inclass2.java"
    exit 1
fi

# Compile the test file
javac InClass2Test.java
if [ $? -ne 0 ]; then
    echo "❌ Failed to compile InClass2Test.java"
    exit 1
fi

echo "✅ Compilation successful!"
echo ""

# Run the tests
echo "🧪 Running test suite..."
java InClass2Test

echo ""
echo "🧹 Cleaning up class files..."
rm -f *.class

echo "✅ Done!"

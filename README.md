# TSV to TXT
![Github license](https://img.shields.io/badge/mit-blue.svg)
 
 Licensing: [mit](https://choosealicense.com/licenses/mit/)

## Table of Contents
- [Description](#description)
- [Installation Requirements](#installation-requirements)
- [Application Usage](#application-usage)
- [License](#licensing-information)
- [Contributions](#contributions)
- [Tests Commands](#tests-commands)
- [Questions](#questions)
## Description
OOP Lab Module: A Java program that reads a tab-separated values (TSV) file containing student grades, calculates the average scores and assigns grades based on the average. It writes the processed data along with the average scores to a report.txt file and prints the contents of this file to the console.

## Installation Requirements
Ensure you have Java Development Kit (JDK) installed on your system. You can download it from [Oracle](https://www.oracle.com/java/technologies/downloads/) or use a package manager like Homebrew for macOS or apt-get for Linux. 

Using terminal commands: 

- Clone or download the repository: 
```Java 
- git clone https://github.com/your-username/TSVtoTXT.git 
```

- Navigate to the project directory: 
```Java
- cd TSVtoTXT 
```
- Compile the TSVtoTXT.java file: 
```Java
- javac TSVtoTXT.java 
```
- Run the program: 
```Java
- java TSVtoTXT
```  

## Application Usage
The program processes a TSV file that should contain student grades in the following format:
```Java
LastName	FirstName	Midterm1	Midterm2	FinalExam 
```
Input File: When prompted, enter the path to your TSV file. The program reads the TSV file, calculates the average score for each student, assigns a letter grade based on the average, and writes this information to report.txt. It also calculates and writes the average scores for each exam across all students to report.txt. 

The report.txt file will contain the processed data including each student's grades and assigned letter grade, followed by the average scores for each exam. The contents of report.txt are printed to the console for review.  

Example: 
If your input TSV file (grades.tsv) contains:
```Java
Doe	John	85	90	78 
Smith	Jane	92	88	95 
```
After running the program, report.txt will contain:
```Java
Doe	John	85	90	78	B 
Smith	Jane	92	88	95	A 
Averages: Midterm1 88.50, Midterm2 89.00, Final 86.50
```

This application serves a very niche purpose and is not easily modified to fufill any other application purpose.

## Contributions
Eric Keeton

## Test Commands
Test the program by providing various TSV files to ensure correct processing and output.

## Questions
For Questions, contact me at emk2473@gmail.com or visit My Github: [EMK2473](https://github.com/EMK2473)
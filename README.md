# Rate University Application Software Documentation

## Table of Contents

1. [Introduction](#1-introduction)
   1.1 [Problem Statement](#11-problem-statement)
   1.2 [Scenarios](#12-scenarios)
   
2. [Requirements](#2-requirements)
   2.1 [Functional Requirements](#21-functional-requirements)
   2.2 [Non-functional Requirements](#22-non-functional-requirements)
   
3. [Architecture](#3-architecture)
   3.1 [Code Structure](#31-code-structure)
   
4. [Product Backlog](#4-product-backlog)
   
5. [Sprint Backlogs](#5-sprint-backlogs)
   5.1 [Sprint 1](#51-sprint-1)
   5.2 [Sprint 2](#52-sprint-2)

6. [Implementation](#6-implementation)
   6.1 [Technologies](#61-technologies)
   6.2 [Code Quality](#62-code-quality)
   6.3 [Unit/Integration Tests](#63-unitintegration-tests)

7. [UML Diagram](#7-uml-diagram)

## 1. Introduction

### 1.1 Problem Statement
The Rate University Application aims to facilitate student feedback and ratings for the courses they attend, enhancing course quality and aiding prospective students in making informed decisions.

### 1.2 Scenarios
- **User Scenario:** Ben, a computer science student at UPT, explores available courses, reviews details, and leaves feedback for courses he attends.

## 2. Requirements

### 2.1 Functional Requirements

#### FR1: Create a new account and sign in.
   - **User Story 1 (5 points):** As a new student, I want to create a user account with my full name, email, password, and class.
   - **User Story 2 (3 points):** As a registered student, I want to log in using my email and password.

#### FR2: Search for available courses
   - **User Story 3 (5 points):** As a student, I want to view a list of all available courses.
   - **User Story 4 (5 points):** As a student, I want to join or drop a course.

#### FR3: Check course details
   - **User Story 5 (5 points):** As a student, I want to view detailed information about a course, including the course description, lecturer, schedule, location, and the number of registered students.

#### FR4: Leave feedback
   - **User Story 6 (8 points):** As a student, I want to leave feedback for a course, including a description (limited to 1000 characters) and a rating (1 to 5). I can only leave feedback for courses I am registered for.

#### FR5: View feedback
   - **User Story 7 (5 points):** As a student, I want to view a list of feedback for any course, ordered by date. The list should display the average rating for each course.

#### FR6: View top-rated courses
   - **User Story 8 (5 points):** As a student, I want to view the top 8 rated courses.

#### FR7: See course calendar
   - **User Story 9 (4 points):** As a student, I want to view all courses in a calendar format.

#### FR8: Remove old feedback
   - **User Story 10 (2 points):** As the system, I want to automatically remove feedback created more than 1 year ago.

### 2.2 Non-functional Requirements

#### NFR1: Usability
   - The application should be intuitive, with interactions completed in less than three clicks.

#### NFR2: Target platform
   - The application must be developed in Java.

#### NFR3: Version control and hosting
   - Git must be the version control system, and GitHub should be the hosting platform.

## 3. Architecture

### 3.1 Code Structure

The project follows a three-tier architecture and is organized into five packages:

1. **DataLayer:**
   - `DataReader`: The interface reads course and student data.
   - `DataSaver`: The interface saves student and course data.
   - `Reader`: Retrieves data from database.
   - `Saver`: Manages student registration, course updates, feedback cleanup.

2. **LogicLayer:**
   - `UserAuthentication`: Manages user authentication, registration, and available courses.
   - `ProcessData` (Inner Class):  Manages user authentication, registration, and course access.
     
3. **PresentationLayer:**
   - `AvailableCourses` , `Home` , `LogIn`, `Main` , `MyCourses` , `Profile` , `SignUp`

4. **Resources:**
   - `Course` : Represents university course with details.
   - `Feedback` : Represents student feedback for a course.
   - `Student`: Represents a university student.

5. **Test:**
  - This package includes backend tests for functionality validation.
    
6. **Icon:**
  - This package contains the icons used in the project.

## 4. Product Backlog

- **Epic 1: User Management**
  - User Story 1: As a new student, I want to create a user account.
  - User Story 2: As a registered student, I want to log in.
  - User Story 3: As a user, I want to edit my profile details.

- **Epic 2: Course Management**
  - User Story 4: As a student, I want to view available courses.
  - User Story 5: As a student, I want to join or drop a course.
  - User Story 6: As a student, I want to view detailed course information.

- **Epic 3: Feedback System**
  - User Story 7: As a student, I want to leave feedback for a course.
  - User Story 8: As a student, I want to view feedback for a course.

- **Epic 4: Ratings and Rankings**
  - User Story 9: As a student, I want to see the average rating for each course.

## 5. Sprint Backlogs

### 5.1 Sprint 1

**User Stories:**
1. User Story 1 (5 points): Implement user account creation and login.
2. User Story 4 (5 points): Implement viewing available courses.
3. User Story 5 (5 points): Implement joining or dropping a course.
4. User Story 7 (8 points): Implement leaving feedback for a course.

**Sprint Duration:** 3 weeks

### 5.2 Sprint 2

**User Stories:**
1. User Story 3 (3 points): Implement editing user profile details.
2. User Story 6 (5 points): Implement viewing detailed course information.
3. User Story 8 (5 points): Implement viewing feedback for a course.
4. User Story 9 (5 points): Implement viewing average ratings for each course


**Sprint Duration:** 3 weeks

## 6. Implementation

### 6.1 Technologies

- **Language:** Java
- **Database:** MySQL
- **IDE:** IntelliJ IDEA
- **Version Control:** Git, GitHub

### 6.2 Code Quality

The code adheres to best practices, follows camelCase naming conventions, and is well-structured for maintainability. It incorporates the principles of three-tier architecture.

### 6.3 Unit/Integration Tests

JUnit tests are implemented to achieve at least 50% code coverage. Test cases cover various scenarios, ensuring the application's reliability and maintainability.

## 7. UML Diagram

![image](https://github.com/bleonasejdini/RateUniversityApplication/assets/146110609/8327bdda-9ee1-442a-bbca-e8ce0d00fae4)




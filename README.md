# Discussion Forum — Mock Testing with Mockito

This project implements a simple **discussion forum system** in Java and focuses on **mock testing** using **Mockito** to validate interactions between different components.

---

## Purpose

The goal of this project is to:
- Build a basic forum with users, posts, and comments
- Apply **mock objects** to isolate unit testing
- Practice writing **Mockito-based tests** for verifying behavior
- Demonstrate the importance of dependency isolation in software testing

---

## Features

- **Core Components**
  - `User` – represents a forum user
  - `Post` – represents a discussion post
  - `Comment` – represents comments on a post
  - `ForumService` – main service class for managing users, posts, and comments
  - `NotificationService` – mocked dependency that simulates sending notifications (e.g., when a new comment is added)

- **Functionality**
  - Register and manage users
  - Create posts and add comments
  - Notify users when comments are added (simulated with a mocked service)

- **Testing**
  - **Mockito** used to:
    - Mock the `NotificationService`
    - Verify that notifications are triggered correctly
    - Validate service logic without relying on external implementations
    
  - Test coverage includes:
    - Post creation
    - Commenting
    - Interaction verification

---


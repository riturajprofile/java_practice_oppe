---

# java_practice_oppe

A Java practice project to help you learn by creating and editing files, with quick editor tips and basic Java examples.

## Project Overview

This repository is designed for hands-on Java practice, including:

- Creating new Java files
- Editing existing code
- Simple Java examples to verify setup
- Quick notes on useful keyboard shortcuts to speed up editing

## Getting Started

1. Clone the repository or download the project files.
2. Open with your preferred Java IDE or editor (e.g., IntelliJ IDEA, Eclipse, VS Code).
3. Create or edit Java files under the `src/` directory and run them to verify behavior.

## How to Create a New File

- Place new Java files under a descriptive package path, e.g., `src/com/yourname/` or `src/`.
- Example:
  - Create: `src/com/example/HelloWorld.java`
  - Content:
    ```java
    package com.example;

    public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, world!");
        }
    }
    ```

## Editing Tips

- Keyboard shortcuts (editor-dependent; examples below):
  - Save: `Ctrl + S` (Windows/Linux) or `Cmd + S` (macOS)
  - Comment/Uncomment selected lines: `Ctrl + /` (Windows/Linux) or `Cmd + /` (macOS)
  - Navigate to next/previous error or problem: `F2` (varies by IDE)
  - Compile/Run in IDE: use the Run/Build buttons
- If you’re following a few notes from the repository, you might see references to:
  - Toggling focus or tab stops with shortcuts like `Ctrl+Shift+M` or `Esc` then `Tab` (editor-specific)

Note: Shortcuts vary by editor. Check your IDE’s documentation for the exact keys.

## Project Structure (Suggested)

- `src/` — Java source files
  - `com/yourname/` — Package structure for your exercises
- `README.md` — This file
- `LICENSE` — (optional) license for your code
- `docs/` — (optional) project documentation

## Basic Java Example

Create a simple class and run it to confirm your environment works.

- File: `src/com/example/HelloWorld.java`
  ```java
  package com.example;

  public class HelloWorld {
      public static void main(String[] args) {
          System.out.println("Hello, world!");
      }
  }
  ```

- Compile and run from the command line:
  ```
  javac src/com/example/HelloWorld.java
  java -cp src com.example.HelloWorld
  ```



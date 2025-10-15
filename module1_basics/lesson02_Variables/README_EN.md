# Lesson 2 — Variables in Java

This lesson introduces the concept of **variables** in Java — how to declare, assign, and use them in programs.

---

## 🎯 Learning Goals

- Understand what a variable is  
- Learn main data types: `int`, `double`, `boolean`, `char`, `String`  
- Practice assigning and printing variable values  
- Learn to fix common compilation errors  
- Learn how to **change the working directory** in VS Code before running your file

---

## 🧩 Files in this Folder

### `Second.java`
A simple example that shows how to declare variables and print them.

```java
String name = "Kate";
int age = 15;
double height = 1.65;
boolean isStudent = true;
char grade = 'A';
```

Output example:
```
Name: Kate
Age: 15
Height: 1.65
Is student: true
Grade: A
```

---

### `VariablesErrors.java`
Contains examples of **common beginner mistakes** and the correct versions right next to them.

Topics covered:
- Wrong data types  
- Missing imports  
- Wrong quotes for `String` and `char`  
- Case sensitivity in variable names  
- Concatenation mistakes (`"Sum: " + a + b` vs `"Sum: " + (a + b)`)

---

### `VariablesFixTask.java`
A **practice file with broken code**.  
Students should find and fix all mistakes so the program compiles and runs correctly.

Typical errors include:
- Missing semicolons  
- Wrong data types  
- Incorrect variable names  
- Wrong use of quotes or commas  

After fixing, the output should look like:
```
Student name: Kate
Age: 15
Height: 1.65
Student status: true
Grade: A
School: NextGen Coders Lab
```

---

## ⚙️ How to Change Working Directory in VS Code

If your program doesn’t run or VS Code shows *“Cannot find or load main class”*,  
you may need to set the correct **working directory**.

### 🪜 Steps:
1. Open VS Code and your Java project folder.  
2. Press **Ctrl + Shift + P** → type `Java: Configure Classpath`.  
3. Select **"Configure Runtime for Project"**, and make sure your current folder (`lesson02_Variables`) is inside the workspace.  
4. Or open your `.vscode/settings.json` and set:
   ```json
   {
     "java.project.sourcePaths": ["module1_basics/lesson02_Variables"]
   }
   ```
5. Save and restart VS Code.  
Now the “Run” button should appear above your `main` method.

---

## 💡 Teacher’s Note

Encourage students to:
1. Compile each file separately and read compiler errors carefully.  
2. Explain in their own words **why** each fix was needed.  
3. Try changing variable values and adding new ones (e.g., `favoriteColor`, `hobby`).  
4. Practice switching working directories in VS Code before running programs.

---

## 🧠 Extra Challenge

Ask students to create a new file `VariablesPractice.java` that prints a short introduction about themselves using all five variable types.

Example:
```
Hello! My name is Alex.
I'm 14 years old and my height is 1.72 meters.
Do I like programming? true
My grade in Java is: B
```

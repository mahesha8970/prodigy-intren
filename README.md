# Prodigy InfoTech – Software Development Internship

This repository contains all tasks completed during my internship.

## Tasks

### Task 01 – Temperature Conversion Program

A Java console-based application that converts temperatures between Celsius, Fahrenheit, and Kelvin with input validation and multiple conversion support.

About
# Temperature Conversion Program

## 📌 Task

This project is part of the **Prodigy Infotech Software Development Internship – Task 01**.

The objective of this task is to create a program that converts temperature values between **Celsius, Fahrenheit, and Kelvin**.

---

## 🧠 Problem Statement

Create a program that:

1. Accepts a temperature value from the user.
2. Accepts the unit of measurement:

   * Celsius (C)
   * Fahrenheit (F)
   * Kelvin (K)
3. Converts the entered temperature into the other two units.
4. Displays the converted values to the user.

Example:
If the user enters **25°C**, the program should convert it into:

* **77°F**
* **298.15 K**

---

## ⚙️ Technologies Used

* Java
* Scanner Class (for user input)
* Command Line / Terminal

---

## 🔄 Temperature Conversion Formulas

Celsius → Fahrenheit
F = (C × 9/5) + 32

Celsius → Kelvin
K = C + 273.15

Fahrenheit → Celsius
C = (F − 32) × 5/9

Kelvin → Celsius
C = K − 273.15

---

## 💻 Program Code

```java
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");

        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        System.out.print("Enter unit (C/F/K): ");
        char unit = sc.next().toUpperCase().charAt(0);

        double celsius, fahrenheit, kelvin;

        switch(unit) {

            case 'C':
                celsius = temp;
                fahrenheit = (celsius * 9/5) + 32;
                kelvin = celsius + 273.15;

                System.out.println("Fahrenheit: " + fahrenheit);
                System.out.println("Kelvin: " + kelvin);
                break;

            case 'F':
                fahrenheit = temp;
                celsius = (fahrenheit - 32) * 5/9;
                kelvin = celsius + 273.15;

                System.out.println("Celsius: " + celsius);
                System.out.println("Kelvin: " + kelvin);
                break;

            case 'K':
                kelvin = temp;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 9/5) + 32;

                System.out.println("Celsius: " + celsius);
                System.out.println("Fahrenheit: " + fahrenheit);
                break;

            default:
                System.out.println("Invalid unit entered.");
        }

        sc.close();
    }
}
```

---

## ▶️ How to Run the Program

1. Save the file as
   `TemperatureConverter.java`

2. Open terminal and compile the program

```
javac TemperatureConverter.java
```

3. Run the program

```
java TemperatureConverter
```

---

## 📷 Example Output

```
Temperature Conversion Program
Enter temperature value: 25
Enter unit (C/F/K): C

Fahrenheit: 77.0
Kelvin: 298.15
```

---

## 🎯 Learning Outcome

Through this project, we learned:

* Basic Java programming
* User input handling using Scanner
* Conditional statements (Switch case)
* Mathematical conversions

---

## 👨‍💻 Author

Mahesha


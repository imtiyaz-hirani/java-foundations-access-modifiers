# Java Foundations — Access Modifiers & Encapsulation

This project demonstrates **how to apply Java access modifiers to control class and member visibility**.  
It aligns with **Learning Objective 2** of the course:

> **"Apply access modifiers to control class and member visibility"**

The examples cover all four access levels and show **how they behave in different scenarios**:
- `public` — accessible from anywhere
- `protected` — accessible within the package and in subclasses (even across packages)
- `default` / package-private — accessible only within the same package
- `private` — accessible only within the class
- Encapsulation using **getters** for controlled data access

---

## **Project Structure**

```
java-foundations-access-modifiers
└── src
└── com
└── pluralsight
├── app
│ └── App.java # Main demo runner
├── api
│ └── PublicApi.java # Demonstrates controlled exposure & encapsulation
├── domain
│ ├── Person.java # Core class with all access modifiers
│ ├── Employee.java # Same-package subclass access demo
└── external
└── ExternalEmployee.java # Different-package subclass access demo
```

## **Key Concepts Demonstrated**
```
| **Modifier**      | **Same Class** | **Same Package** | **Subclass (Same Package)** | **Subclass (Different Package)** | **Outside World** |
|-------------------|---------------|------------------|-----------------------------|---------------------------------|--------------------|
| **public**        | Yes        | Yes          | Yes                      | Yes                          | Yes             |
| **protected**     | Yes        | Yes          | Yes                      | Yes *(via inheritance)*      | No              |
| **default**       | Yes        | Yes          | Yes *(same package)*     | No                           | No              |
| **private**       | Yes        | No           | No                       | No                          | No              |
```

## **Classes Overview**

| **Class**               | **Package**                | **Purpose** |
|------------------------|---------------------------|-------------------------------------------|
| **Person**            | `com.pluralsight.domain`  | Demonstrates all four access modifiers (`public`, `protected`, `default`, `private`) |
| **Employee**          | `com.pluralsight.domain`  | Subclass in **same package** — shows package + protected access |
| **ExternalEmployee**  | `com.pluralsight.external`| Subclass in **different package** — shows protected vs package-private behavior |
| **PublicApi**        | `com.pluralsight.api`     | Demonstrates **encapsulation** and controlled field exposure |
| **App**              | `com.pluralsight.app`     | Main entry point — ties all examples together |

## **Actual Output**

=== Java Access Modifiers Demo ===

=== Employee Details (Same Package Subclass) ===
Name: Scott
Age: 30
Note: Package-Internal
Name: Scott, Age: 30
Protected method: Age = 30
Package-private method: Package-Internal
Employee ID: E001

=== External Employee (Different Package Subclass) ===
Name: Kim
Age (via inheritance): 28
Name: Kim, Age: 28
Protected method: Age = 28
Employee Code: EXT1001

=== Public API Exposure ===
Name: Alex
Masked SSN: XXX-XX-1111

=== End of Demo ===




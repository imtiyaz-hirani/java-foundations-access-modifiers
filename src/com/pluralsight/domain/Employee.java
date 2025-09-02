package com.pluralsight.domain;

public class Employee extends Person {

    private String employeeId;

    // Constructor → calls Person's constructor using super
    public Employee(String name, int age, String ssn, String employeeId) {
        super(name, age, ssn);
        this.employeeId = employeeId;
    }

    public void showEmployeeDetails() {
        System.out.println("=== Employee Details (Same Package Subclass) ===");

        // Accessible: public field from Person
        System.out.println("Name: " + publicName);

        // Accessible: protected field from Person
        System.out.println("Age: " + protectedAge);

        // Accessible: default/package-private field → same package
        System.out.println("Note: " + packageNote);

        // Not Accessible: private field from Person → uncomment below to test
        // System.out.println("SSN: " + privateSsn); // Compilation Error

        // Calling Person's public method
        showPublicInfo();

        // Calling Person's protected method → allowed in subclass
        showProtectedInfo();

        // Calling package-private method → same package
        showPackageInfo();

        // Cannot call Person's private method directly → hidden
        // showPrivateInfo();

        System.out.println("Employee ID: " + employeeId);
    }
}
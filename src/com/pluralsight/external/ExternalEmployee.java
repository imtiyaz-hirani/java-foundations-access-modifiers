package com.pluralsight.external;

import com.pluralsight.domain.Person;

public class ExternalEmployee extends Person {

    private String employeeCode;

    // Constructor → calls Person's constructor using super
    public ExternalEmployee(String name, int age, String ssn, String code) {
        super(name, age, ssn);
        this.employeeCode = code;
    }

    public void showExternalDetails() {
        System.out.println("=== External Employee (Different Package Subclass) ===");

        // Accessible: public field from Person
        System.out.println("Name: " + publicName);

        // Accessible: protected field → BUT only through inheritance
        System.out.println("Age (via inheritance): " + protectedAge);

        // NOT Accessible: package-private field → different package
        // System.out.println("Note: " + packageNote); // Compilation Error

        // NOT Accessible: private field → never accessible
        // System.out.println("SSN: " + privateSsn); // Compilation Error

        // Public method → always accessible
        showPublicInfo();

        // Protected method → accessible via inheritance
        showProtectedInfo();

        // NOT Accessible: package-private method → different package
        // showPackageInfo(); // Compilation Error

        System.out.println("Employee Code: " + employeeCode);
    }
}
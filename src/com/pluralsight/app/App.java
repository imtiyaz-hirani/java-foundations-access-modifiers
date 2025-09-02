package com.pluralsight.app;

import com.pluralsight.domain.Employee;
import com.pluralsight.external.ExternalEmployee;
import com.pluralsight.api.PublicApi;
import com.pluralsight.domain.Person;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Java Access Modifiers Demo ===\n");

        // Create an Employee (same package subclass)
        Employee emp = new Employee("Scott", 30, "123456789", "E001");
        emp.showEmployeeDetails();
        System.out.println();

        // Create an ExternalEmployee (different package subclass)
        ExternalEmployee extEmp = new ExternalEmployee("Kim", 28, "987654321", "EXT1001");
        extEmp.showExternalDetails();
        System.out.println();

        // Public API exposure demo
        PublicApi api = new PublicApi();
        Person person = new Person("Alex", 35, "555551111");
        api.exposePersonInfo(person);

        System.out.println("\n=== End of Demo ===");
    }
}

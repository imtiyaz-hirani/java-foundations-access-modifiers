package com.pluralsight.api;

import com.pluralsight.domain.Person;

public class PublicApi {

    public void exposePersonInfo(Person person) {
        System.out.println("=== Public API Exposure ===");

        // Public field → accessible directly
        System.out.println("Name: " + person.publicName);

        // Protected field → NOT accessible here (different package + not a subclass)
        // System.out.println(person.protectedAge); // Compilation Error

        // Package-private field → NOT accessible (different package)
        // System.out.println(person.packageNote); // Compilation Error

        // Private field → never accessible directly
        // System.out.println(person.privateSsn); // Compilation Error

        // Accessing private info indirectly via a public method
        System.out.println("Masked SSN: " + person.getMaskedSsn());
    }
}

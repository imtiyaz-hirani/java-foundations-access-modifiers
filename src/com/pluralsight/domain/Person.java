package com.pluralsight.domain;

public class Person {

    // === Fields with different access levels ===
    public String publicName;       // Accessible from anywhere
    protected int protectedAge;     // Accessible within package + subclasses
    String packageNote;             // Default package-private (no modifier)
    private String privateSsn;      // Accessible only within this class

    // === Constructor ===
    public Person(String name, int age, String ssn) {
        this.publicName = name;
        this.protectedAge = age;
        this.privateSsn = ssn;
        this.packageNote = "Package-Internal";
    }

    // === Public Method ===
    public void showPublicInfo() {
        System.out.println("Name: " + publicName + ", Age: " + protectedAge);
    }

    // === Protected Method ===
    protected void showProtectedInfo() {
        System.out.println("Protected method: Age = " + protectedAge);
    }

    // === Package-Private Method ===
    void showPackageInfo() {
        System.out.println("Package-private method: " + packageNote);
    }

    // === Private Method ===
    private void showPrivateInfo() {
        System.out.println("Private SSN: " + privateSsn);
    }

    // Public accessor for private field
    public String getMaskedSsn() {
        if (privateSsn == null || privateSsn.length() < 4) {
            return "N/A";
        }
        return "XXX-XX-" + privateSsn.substring(privateSsn.length() - 4);
    }
}

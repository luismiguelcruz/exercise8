/**
 * All rights reserved.
 * Copyright (c) Ixxus Ltd 2016
 */
package co.ixxus.uk.innmutable_class;

import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * @author Luis Miguel Cruz
 *
 */
public abstract class Person {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String title;
    private final String mobile;
    private final String landline;
    private final String gender;
    private final List<String> multipleAddresses;

    Person(final String firstName, final String middleName, final String lastName, final String title,
            final String mobile, final String landline, final String gender, final List<String> multipleAddresses) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.title = title;
        this.mobile = mobile;
        this.landline = landline;
        this.gender = gender;
        this.multipleAddresses = ImmutableList.copyOf(multipleAddresses);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public String getMobile() {
        return mobile;
    }

    public String getLandline() {
        return landline;
    }

    public String getGender() {
        return gender;
    }

    public List<String> getMultipleAddresses() {
        return multipleAddresses;
    }
}

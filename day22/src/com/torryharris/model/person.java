package com.torryharris.model;

import java.util.Objects;

public class person implements Comparable<person> {

        private int personId;
        private String name;
        private String occupation;
        private String city;

    public person() {
    }

    public person(int personId, String name, String occupation, String city) {
        this.personId = personId;
        this.name = name;
        this.occupation = occupation;
        this.city = city;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(person o) {
        return this.personId-o.personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return personId == person.personId && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId);
    }
}



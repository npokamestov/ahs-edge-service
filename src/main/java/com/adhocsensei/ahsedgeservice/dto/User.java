package com.adhocsensei.ahsedgeservice.dto;

import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@RefreshScope
public class User implements Serializable {

    private Long userId;
    private String authority;
    private String firstName;
    private String lastName;
    //    validation for no repeats
    private String email;
    private String password;
    private String bio;
    private boolean instructor;

    private Set<Course> senseisCreatedCourses;
    private Set<Course> studentsRegisteredCourses;

    public User() {
    }

    public User(Long userId, String authority, String firstName, String lastName, String email, String password, String bio, boolean instructor, Set<Course> senseisCreatedCourses, Set<Course> studentsRegisteredCourses) {
        this.userId = userId;
        this.authority = authority;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.bio = bio;
        this.instructor = instructor;
        this.senseisCreatedCourses = senseisCreatedCourses;
        this.studentsRegisteredCourses = studentsRegisteredCourses;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public boolean isInstructor() {
        return instructor;
    }

    public void setInstructor(boolean instructor) {
        this.instructor = instructor;
    }

    public Set<Course> getSenseisCreatedCourses() {
        return senseisCreatedCourses;
    }

    public void setSenseisCreatedCourses(Set<Course> senseisCreatedCourses) {
        this.senseisCreatedCourses = senseisCreatedCourses;
    }

    public Set<Course> getStudentsRegisteredCourses() {
        return studentsRegisteredCourses;
    }

    public void setStudentsRegisteredCourses(Set<Course> studentsRegisteredCourses) {
        this.studentsRegisteredCourses = studentsRegisteredCourses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isInstructor() == user.isInstructor() && Objects.equals(getUserId(), user.getUserId()) && Objects.equals(getAuthority(), user.getAuthority()) && Objects.equals(getFirstName(), user.getFirstName()) && Objects.equals(getLastName(), user.getLastName()) && Objects.equals(getEmail(), user.getEmail()) && Objects.equals(getPassword(), user.getPassword()) && Objects.equals(getBio(), user.getBio()) && Objects.equals(getSenseisCreatedCourses(), user.getSenseisCreatedCourses()) && Objects.equals(getStudentsRegisteredCourses(), user.getStudentsRegisteredCourses());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getAuthority(), getFirstName(), getLastName(), getEmail(), getPassword(), getBio(), isInstructor(), getSenseisCreatedCourses(), getStudentsRegisteredCourses());
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", authority='" + authority + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", bio='" + bio + '\'' +
                ", instructor=" + instructor +
                ", senseisCreatedCourses=" + senseisCreatedCourses +
                ", studentsRegisteredCourses=" + studentsRegisteredCourses +
                '}';
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////
//    private List<Course> senseisCreatedCourses = new ArrayList<>();
//    private List<Course> studentsRegisteredCourses = new ArrayList<>();
//
//    public User() {
//    }
//
//    public User(Long userId, String authority, String firstName, String lastName, String email, String password, String bio, boolean instructor, List<Course> senseisCreatedCourses, List<Course> studentsRegisteredCourses) {
//        this.userId = userId;
//        this.authority = authority;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.password = password;
//        this.bio = bio;
//        this.instructor = instructor;
//        this.senseisCreatedCourses = senseisCreatedCourses;
//        this.studentsRegisteredCourses = studentsRegisteredCourses;
//    }
//
//    public Long getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }
//
//    public String getAuthority() {
//        return authority;
//    }
//
//    public void setAuthority(String authority) {
//        this.authority = authority;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getBio() {
//        return bio;
//    }
//
//    public void setBio(String bio) {
//        this.bio = bio;
//    }
//
//    public boolean isInstructor() {
//        return instructor;
//    }
//
//    public void setInstructor(boolean instructor) {
//        this.instructor = instructor;
//    }
//
//    public List<Course> getSenseisCreatedCourses() {
//        return senseisCreatedCourses;
//    }
//
//    public void setSenseisCreatedCourses(List<Course> senseisCreatedCourses) {
//        this.senseisCreatedCourses = senseisCreatedCourses;
//    }
//
//    public List<Course> getStudentsRegisteredCourses() {
//        return studentsRegisteredCourses;
//    }
//
//    public void setStudentsRegisteredCourses(List<Course> studentsRegisteredCourses) {
//        this.studentsRegisteredCourses = studentsRegisteredCourses;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return isInstructor() == user.isInstructor() && Objects.equals(getUserId(), user.getUserId()) && Objects.equals(getAuthority(), user.getAuthority()) && Objects.equals(getFirstName(), user.getFirstName()) && Objects.equals(getLastName(), user.getLastName()) && Objects.equals(getEmail(), user.getEmail()) && Objects.equals(getPassword(), user.getPassword()) && Objects.equals(getBio(), user.getBio()) && Objects.equals(getSenseisCreatedCourses(), user.getSenseisCreatedCourses()) && Objects.equals(getStudentsRegisteredCourses(), user.getStudentsRegisteredCourses());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getUserId(), getAuthority(), getFirstName(), getLastName(), getEmail(), getPassword(), getBio(), isInstructor(), getSenseisCreatedCourses(), getStudentsRegisteredCourses());
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "userId=" + userId +
//                ", authority='" + authority + '\'' +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", bio='" + bio + '\'' +
//                ", instructor=" + instructor +
//                ", senseisCreatedCourses=" + senseisCreatedCourses +
//                ", studentsRegisteredCourses=" + studentsRegisteredCourses +
//                '}';
//    }
//////////////////////////////////////////////////////////////////////////////////////////////////
//        public Long getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }
//
//    public String getAuthority() {
//        return authority;
//    }
//
//    public void setAuthority(String authority) {
//        this.authority = authority;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getBio() {
//        return bio;
//    }
//
//    public void setBio(String bio) {
//        this.bio = bio;
//    }
//
//    public boolean isInstructor() {
//        return instructor;
//    }
//
//    public void setInstructor(boolean instructor) {
//        this.instructor = instructor;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return isInstructor() == user.isInstructor() && Objects.equals(getUserId(), user.getUserId()) && Objects.equals(getAuthority(), user.getAuthority()) && Objects.equals(getFirstName(), user.getFirstName()) && Objects.equals(getLastName(), user.getLastName()) && Objects.equals(getEmail(), user.getEmail()) && Objects.equals(getPassword(), user.getPassword()) && Objects.equals(getBio(), user.getBio());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getUserId(), getAuthority(), getFirstName(), getLastName(), getEmail(), getPassword(), getBio(), isInstructor());
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "userId=" + userId +
//                ", authority='" + authority + '\'' +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", bio='" + bio + '\'' +
//                ", instructor=" + instructor +
//                '}';
//    }
}
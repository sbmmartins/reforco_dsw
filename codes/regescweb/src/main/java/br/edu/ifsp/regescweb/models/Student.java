
package br.edu.ifsp.regescweb.models;

// Uma classe é um JavaBean se ela possui um construtor sem parâmetros e para cada
// um de seus atributos, ela possua setters and getters

public class Student {
    private long id;
    private String name;
    private int age;

    public Student() {
        this.id = -1;
    }

    public Student(String name, int age) {
        this.id = -1;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "- id: " + this.id + "\n- name: " + this.name + "\n- age: " + this.age;
    }
}

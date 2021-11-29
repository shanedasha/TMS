package ru.netology.domain;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class Issue {
    private int id;
    private String author;
    private Set<String> label;
    private String projects;
    private Set<String> milestones;
    private Set<String> assigned;
    private boolean isOpen;

    public Issue() {
    }

    public Issue(int id, String author, Set<String> label, String projects, Set<String> milestones, Set<String> assigned, boolean isOpen) {
        this.id = id;
        this.author = author;
        this.label = label;
        this.projects = projects;
        this.milestones = milestones;
        this.assigned = assigned;
        this.isOpen = isOpen;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Set<String> getLabel() {
        return label;
    }

    public void setLabel(Set<String> label) {
        this.label = label;
    }

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }

    public Set<String> getMilestones() {
        return milestones;
    }

    public void setMilestones(Set<String> milestones) {
        this.milestones = milestones;
    }

    public Set<String> getAssigned() {
        return assigned;
    }

    public void setAssigned(Set<String> assigned) {
        this.assigned = assigned;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}


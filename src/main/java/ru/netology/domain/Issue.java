package ru.netology.domain;

import java.util.Set;

public class Issue {
    private int id;
    private String author;
    private Set label;
    private String projects;
    private Set milestones;
    private Set assigned;
    private boolean isOpen;

    public Issue() {
    }

    public Issue(int id, String author, Set label, String projects, Set milestones, Set assigned) {
        this.id = id;
        this.author = author;
        this.label = label;
        this.projects = projects;
        this.milestones = milestones;
        this.assigned = assigned;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Set getLabel() {
        return label;
    }

    public void setLabel(Set label) {
        this.label = label;
    }

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }

    public Set getMilestones() {
        return milestones;
    }

    public void setMilestones(Set milestones) {
        this.milestones = milestones;
    }

    public Set getAssigned() {
        return assigned;
    }

    public void setAssigned(Set assigned) {
        this.assigned = assigned;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}


package ru.netology.domain;

import java.util.*;

public class Issue implements List<Issue> {
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

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean open) {
        isOpen = true;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Issue> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Issue issue) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Issue> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Issue> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Issue get(int index) {
        return null;
    }

    @Override
    public Issue set(int index, Issue element) {
        return null;
    }

    @Override
    public void add(int index, Issue element) {

    }

    @Override
    public Issue remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Issue> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Issue> listIterator(int index) {
        return null;
    }

    @Override
    public List<Issue> subList(int fromIndex, int toIndex) {
        return null;
    }
}
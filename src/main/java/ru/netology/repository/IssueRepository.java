package ru.netology.repository;

import ru.netology.domain.Issue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class IssueRepository {
    private Collection<Issue> items = new ArrayList<>();

    public void save(Issue item) {
        items.add(item);
    }

    public Collection<Issue> findAll() {
        return items;
    }

    public Collection<Issue> listOpenIssue(boolean isOpen) {
        return items;
    }

    public Collection<Issue> listClosedIssue(boolean isOpen) {
        return items;
    }

    public Collection<Issue> updateIssue(int id) {
    }

    public void removeById(int id) {
        items.removeIf(el -> el.getId() == id);
    }

    public void filterByAuthor(String author) {
        items.stream().filter(el -> el.getAuthor() == author);
    }

    public void filterByLabel(Set label) {
        items.stream().filter(el -> el.getLabel() == label);
    }

    public void filterByAssigned(Set assigned) {
        items.stream().filter(el -> el.getAssigned() == assigned);
    }
}

package ru.netology.repository;

import ru.netology.domain.Issue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class IssueRepository {
    private Collection<Issue> items = new ArrayList<>();
    private Issue issue = new Issue();

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

    public Collection<Issue> openIssue(int id) {
        issue.setOpen(true);
        return items;
    }

    public Collection<Issue> closeIssue(int id) {
        issue.setOpen(false);
        return items;
    }

    public void removeById(int id) {
        items.removeIf(el -> el.getId() == id);
    }

    public void filterByAuthor(String author) {
        items.stream().filter(issue -> issue.getAuthor().equalsIgnoreCase(author));
    }

    public void filterByLabel(Set<Issue> label) {
        items.stream().filter(el -> el.getLabel() == label);
    }

    public void filterByAssigned(Set<Issue> assigned) {
        items.stream().filter(el -> el.getAssigned() == assigned);
    }
}

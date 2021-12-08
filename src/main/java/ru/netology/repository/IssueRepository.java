package ru.netology.repository;

import ru.netology.domain.Issue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class IssueRepository {
    private final List<Issue> items = new ArrayList<>();

    public void save(Issue item) {
        items.add(item);
    }

    public List<Issue> findAll() {
        return items;
    }

    public List<Issue> listOpenIssue(boolean isOpen) {
        for (Issue issue : findAll()) {
            if (issue.getIsOpen()== true) {
                return items;
            }
        }
        return items;
    }


    public List<Issue> listClosedIssue(boolean isOpen) {
        for (Issue issue : findAll()) {
            if (!issue.getIsOpen()) {
                return items;
            }
        }
        return items;
    }


    public List<Issue> openIssue(int id) {
        for (Issue issue : findAll()) {
            if ((issue.getIsOpen()) && issue.getId() == id) {
                issue.setIsOpen(false);
            }
        }
        return items;
    }

    public List<Issue> closeIssue(int id) {
        for (Issue issue : findAll()) {
            if ((!issue.getIsOpen()) && issue.getId() == id) {
                issue.setIsOpen(true);
                return items;
            }
        }
        return items;
    }

    public List<Issue> filterByAuthor(String author) {
        for (Issue issue : findAll()) {
            if (issue.getAuthor().equals(author)) {
                return items;
            }
        }
        return items;
    }
    public List<Issue> filterByLabel(Set<String> label) {
        for (Issue issue : findAll()) {
            if (issue.getLabel().equals(label)) {
                return items;
            }
        }
        return items;
    }

    public List<Issue> filterByAssigned(Set<String> assigned) {
        for (Issue issue : findAll()) {
            if (issue.getAssigned().equals(assigned)) {
                return items;
            }
        }
        return items;
    }
}
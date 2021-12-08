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
        List<Issue> result = new ArrayList<Issue>();
        for (Issue issue : findAll()) {
            if (issue.getIsOpen()== true) {
                result.add(issue);
            }
        }
        return result;
    }


    public List<Issue> listClosedIssue(boolean isOpen) {
        List<Issue> result = new ArrayList<Issue>();
        for (Issue issue : findAll()) {
            if (!issue.getIsOpen()) {
                result.add(issue);
            }
        }
        return result;
    }


    public List<Issue> openIssue(int id) {
        List<Issue> result = new ArrayList<Issue>();
        for (Issue issue : findAll()) {
            if ((!issue.getIsOpen()) && issue.getId() == id) {
                issue.setIsOpen(true);
                result.add(issue);
            }
        }
        return result;
    }

    public List<Issue> closeIssue(int id) {
        List<Issue> result = new ArrayList<Issue>();
        for (Issue issue : findAll()) {
            if ((issue.getIsOpen()) && issue.getId() == id) {
                issue.setIsOpen(false);
                result.add(issue);
            }
        }
        return result;
    }

    public List<Issue> filterByAuthor(String author) {
        List<Issue> result = new ArrayList<Issue>();
        for (Issue issue : findAll()) {
            if (issue.getAuthor().equals(author)) {
                result.add(issue);
            }
        }
        return result;
    }
    public List<Issue> filterByLabel(Set<String> label) {
        List<Issue> result = new ArrayList<Issue>();
        for (Issue issue : findAll()) {
            if (issue.getLabel().equals(label)) {
                result.add(issue);
            }
        }
        return result;
    }

    public List<Issue> filterByAssigned(Set<String> assigned) {
        List<Issue> result = new ArrayList<Issue>();
        for (Issue issue : findAll()) {
            if (issue.getAssigned().equals(assigned)) {
                result.add(issue);
            }
        }
        return result;
    }
}
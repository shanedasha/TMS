package ru.netology.manager;

import ru.netology.domain.Issue;
import ru.netology.repository.IssueRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class IssueManager {
    private IssueRepository repository;
    private Collection<Issue> items = new ArrayList<>();

    public IssueManager(IssueRepository repository) {
        this.repository = repository;
    }


    public void add(Issue item) {repository.save(item); }

    public Collection<Issue> showOpenIssue(Boolean isOpen) {
        repository.listOpenIssue(true);
        return items;
    }

    public Collection<Issue> showClosedIssue(Boolean isOpen) {
        repository.listClosedIssue(false);
        return items;
    }

    public Collection<Issue> OpenIssue(int id) {
        repository.openIssue(id);
        return items;
    }

    public Collection<Issue> ClosedIssue(int id) {
        repository.closeIssue(id);
        return items;
    }

    public Collection<Issue> filterByAuthor(String author) {
        repository.filterByAuthor(author);
        return items;
    }

    public Collection<Issue> filterByLabel(Set <String> label) {
        repository.filterByLabel(label);
        return items;
    }


    public Collection<Issue> filterByAssigned(Set <String> assigned) {
        repository.filterByAssigned(assigned);
        return items;
    }
}

package ru.netology.manager;

import ru.netology.domain.Issue;
import ru.netology.repository.IssueRepository;

import java.util.Set;

public class IssueManager {
    private IssueRepository repository;
    public Issue issue;

    public IssueManager(IssueRepository repository) {
        this.repository = repository;
    }


    public void add(Issue item) {
        repository.save(item);
    }

    public void showOpenIssue(boolean isOpen) {
        repository.listOpenIssue(isOpen);
    }

    public void showClosedIssue(boolean isOpen) {
        repository.listClosedIssue(isOpen);
    }

    public void filterByAuthor(String author) {
        repository.filterByAuthor(author);
    }

    public void filterBylabel(Set label) {
        repository.filterByLabel(label);
    }

    public void filterByAssigned(Set assigned) {
        repository.filterByAssigned(assigned);
    }
}

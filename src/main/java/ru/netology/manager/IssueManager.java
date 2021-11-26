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


    public void add(Issue item) {repository.save(item); }

    public void showOpenIssue(Boolean isOpen) {
        repository.listOpenIssue(true);
    }

    public void showClosedIssue(boolean isOpen) {
        repository.listClosedIssue(false);
    }

    public void OpenIssue(int id) {
        repository.openIssue(id);
    }

    public void ClosedIssue(int id) {
        repository.closeIssue(id);
    }

    public void filterByAuthor(String author) {
        repository.filterByAuthor(author);
    }

    public void filterByLabel(Set <Issue> label) {
        repository.filterByLabel(label);
    }

    public void filterByAssigned(Set <Issue> assigned) {
        repository.filterByAssigned(assigned);
    }
}

package ru.netology.manager;

import ru.netology.domain.Issue;
import ru.netology.repository.IssueRepository;

import java.util.Set;

public class IssueManager {
    private final IssueRepository repository;
    public IssueManager(IssueRepository repository) {
        this.repository = repository;
    }


    public void add(Issue item) {repository.save(item); }

    public void showOpenIssue(boolean isOpen) {
        repository.listOpenIssue(true);
    }

    public void  showClosedIssue(boolean isOpen) {
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

    public void filterByLabel(Set <String> label) {
        repository.filterByLabel(label);
    }


    public void filterByAssigned(Set <String> assigned) {
        repository.filterByAssigned(assigned);
    }
}

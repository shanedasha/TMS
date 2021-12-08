package ru.netology.manager;

import ru.netology.domain.Issue;
import ru.netology.repository.IssueRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class IssueManager {
    private final IssueRepository repository;
    public IssueManager(IssueRepository repository) {
        this.repository = repository;
    }
    private final List<Issue> items = new ArrayList<>();


    public void add(Issue item) {repository.save(item); }

    public List<Issue> showOpenIssue(boolean isOpen) {
       return repository.listOpenIssue(true);
    }

    public List<Issue> showClosedIssue(boolean isOpen) {
       return repository.listClosedIssue(false);
    }

    public List<Issue> OpenIssue(int id) {
         return repository.openIssue(id);
    }

    public List<Issue> ClosedIssue(int id) {
         return repository.closeIssue(id);
    }

    public List<Issue> filterByAuthor(String author) {
         return repository.filterByAuthor(author);
    }

    public List<Issue> filterByLabel(Set <String> label) {
         return repository.filterByLabel(label);
    }


    public List<Issue> filterByAssigned(Set <String> assigned) {
         return  repository.filterByAssigned(assigned);
    }
}

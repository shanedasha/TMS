package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Issue;
import ru.netology.repository.IssueRepository;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class IssueManagerTest {

    private IssueRepository repository = new IssueRepository();
    private IssueManager manager = new IssueManager(repository);

    private Issue first = new Issue(1, "Author1", Collections.singleton("1"), "project1", Collections.singleton("1"), Collections.singleton("man1"), true);
    private Issue second = new Issue(2, "Author2", Collections.singleton("2") , "project2", Collections.singleton("2"),  Collections.singleton("man2"), false);
    private Issue third = new Issue(3, "Author3",  Collections.singleton("3"), "project3",  Collections.singleton("3"), Collections.singleton("man3"), true);


    @Test
    void showOpenIssue() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        assertEquals(List.of(first, third), manager.showOpenIssue(true));
    }

    @Test
    void showClosedIssue() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        assertEquals(List.of(second), manager.showClosedIssue(false));
    }


    @Test
    void openIssue() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.OpenIssue(1);

        assertEquals(List.of(first), manager.showOpenIssue(true));
    }

    @Test
    void closedIssue() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.ClosedIssue(1);

        assertEquals(List.of(first), manager.showClosedIssue(false));
    }

    @Test
    void filterByAuthor() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        assertEquals(List.of(first), manager.filterByAuthor("Author1"));

    }

    @Test
    void filterByLabel() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        assertEquals(List.of(second), manager.filterByLabel( Collections.singleton("2")));
    }

    @Test
    void filterByAssigned() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        assertEquals(List.of(first), manager.filterByAssigned( Collections.singleton("man1")));
    }
}
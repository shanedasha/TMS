package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Issue;
import ru.netology.repository.IssueRepository;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class IssueManagerTest {

    private IssueRepository repository = new IssueRepository();
    private IssueManager manager = new IssueManager(repository);

    private Issue first = new Issue(1, "Author1", Set.of("1"), "project1", Set.of("1"), Set.of("man1"), true);
    private Issue second = new Issue(2, "Author2",Set.of("2") , "project2", Set.of("2"),  Set.of("man2"), false);
    private Issue third = new Issue(3, "Author3", Set.of("3"), "project3",  Set.of("3"), Set.of("man3"), true);



    @Test
    void showOpenIssue() {
        manager.add(first);
        manager.add(second);
        manager.add(third);


        assertEquals(List.of(first,third), manager.showOpenIssue(true));
    }
    @Test
    void showOpenIssue0() {

        assertEquals(List.of(), manager.showOpenIssue(true));
    }

    @Test
    void showClosedIssue() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        assertEquals(List.of(second), manager.showClosedIssue(false));
    }
    @Test
    void showClosedIssue0() {

        assertEquals(List.of(), manager.showClosedIssue(false));
    }

    @Test
    void openIssue() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        assertEquals(List.of(second), manager.OpenIssue(2));
    }

    @Test
    void closedIssue() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        assertEquals(List.of(first), manager.ClosedIssue(1));
    }

    @Test
    void filterByAuthor() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        assertEquals(List.of(first), manager.filterByAuthor( ("Author1")));

    }

    @Test
    void filterByLabel() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        assertEquals(List.of(second), manager.filterByLabel( Set.of("2")));
    }

    @Test
    void filterByAssigned() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        assertEquals(List.of(first), manager.filterByAssigned( Set.of("man1")));
    }
}
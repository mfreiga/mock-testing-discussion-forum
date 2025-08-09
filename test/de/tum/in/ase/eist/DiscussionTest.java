package de.tum.in.ase.eist;

import org.easymock.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(EasyMockExtension.class)
class DiscussionTest {

    // TODO implement the tests
    @TestSubject
    private Discussion discussion;

    @Mock
    private Course courseMock;
    @Mock
    private Comment commentMock;

@Test
    public void testComment(){
    expect(commentMock.save()).andReturn(true);

    replay(commentMock);

    assertTrue(discussion.addComment(commentMock));
    assertEquals(1, discussion.getNumberOfComments());

    verify(commentMock);
}

@Test
    public void testCommentIfSavingFails(){
    expect(commentMock.save()).andReturn(false);
    replay(commentMock);

    assertFalse(discussion.addComment(commentMock));
    assertEquals(0, discussion.getNumberOfComments());

    verify(commentMock);
}

//The startCourseDiscussion() method checks if a person is allowed to start a discussion by invoking the isDiscussionAllowed() method of Course.
// We want you to test this method independently from the permission check.
//Create a Person instance (either Student or Lecturer) and mock the course, such that the person may start a discussion.
//Test if the startCourseDiscussion() method is working as specified and if the method sets the course and the topic of the Discussion object properly.
@Test
    public void testStartCourseDiscussion(){
    Person person = new Lecturer("name", "lastName", LocalDate.now());

    expect(courseMock.isDiscussionAllowed(person)).andReturn(true);
    replay(courseMock);

    assertTrue(discussion.startCourseDiscussion(courseMock, person, "currentTopic"));
    assertEquals("currentTopic", discussion.getTopic());
    assertEquals(courseMock, discussion.getCourse());
}

}

package com.bassyoun.guestbook;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class PostTest {
@Test
void testSetName() {
Post post = new Post("TESTER", "2022-04-12 01:01:48", "Happy Wedding"); post.setName("BASSYOUN");
assertEquals("BASSYOUN", post.getName());
}
}

package linkedlist;
import static org.junit.Assert.*;
import linkedlist.Node;

import org.junit.Before;
import org.junit.Test;


public class NodeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOneElement() {
		//Node list = new Node("a",null);
		Node<String> list = new Node<>("a");
		assertEquals("a",list.toString());
		
	}
	@Test
	public void testTwoElements() {
		/*
		Node list = new Node("a");	
		list.appendLast("b");	
		Node<String> list = Node.with("a").with("b");
		*/
		
		Node<String> list = new Node<>("a",new Node<>("b"));
		assertEquals("a, b",list.toString());
		
	}

}

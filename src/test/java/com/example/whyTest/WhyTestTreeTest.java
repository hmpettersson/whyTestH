package com.example.whyTest;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

class WhyTestTreeTest {
	
	public static whyTestTree tree; 
	
	@BeforeAll
	public static void setUp() throws Exception {
		tree = new whyTestTree();
		System.out.println(tree.getColour());
		System.out.println(tree.getHeight());
		System.out.println(tree.getType());
	}

	@Test
	public void test() {
		assertEquals("Green", tree.getColour());
		assertEquals(10, tree.getHeight());
		assertNotNull(tree);
	}
	@Test
	public void testGrowth() {
		int oakGrowth = tree.growth(10);
		assertEquals(200, oakGrowth);
		System.out.println("OakGrowth method was tested with ten years and result was:" + oakGrowth);
	}

	@AfterAll
	public static void tearDown() throws Exception {
		System.out.println("After test method, after each method.");
		tree.setColour("Blue");
		tree.setHeight(5);
		tree.setType("Pine");
		System.out.println(tree.getColour());
		System.out.println(tree.getHeight());
		System.out.println(tree.getType());
	}
}

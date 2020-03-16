package com.codingquestions.app;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.codingquestions.app.ClassicalBinarySearch;

public class ClassicalBinarySearchTest {

  @BeforeAll
  static void setup() {

  }

  @BeforeEach
  void setupThis() {

  }

  @Test
  @Disabled
  void testBaseCase() {
    ClassicalBinarySearch myClass = new ClassicalBinarySearch();
    int[] array = {};

    Assertions.assertEquals(-1, myClass.binarySearch(array, -1));
  }

  @Test
  @Disabled
  void testOneElementFound() {
    ClassicalBinarySearch myClass = new ClassicalBinarySearch();
    int[] array = { 1 };

    Assertions.assertEquals(-1, myClass.binarySearch(array, -1));
  }

  @Test
  @Disabled
  void testOneElementNotFound() {
    ClassicalBinarySearch myClass = new ClassicalBinarySearch();
    int[] array = { 1 };

    Assertions.assertEquals(0, myClass.binarySearch(array, 1));
  }

  @AfterEach
  void tearThis() {

  }

  @AfterAll
  static void tear() {

  }
}
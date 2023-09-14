package com.homework.classtests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/*
 * Mirror class to run the tests of Palindrome and CharType
 */

@Suite
@SelectClasses({IsAlmostPalindromeTest.class,CheckFirstCharTest.class})
public class AllTests {

}

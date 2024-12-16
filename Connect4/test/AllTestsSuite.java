package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Runs all tests
 */
@RunWith(Suite.class)
@SuiteClasses({ Connect4ComputerPlayerTest.class, Connect4LogicTest.class })
public class AllTestsSuite {

}
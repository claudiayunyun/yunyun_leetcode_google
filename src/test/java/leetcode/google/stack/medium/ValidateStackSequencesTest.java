package leetcode.google.stack.medium;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidateStackSequencesTest {
	
	private ValidateStackSequences validateStackSequences;
	
	@BeforeEach
	public void setup() {
		validateStackSequences = new ValidateStackSequences();
	}
	
	@Test
	public void validateStackSequences_correctSequeces() {
		int[] pushed = new int[] {1,2,3,4,5};
		int[] popped = new int[] {4,5,3,2,1};
  		boolean retVal = validateStackSequences.validateStackSequences(pushed, popped);
  		assertTrue(retVal);
	}
	
	
	@Test
	public void validateStackSequences_wrongSequeces() {
		int[] pushed = new int[] {1,2,3,4,5};
		int[] popped = new int[] {4,3,5,1,2};
  		boolean retVal = validateStackSequences.validateStackSequences(pushed, popped);
  		assertFalse(retVal);
	}
	

}

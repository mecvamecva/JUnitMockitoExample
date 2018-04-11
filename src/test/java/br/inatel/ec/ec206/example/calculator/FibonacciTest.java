package br.inatel.ec.ec206.example.calculator;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FibonacciTest {

	@InjectMocks
	private Fibonacci fibonacci;

	@Test
	public void shouldCalculateNumberForSix() {
		int result = fibonacci.calcNumber(6);

		assertThat(result, equalTo(8));
	}

	@Test
	public void shouldCalculateNumberForOne() {
		int result = fibonacci.calcNumber(1);

		assertThat(result, equalTo(1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldNotCalculateNumberForNegative() {
		fibonacci.calcNumber(-1);
	}
}

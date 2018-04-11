package br.inatel.ec.ec206.example.report;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductTotalizerTest {

	@Mock
	private ProductDAO productDAO;

	@InjectMocks
	private ProductTotalizer totalizer;

	@Test
	public void shouldTotalize() {
		Product p1 = new Product().withQuantity(5);
		Product p2 = new Product().withQuantity(4);
		when(productDAO.listAll()).thenReturn(Arrays.asList(p1, p2));

		int result = totalizer.totalize();

		assertThat(result, equalTo(9));
	}

	@Test
	public void shouldTotalizeForEmptyList() {
		when(productDAO.listAll()).thenReturn(new ArrayList<>());

		int result = totalizer.totalize();

		assertThat(result, equalTo(0));
	}
}

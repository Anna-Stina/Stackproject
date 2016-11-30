import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import junit.framework.Assert;

public class StackTests {

	@Test
	public void newStackHasZeroElements() {
		Stack s = new Stack();
		int size = s.getSize();
		assertThat(size, is(0));
	}
	// loo pinu, lisa (push) kaks elementi ja kontrolli, et selles on 2 elementi
	// (size == 2).

	@Test
	public void pushIncreaseStackSize() {
		Stack s = new Stack();
		s.push(9);
		s.push(7);
		int size = s.getSize();
		assertThat(size, is(2));
	}

	// – loo pinu, lisa (push) kaks elementi, vُõta (pop) kaks elementi ja
	// kontrolli, et pinus on 0 elementi.
	@Test
	public void popDecraesesStackSize() {
		Stack s = new Stack();
		s.push(9);
		s.push(7);
		s.pop();
		s.pop();
		int size = s.getSize();
		assertThat(size, is(0));
	}

	// – loo pinu, lisa (push) kaks elementi, vُõta (pop) kaks elementi ja
	// kontrolli, et need on needsamad lisatud elemendid.

	@Test
	public void pushedElementsAreTheSameAsPoppedElements() {
		Stack s = new Stack();
		s.push(9);
		s.push(7);
		int poppedFirst = s.pop();
		int poppedSecond = s.pop();
		assertThat(poppedFirst, is(7));
		assertThat(poppedSecond, is(9));

	}

	// – loo pinu, lisa (push) kaks elementi, vaata pealmist elementi (peek) ja
	// kontrolli, et see oige element.
	@Test
	public void pushedElementsAreTheSameAsPeeked() {
		Stack s = new Stack();
		s.push(9);
		s.push(7);
		int peekedFirst = s.peek();
		assertThat(peekedFirst, is(7));
	}

	// – loo pinu, lisa (push) kaks elementi, vaata pealmist elementi ja
	// kontrolli, et pinus on 2 elementi

	@Test
	public void peekingDoesNotChangeSize() {
		Stack s = new Stack();
		s.push(9);
		s.push(7);
		s.peek();
		s.getSize();
		assertThat(s.getSize(), is(2));
	}

	// – loo pinu, lisa (push) kaks elementi, vaata pealmist elementi, vaata
	// uuesti pealmist elementi ja kontrolli, et see on seesama, mis esimesel
	// korral.
	@Test
	public void twoPeeksAreTheSame() {
		Stack s = new Stack();
		s.push(9);
		s.push(7);
		s.peek();
		s.peek();
		assertThat(s.peek(), is(s.peek()));
	}

	// – loo pinu, vُõta (pop) üks element ja kontrolli, et pinu viskab
	// IllegalStateException-i.
	@Test(expected = IllegalStateException.class)
	public void poppingEmptyStackThrowsException() {
		Stack s = new Stack();
		s.pop();
	}

	// – loo pinu, vaata pealmist elementi ja kontrolli, et pinu viskab
	// IllegalStateException-i.
	@Test(expected = IllegalStateException.class)
	public void peekingEmptyStackThrowsException() {
		Stack s = new Stack();
		s.peek();
	}
}
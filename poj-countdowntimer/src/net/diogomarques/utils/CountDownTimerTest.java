package net.diogomarques.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountDownTimerTest {

	@Test
	public void testStart() {
		final int totalT = 50;
		final int tickT = 1;
		new CountDownTimer(totalT, tickT) {

			int expectedTickCount = totalT * tickT;
			int actualTickCount = 0;
			int actualFinishCount = 0;

			@Override
			public void onTick(long millisUntilFinished) {
				actualTickCount++;
			}

			@Override
			public void onFinish() {
				actualFinishCount++;
				assertEquals(expectedTickCount, actualTickCount);
				assertEquals(1, actualFinishCount);
			}
		}.start();
	}
}

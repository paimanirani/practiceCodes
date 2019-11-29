package org.general;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduler {
	public static void main(String[] args) {
		ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
		Runnable task = new Runnable() {

			@Override
			public void run() {
				System.out.println("Hi!");

			}
		};

		int delay = 5;
		scheduler.schedule(task, delay, TimeUnit.SECONDS);
		scheduler.shutdown();

	
	}
}

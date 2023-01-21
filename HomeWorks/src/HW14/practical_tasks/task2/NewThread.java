package HW14.practical_tasks.task2;

public class NewThread extends Thread {
	private int times;
	private int interval;
	private String message;

	public NewThread(int times, int interval, String message) {
		this.times = times;
		this.interval = interval;
		this.message = message;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
	}

	public String getMsg() {
		return message;
	}

	public void setMsg(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		int i = 0;
		while (i < times) {
			try {
				System.out.println(message);
				Thread.sleep(interval);
				i++;
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
	}
}
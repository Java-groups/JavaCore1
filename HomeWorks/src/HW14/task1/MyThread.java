package HW14.task1;

public class MyThread extends Thread {
	private int times;
	private String message;

	public MyThread() {
		
	}

	public MyThread(int times, String message) {
		this.times = times;
		this.message = message;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
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
			System.out.println(message);
			i++;
		}
	}
}
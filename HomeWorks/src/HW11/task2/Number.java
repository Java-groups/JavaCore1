package HW11.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {
	private int start;
	private int end;
	private int inputNumber;

	public Number(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public Number() {

	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int readNumber(int start, int end) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter any number between '" + start + "' and '" + end + "'");
			inputNumber = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			throw new NumberFormatException("Your value is not a number!");
		}
		if (inputNumber >= start && inputNumber <= end) {
			return inputNumber;
		} else throw new IllegalArgumentException("Your number is out of bounds!");
	}

}

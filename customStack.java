package stack;

public class customStack implements IStack {
	protected int[] data;
	protected int top; // index of top element
	protected int cap; // capacity of stack, can be provided at runtime else defaults to 10
	private static final int DEFAULT_CAPACITY = 10;

	public customStack(int cap) {
		this.data = new int[cap];
		this.top = -1;
		this.cap = cap;
	}

	public customStack() {
		this.cap = DEFAULT_CAPACITY;
		this.data = new int[cap];
		this.top = -1;

	}

	public int[] getData() {
		return data;
	}

	public int getData(int index) {
		return data[index];
	}

	public void setData(int[] data) {
		this.data = data;
		this.cap = data.length;
	}

	public void setData(int index, int val) {
		data[index] = val;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	private int getSize() {
		return top + 1;
	}

	public int getCap() {
		return cap;
	}

	public int size() {
		return getSize();
	}

	public void display() {

		for (int j = top; j >= 0; j--) {
			System.out.print(data[j] + " ");
		}
		System.out.println();
	}

	public void push(int val) throws StackOverflowException {

		if (top == data.length - 1) {
			throw new StackOverflowException();
		} else {
			top++;
			data[top] = val;
		}
	}

	public int pop() throws StackUnderflowException {

		if (top == -1) {
			throw new StackUnderflowException();
		} else {
			top--;
			return data[top + 1];
		}
	}

	public int peek() throws StackUnderflowException {

		if (top == -1) {
			throw new StackUnderflowException();
		}
		return data[top];
	}

}

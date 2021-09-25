package stack;

public class dynamicStack extends customStack {
	private static final int DEFAULT_CAPACITY = 10;

	public dynamicStack() {
		super(DEFAULT_CAPACITY);
	}

	public dynamicStack(int cap) {
		super(cap);
	}

	@Override
	public void push(int val) {
		int top = getTop();
		int cap = getCap();
		if (top == cap - 1) {
			int[] newData = new int[2 * cap];
			for (int i = 0; i < cap; i++) {
				newData[i] = getData(i);
			}
			setData(newData);

		}
		setTop(top + 1);
		setData(getTop(), val);
	}

}

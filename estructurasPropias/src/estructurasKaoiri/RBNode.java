package estructurasKaoiri;

public class RBNode<T extends Comparable<T>> {

	private T date;
	private T name;
	private T data;
	private int color = RBTree.BLACK;
	private RBNode<T> left;
	private RBNode<T> right;
	private RBNode<T> parent;

	public RBNode(T data, T date, T name) {
		this();
		this.data = data;
		this.date = date;
		this.name = name;
	}

	public RBNode() {

		color = RBTree.BLACK;
		parent = null;
		left = null;
		right = null;

	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public RBNode<T> getLeft() {
		return left;
	}

	public void setLeft(RBNode<T> left) {
		this.left = left;
	}

	public RBNode<T> getRight() {
		return right;
	}

	public void setRight(RBNode<T> right) {
		this.right = right;
	}

	public RBNode<T> getParent() {
		return parent;
	}

	public void setParent(RBNode<T> parent) {
		this.parent = parent;
	}

	public T getDate() {
		return date;
	}

	public void setDate(T date) {
		this.date = date;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public int compareTo(RBNode<T> o) {
		return this.data.compareTo(o.getData());
	}

}

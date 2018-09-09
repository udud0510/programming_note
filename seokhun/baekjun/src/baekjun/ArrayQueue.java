package baekjun;

public class ArrayQueue {
	
	//큐 배열은 front와 rear, maxSize를 가진다.
	private int front;
	private int rear;
	private int maxSize;
	private Object[] queueArray;
	
	//큐 배열 생성
	public ArrayQueue(int maxSize) {
		this.front = 0;
		this.rear = -1;
		this.maxSize = maxSize;
		this.queueArray = new Object[maxSize];
	}
	
	//큐가 비어있는지 확인(프론트가 rear을 추월할 때)
	public boolean empty() {
		return (front == rear+1);
	}
	
	//큐가 꽉 찼는지 확인
	//rear가 데이터를 저장할 위치인 배열의 크기에 도달했을 때 true반환
	public boolean full() {
		return (rear == maxSize-1);
	}
	
	//큐 rear에 데이터 등록
	public void insert(Object item) {
		if(full()) throw new ArrayIndexOutOfBoundsException();
		
		queueArray[++rear] = item;
	}
	
	//큐에서 front데이터 조회
	public Object peek() {
		if(empty()) throw new ArrayIndexOutOfBoundsException();
		
		return queueArray[front];
	}
	
	//큐에서 front 데이터 제거
	public Object remove() {
		Object item = peek();
		front++;
		return item;
	}
}

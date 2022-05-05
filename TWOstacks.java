class TWOstacks{
	int size;
	 int top1;
	 int top2;
	 int arr[];
	 
	 TWOstacks(int num){
		arr=new int[num];
		size=num;
		top1=-1;
		top2=size;
	 }
	 
	 void push1(int z){
		if(top1<top2-1){
			top1++;
			arr[top1] = z;
		}
		else{
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	 }
	 
	 void push2(int z){
		if(top1<top2-1){
			top2--;
			arr[top2] = z;
		}
		else{
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	 }
	 
	 int pop1(){
		if(top1>=0){
			int z = arr[top1];
			top1--;
			return z;
		}
		else{
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return 0;
	 }
	 int pop2(){
		if(top2<size){
			int z = arr[top2];
			top2--;
			return z;
		}
		else{
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return 0;
	 }
	 
	 public static void main(String[] args){
		TWOstacks st = new TWOstacks(11);
		st.push1(5);
		st.push2(10);
		st.push2(15);
		st.push1(11);
		st.push2(7);
		st.push2(40);
		
		System.out.println("Popped element from stack1 is " +st.pop1());
		System.out.println("Popped element from stack2 is " +st.pop2());
	 }
	 
}
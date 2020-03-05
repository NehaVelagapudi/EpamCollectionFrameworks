package ExceptionHandling.CollectionFramework;
public class Collections {
	private Object[] a = new Object[10];
	private int e=0;
	public void add(Object ob){
		if(e== a.length){
			increaseCap();
		}
		a[e] = ob;
		e++;
	}
	public void increaseCap() {
		// TODO Auto-generated method stub
		int newcap = a.length*2;
		Object[] nextarray = new Object[newcap];
		for(int i=0;i<a.length;i++){
			nextarray[i]=a[i];
		}
		a=nextarray;
	}
	public void print(){
		System.out.print("(");
		for(int i=0;i<e;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print(")");
	}
	public int capac(){
		return a.length;
	}
	int size(){
		return e;
	}

	public Object get(int ind){
		//System.out.println("The element at index "+ind+"is "+a[ind]);
		if(ind<0 ||ind>=size()){
			throw new IndexOutOfBoundsException("index is out of bounds");
		}
		return a[ind];
	}
	public void remove(int ind){
		System.out.println("The element at index "+ind+"is"+a[ind]);
		if(ind<0 ||ind>=size()){
			throw new IndexOutOfBoundsException("index is out of bounds");
		}
		while(ind<size()-1){
			a[ind]=a[ind+1];
			ind++;
		}
		a[ind]=null;
		e--;
	}

}





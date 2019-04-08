
public class lista {
protected Node first;
protected Node last;
protected int size;

	public lista(){
		first =null;
		last = null;
		size=0;
	}
	
	public int getsize(){
		return size;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public Node getFirst() {
		return first;
	}
	
	public Node getLast(){
		return last;
	}
	
	public void insert(Object n){
		Node tmp= new Node(n,null);
		if(first==null){
			first=tmp;
			last = tmp;
			size++;
			
		}else{
			last.setNext(tmp);
			last = tmp;
			size++;
			
		}
		
	}
	
	
	public void print(){
		Node tmp = first;
		while (tmp != null){
			System.out.print(tmp.getInfo()+"--");
			tmp=tmp.getNext();
			
		}
	}
	
	public boolean buscar(Object ref){
		Node aux = first;
		boolean encontrado = false;
			while(aux!=null && encontrado != true){
				if(ref.equals(aux.getInfo())){
					encontrado=true;
				}else{
					aux=aux.getNext();
				}
			}
		return encontrado;
		
	}
	
	public  lista getComunes( lista acompara){
		lista result = new lista();
		Node cursor1 = first;
		while(cursor1 != null){
			if(!acompara.buscar(cursor1.getInfo())){
				if(!result.buscar(cursor1.getInfo())){
					result.insert(cursor1.getInfo());
				}
			}
			cursor1= cursor1.getNext();
		}		
		return result;
	}
	
	
	
}
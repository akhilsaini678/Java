package errorHandling;

class StackOverFlow extends Exception {
    public String toString(){
        return "Stack is full";
    }
}

class StackUnderFlow extends Exception {
    public String toString(){
        return "Stack is Empty";
    }
}

class StackS {
    private int st[];
    private int size;
    private int top;
    public StackS(int size){
        st= new int[size];
        this.size = size;
        top = -1;
    }

    public void push(int x) throws StackOverFlow {
        if(top==size-1) throw new StackOverFlow();
        top+=1;
        st[top] = x; 
    }

    public int pop() throws StackUnderFlow {
        if(top==-1) throw new StackUnderFlow();
        int x = st[top];
        top--;
        return x;
    }
}

public class StackClass {
    public static void main(String[] args) {
        StackS st = new StackS(5);
        try {   
            System.out.println(st.pop());
            st.push(10);
            st.push(20);
            st.push(10);
            st.push(20);
            st.push(10);
            st.push(20);
            System.out.println(st.pop());
        } catch (StackOverFlow e) {
            System.out.println(e);
        } catch (StackUnderFlow e){
            System.out.println(e);
        }
    }
}

package errorHandling;

/*
 * Errors: Syntax error and logical error are faced by programmer, while runtime error are faced by user.
 * Syntax Error : It is handled by compiler. 
 * Logical Error: Tracing or debugger is used to remove such errors.
 * Runtime Error: These are the errors created by user. File not found/Deleted, invalid number etc. Programmer should tell user to provide 
 *                right resources and inputs. It can be handled using Exception Handling (My program is perfect except these scenarios).
 */
public class ErrorHandling {
    public static void main(String[] args) {
     
        int a = 14, b = 7, c, division;
        int d[] = {30,10,40,20,0};
        try {
            c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e){
            System.out.println("Exception: "+ e);
        }

        try {
            division = d[0]/d[4];
            System.out.println(d[10]);
            System.out.println("Divided number is: "+division);
        }
        catch(ArithmeticException e){
            System.out.println("Divided by zero: "+e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Array Index out of bound: "+e);
        }

        // Nested try catch
        try {
            division = d[0]/d[4];
            try {
                System.out.println(d[10]);
            } catch(IndexOutOfBoundsException e){
                System.out.println("Array Index out of bound: "+e);
            }
            System.out.println("Divided number is: "+division);
        }
        catch(ArithmeticException e){
            System.out.println("Divided by zero: "+e);
        }

        
        System.out.println("Program End");
    }
}

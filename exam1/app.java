import java.util.LinkedList;
import java.util.Stack;


public class App {
    public static void main(String[] args) throws Exception {

    // ARRAYS (50 points)
    System.out.println("======================================================");
    
    // 1. Create an array of characters of your SURNAME.
    char [] surname = {'M', 'A', 'S', 'A', 'N', 'G', 'C', 'A','Y'};

    // 2. Display each character of your SURNAME on each line.
    System.out.println("\nThese are all the characters of my surname: ");
    for (int i = 0; i < 9; i++) 
    {
        System.out.println(surname[i]);
    }

    // 3. Display the first character of your SURNAME.
    System.out.println("\nThis is the first character of my surname: ");
    System.out.println(surname[0]);

    // 4. Display the last character of your SURNAME.
    System.out.println("\nThis is the last character of my surname: ");
    System.out.println(surname[8]);

    // 5. Display the character of your SURNAME in reverse order.
    System.out.println("\nThese are all the characters of my surname in a reverse order: ");
    for (int i = surname.length-1; i >= 0; i--) 
    {
        System.out.println(surname[i]);
    }


    // LINKED LIST (25 points)
    System.out.println("======================================================");

    // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.
    LinkedList<String> studentNum = new LinkedList<>();

    studentNum.add("2");
    studentNum.add("0");
    studentNum.add("2");
    studentNum.add("1");
    studentNum.add("1");
    studentNum.add("0");
    studentNum.add("7");
    studentNum.add("4");
    studentNum.add("9");
    studentNum.add("7");
    

    // 2. Add an asterisk (*) to the head/front of the Linked list.
    studentNum.addFirst("*");
    // 3. Add an asterisk (*) to the tail/end of the Linked list.
    studentNum.addLast("*");
    
    // 4. Display the Linked list.
    System.out.println("\nThis is the student number linked list with added asterisk in the head and tail of the list: ");
    System.out.println(studentNum);

    // 5. Display the last character of the Linked list.
    System.out.println("\nThis is the last character of the linked list: ");
    System.out.println(studentNum.get(11));

    // 6. Replace the last character of the Linked list with the exclamation symbol (!).
    studentNum.set(11, "!");

    // 7. Remove the first character of the Linked list.
    studentNum.remove(0);


    // 8. Display the LinkedList.
    System.out.println("\nThis is the new student number linked list without the first character, and with replaced last character: ");
    System.out.println(studentNum);



    // STACK (25 points)
    System.out.println("======================================================");

    // 1. Create a Stack of characters of your SURNAME.
    Stack<String> surName = new Stack<>();

    surName.push("M");
    surName.push("A");
    surName.push("S");
    surName.push("A");
    surName.push("N");
    surName.push("G");
    surName.push("C");
    surName.push("A");
    surName.push("Y");
  
    // 2. Print the Stack.
    System.out.println("\nThese are the characters of my surname: ");
    System.out.println(surName);

    // 3. Add a "INF214" to the stack.
    surName.push("I");
    surName.push("N");
    surName.push("F");
    surName.push("2");
    surName.push("1");
    surName.push("4");
    
    // 4. Print the Stack.
    System.out.println("\nThese are the characters of my surname with added INF214 to the stack: ");
    System.out.println(surName);

    // 5. Remove "INF214".
    surName.pop();
    surName.pop();
    surName.pop();
    surName.pop();
    surName.pop();
    surName.pop();


    // 6. Add "CCDATRCL-INF214".
    surName.push("C");
    surName.push("C");
    surName.push("D");
    surName.push("A");
    surName.push("T");
    surName.push("R");
    surName.push("C");
    surName.push("L");
    surName.push("-");
    surName.push("I");
    surName.push("N");
    surName.push("F");
    surName.push("2");
    surName.push("1");
    surName.push("4");
    

    // 7. Print the Stack.
    System.out.println("\nThese are the final characters of my surname with INF214 being removed, and with CCDATRCL-INF214 added to the stack: ");
    System.out.println(surName);
    }
}

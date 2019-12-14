public class MyBookCollection{
public static void main(String[] args) {
ArrayList<String> books = new ArrayList<String> ();
// add items
books.add("Horror Books");
books.add("Adventure Books");
books.add("History Books");
books.add("Science fiction Books");
System.out.println(books);
System.out.println(books.size());

// remove items
books.remove(2);
System.out.println(books);
System.out.println(books.size());

//modify item
books.set(2,"Biology BOOks");
System.out.println(books);
System.out.println(books.size());
System.out.println(books.get(1));
for(int i=0 ; 1<books.size(); i++){
	System.out.println(books.get(i));
}
}
}
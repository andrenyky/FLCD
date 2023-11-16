public class Main {
    public static void main(String[] args) {
        SymbolTable<Object> symbolTable = new SymbolTable<>();

        // Inserting values into the symbol table
        symbolTable.insert('a');
        symbolTable.insert(30);
        symbolTable.insert(20);
        symbolTable.insert(30);

        System.out.println("Symbol Table:");
        symbolTable.display();

        System.out.println("Lookup for value 30:"+symbolTable.lookup(30));

        // Deleting a value from the symbol table
        symbolTable.delete('A');

        // Displaying the updated symbol table
        System.out.println("Updated Symbol Table:");
        symbolTable.display();
    }
}
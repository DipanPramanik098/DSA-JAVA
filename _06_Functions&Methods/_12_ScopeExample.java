public class _12_ScopeExample {
    
    // Class Scope (Instance Variable)
    int instanceVar = 10; 
    
    // Static Scope (Class Variable)
    static int staticVar = 20; 

    void methodScopeExample() {
        // Method Scope (Local Variable)
        int localVar = 30;  
        System.out.println("Local Variable inside method: " + localVar);
        
        // Block Scope
        if (localVar > 0) {
            int blockVar = 40; // Block Scope
            System.out.println("Block Variable inside if-statement: " + blockVar);
        }
        // System.out.println(blockVar); // Error: blockVar is out of scope
    }

    public static void main(String[] args) {
        // Creating an instance of ScopeExample to access instance variables
        _12_ScopeExample obj = new _12_ScopeExample();
        
        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Variable: " + staticVar);

        // Calling method to demonstrate method and block scope
        obj.methodScopeExample();
    }
}

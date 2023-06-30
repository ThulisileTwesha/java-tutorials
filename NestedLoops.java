public class NestedLoops {
    public static void main(String[] args)
    {
        //Outer loop
        for(int i = 0; i <= 15; i = i + 2){
            System.out.println("Outer: " + i);
        
        //Inner loop
            for (int t = 2; t < 20; t = t + 2){
                System.out.println("Inner: " + t);


        }
    
    }
    
}
}
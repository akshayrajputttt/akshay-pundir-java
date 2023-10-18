public class pattern8 {
    public static void main(String[] args) {
        int size=6;
    
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(i == size-1 || j == 0 || i == j)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
    }
    }

}
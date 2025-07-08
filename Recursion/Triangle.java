public class Triangle {
  public static void main(String[] args) {
    int r = 4;
    int c = 0;
    triangle(r, c);
    triangle1(r, c);
  }  
    static void triangle(int r, int c){
        if(r == 0) return;
        if(c<r){
            System.out.print("*");
            triangle(r, c+1);
        }
        else{
                System.out.println();
                triangle(r-1, 0);
            }
        }
        static void triangle1(int r, int c){
            if(r == 0) return;
            if(c<r){        
                triangle1(r, c+1);
                System.out.print("*");
            }
            else{
                triangle1(r-1, 0);
                System.out.println();
            }
    }
}
// ****
// ***
// **
// *
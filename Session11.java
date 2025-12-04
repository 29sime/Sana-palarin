class Session11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Input the Coordinate x,y");

        System.out.print("x: ");
        int x = scanner.nextInt();
       
       System.out.print("y: ");
       int y = scanner.nextInt();
         
         String = findquadrant(x,y);
       System.out.println("Result:")
    }

    static void String findquadrant();

            if (x > 0 && y > 0) {
            return "Quadrant-I(+,+)";
        } 
        else if (x < 0 && y > 0) {
            return "Quadrant-II(−,+)";
        } 
        else if (x < 0 && y < 0) {
            return "Quadrant-III(−,−)";
        } 
        else if (x > 0 && y < 0) {
            return "Quadrant-IV(+,−)";
        }
         else if (x == 0 && y == 0) {
            return "Point is at the Origin (0,0)";
        } 
        else if (x == 0) {
            return "Point lies on the Y-axis";
        } else {
}

}
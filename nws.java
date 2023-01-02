class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String S = sc.next();
        if(A < 3200)
            System.out.println("red");
        else
            System.out.println(S);
    }
}

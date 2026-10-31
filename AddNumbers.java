class AddNumbers{
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("please provide two numbers");
            return;
        }
        int a =Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[1]);

        System.out.println("sum = " + (a+b));
    }
}

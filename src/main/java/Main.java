public class Main {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Error: You need 2 arguments!");
        }else {
            System.out.println(addInt(Integer.parseInt(args[0]), Integer.parseInt(args[1]))) ;
        }
    }

    public static int addInt(int args1, int args2){
        return args1+args2;
    }
}

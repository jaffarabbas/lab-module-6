class one{
    static void run(){
        System.out.println("one");
    }
}

class two extends one{
    static void run(){
        System.out.println("two");
    }
}

class p{
    public static void main (String[] args) {
        two.run();
    }
}

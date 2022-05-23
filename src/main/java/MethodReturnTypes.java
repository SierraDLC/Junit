public class MethodReturnTypes {

    public static boolean giveBoolean(){

        return true;
    }


    public static int intMethod(){

        return 89;
    }

    public static String giveString(){

        return "I don't enjoy hazelnuts";
    }


    public static void main(String[] args) {

        System.out.println(giveString());

        System.out.println (intMethod());

        System.out.println(giveBoolean());
    }
}




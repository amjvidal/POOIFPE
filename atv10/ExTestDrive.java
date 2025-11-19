package atv10;

public class ExTestDrive {
    static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if ("yes".equals(t)) {
            System.out.print("a");
            throw new MyEx();
        }
        System.out.print("m");
    }

    public static void main(String[] args) throws MyEx {
        String test = args[0];
        
        try {
            System.out.print("t");
            doRisky(test);
            System.out.print("r");
        } finally {
            System.out.print("o");
        }
        
        System.out.println("w");
    }
}

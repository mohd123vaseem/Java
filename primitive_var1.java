public class primitive_var1 {
    public static void main(String[] args) {
        //character
        char ch=65;// 65 is ascci code of A
        System.out.println("This is the character " +ch);

        //byte
        byte v1=66;
        System.out.println("This is the byte " +v1);

        //short
        short v2=67;
        System.out.println("This is the short " +v2);

        //int
        int v3=68;
        System.out.println("This is the integer " +v3);

        //long
        long v4=682353252345234L;// add L or l otherwise it will be considered a int by java.
        System.out.println("This is the long " +v4);

        //float / double
        float v5=.5f;
        float v6=.3f;//DONT USE FLOAT / DOUBLE EVER IF YOU WANT DECIMAL PRECISION AS IT GIVES WRONG ANSWER. RATHER USE BIG-INTEGER.
        System.out.println("This    will give wrong answer : " +(v5-v6));

        //BOOLEAN
        boolean v7=true;//default value is false.
        
        System.out.println("This  is the ans  : " +v7);
    }
}

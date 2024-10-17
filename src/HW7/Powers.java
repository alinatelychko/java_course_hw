package HW7;

public class Powers {

        public static void main(String[] args) {

            for (int i = 1; i <6; i++){
                System.out.println("Степінь числа "+i+ " є "+ powerA2(i));
                System.out.println("Степінь числа "+i+ " є "+ powerA3(i));
                System.out.println("Степінь числа "+i+ " є "+ powerA4(i));
                System.out.println();
            }

        }
    static int powerA2 (int a){
        int result = (int) Math.pow(a,2);
        return result;
    }
        static int powerA3 (int a){
            int result = (int) Math.pow(a,3);
            return result;
        }

    static int powerA4 (int a){
        int result = (int) Math.pow(a,4);
        return result;
    }



}

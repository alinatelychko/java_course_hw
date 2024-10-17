package HW7;

public class powerOfThree {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введіть число:");
//        int input = scanner.nextInt();
        for (int i = 1; i <6; i++){
            System.out.println("Степінь числа "+i+ " є "+ powerA3(i));
        }

    }

    static int powerA3 (int a){
        int result = (int) Math.pow(a,3);
        return result;
    }
}

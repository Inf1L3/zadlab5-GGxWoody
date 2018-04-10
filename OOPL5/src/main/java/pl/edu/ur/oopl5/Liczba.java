package pl.edu.ur.oopl5;

/**
 *
 * @author Przemysław Paliński
 */
public class Liczba {

    private int[] numbers = new int[2];
    private int[] numbersToBig = new int[3];

    public Liczba(String number) {
        if (number.length() == 2) {
            int temp = Integer.parseInt(number);
            numbers[0]= temp %10;
            numbers[1]= temp /10;
        } else {
            for (int i = 0; i < 2; i++) {
                numbers[i] = 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Liczba "+ numbers[1] + numbers[0];
    }

    public void multiply(int multiplyBy) {
        if (numbers[0] * multiplyBy > 9) {
            if ((numbers[1] * multiplyBy + ((numbers[0] * multiplyBy) / 10)) > 9 && (numbers[1] * multiplyBy + ((numbers[0] * multiplyBy) / 10)) < 100) {
                numbersToBig[0] = (numbers[0] * multiplyBy) % 10;
                numbersToBig[1] = (numbers[1] * multiplyBy + ((numbers[0] * multiplyBy) / 10)) % 10;
                numbersToBig[2] = (numbers[1] * multiplyBy + ((numbers[0] * multiplyBy) / 10)) / 10;
                System.out.println("" + numbersToBig[2] + numbersToBig[1] + numbersToBig[0]);
            } else if ((numbers[1] * multiplyBy + ((numbers[0] * multiplyBy) / 10)) > 100) {
                System.err.println("Number to big1!");
            } else {
                numbers[1] = (numbers[1] * multiplyBy + ((numbers[0] * multiplyBy) / 10));
                numbers[0] = (numbers[0] * multiplyBy) % 10;
                System.out.println("" + numbers[1] + numbers[0]);
            }
        } else {
            if (numbers[1] * multiplyBy > 9 && numbers[1] * multiplyBy < 100) {
                numbersToBig[0] = numbers[0] * multiplyBy;
                numbersToBig[1] = (numbers[1] * multiplyBy) % 10;
                numbersToBig[2] = (numbers[1] * multiplyBy) / 10;
                System.out.println("" + numbersToBig[2] + numbersToBig[1] + numbersToBig[0]);
            }else if (numbers[1] * multiplyBy + ((numbers[0] * multiplyBy) / 10) > 100) {
                System.err.println("Number to big2!");
            } else {
                numbers[1] = (numbers[1] * multiplyBy);
                numbers[0] = (numbers[0] * multiplyBy) % 10;
                System.out.println("" + numbers[1] + numbers[0]);
            }
        }
    }

}

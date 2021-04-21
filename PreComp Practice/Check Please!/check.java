import java.util.Scanner;

public class check {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            String line = input.nextLine();

            // count thousand

            // >thousandand
            // >0
            // <decimal
            // thousand

            // 570890.92
            // five hundred seventy thousand eight hundred ninety dollars and 92 cents

            while (line != null) {
                double num = Double.parseDouble(line);
                int thousands = (int) num / 1000;
                num %= 1000.00;
                int hundreds = (int) num;
                num %= 1.00;
                int decimals = (int) Math.round(num * 100.00);
                boolean other = false;
                if (thousands != 0) {
                    other = true;
                    digitize(thousands);
                    System.out.print("Thousand ");
                }
                if (hundreds != 0) {
                    other = true;
                    digitize(hundreds);
                    if (hundreds == 1) {
                        System.out.print("Dollar");
                    } else {
                        System.out.print("Dollars");
                    }
                }

                if (decimals >= 0) {
                    if (other) {
                        System.out.print(" and ");
                    }
                    if (decimals == 1) {
                        System.out.println("1 Cent");
                    } else {
                        System.out.println(decimals + " Cents");
                    }
                }
                if (input.hasNextLine()) {
                    line = input.nextLine();
                } else {
                    break;
                }
            }

        }

    }

    static void digitize(int n) {

        if (n > 99) {
            System.out.print(toOnes(n / 100) + "Hundred ");
            n %= 100;
        }
        if (n > 9) {
            if (n < 20) {
                if (n == 10) {
                    System.out.println("Ten ");
                } else if (n == 11) {
                    System.out.println("Eleven ");
                } else if (n == 12) {
                    System.out.println("Twelve ");
                } else if (n == 13) {
                    System.out.println("Thirteen ");
                } else if (n == 14) {
                    System.out.println("Fourteen ");
                } else if (n == 15) {
                    System.out.println("Fifteen ");
                } else if (n > 16) {
                    System.out.println(toOnes(n) + "teen ");
                }

            }

            else {
                if (n / 10 == 2) {
                    System.out.print("Twenty ");
                } else if (n / 10 == 3) {
                    System.out.print("Thirty ");
                } else if (n / 10 == 4) {
                    System.out.print("Fourty ");
                } else if (n / 10 == 5) {
                    System.out.print("Fifty ");
                } else if (n / 10 == 6) {
                    System.out.print("Sixty ");
                } else if (n / 10 == 7) {
                    System.out.print("Seventy ");
                } else if (n / 10 == 8) {
                    System.out.print("Eighty ");
                } else if (n / 10 == 9) {
                    System.out.print("Ninty ");
                }
                n %= 10;

                if (n != 0) {
                    System.out.print(toOnes(n));
                }

            }

        }
        if (n != 0) {
            System.out.print(toOnes(n));
        }

    }

    static String toOnes(int n) {
        if (n == 1) {
            return ("One ");
        } else if (n == 2) {
            return ("Two ");
        } else if (n == 3) {
            return ("Three ");
        } else if (n == 4) {
            return ("Four ");
        } else if (n == 5) {
            return ("Five ");
        } else if (n == 6) {
            return ("Six ");
        } else if (n == 7) {
            return ("Seven ");
        } else if (n == 8) {
            return ("Eight ");
        } else if (n == 9) {
            return ("Nine ");
        }
        return "";
    }

}

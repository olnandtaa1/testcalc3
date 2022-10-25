
    public class Divide {
        public static int Divide(int dividend, int divisor) {
            int quotient = 0x00, mask = 0x01;

            int temp = divisor;

            int sign = ((dividend < 0) ^ (divisor < 0)) ? sign = -1 : 1;


            dividend = dividend < 0 ? ((~dividend) + 1) : dividend;
            divisor = divisor < 0 ? ((~divisor) + 1) : divisor;


            if (dividend < divisor) return quotient;

            while (dividend > 0) {
                if ((dividend >= (divisor << 0x01)) && ((divisor << 0x01) > 0)) {
                    divisor <<= 0x01;
                    mask <<= 0x01;
                } else {
                    quotient = quotient | mask;
                    dividend = dividend - divisor;
                    divisor = temp;
                    mask = 0x01;
                }

            }
            return quotient * sign;

        }
    }



package ITTalentsHomeWork2;

//check if the k-th bit is set or not
    class Number {
        public static void isKthBitSet(int n, int k) {
            if ((n & (1 << k)) != 0)
                System.out.print("SET");
            else
                System.out.print("NOT SET");
        }

        // Driver code
        public static void main(String[] args) {
            int n = 10, k = 0;

            // Function call
            isKthBitSet(n, k);
        }
    }


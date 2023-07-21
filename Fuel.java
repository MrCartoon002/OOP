public class Fuel {
        static int countValidPairs(String str, int n)
        {
            int ans = 0;
            for (int i = 0, j; i < n; i = j) {
                j = i;
                Character ak1 = str.charAt(i);
                Character ak2 = str.charAt(j);
                while (j < n && ak1.equals(ak2)) {
                    j++;
                }
                ans += ((j - i) * (j - i - 1)) / 2;
            }
            return ans;
        }
        public static void main(String args[])
        {
            String str = "abab";
            System.out.print(countValidPairs( str, str.length()));
        }
}

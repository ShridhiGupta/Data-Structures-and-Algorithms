class RabinKarp {

    static final int d = 256; // number of characters

    static void search(String pattern, String text, int q) {
        int m = pattern.length();
        int n = text.length();
        int i, j;

        int p = 0; // hash value for pattern
        int t = 0; // hash value for text window
        int h = 1;

        // h = pow(d, m-1) % q
        for (i = 0; i < m - 1; i++)
            h = (h * d) % q;

        // Calculate initial hash values
        for (i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + text.charAt(i)) % q;
        }

        // Slide pattern over text
        for (i = 0; i <= n - m; i++) {

            // If hash values match
            if (p == t) {
                // Check characters one by one
                for (j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j))
                        break;
                }

                if (j == m)
                    System.out.println("Pattern found at index " + i);
            }

            // Calculate hash for next window
            if (i < n - m) {
                t = (d * (t - text.charAt(i) * h) 
                     + text.charAt(i + m)) % q;

                // Convert negative hash to positive
                if (t < 0)
                    t = t + q;
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABCCDDAEFG";
        String pattern = "CDD";
        int q = 101; // prime number

        search(pattern, text, q);
    }
}
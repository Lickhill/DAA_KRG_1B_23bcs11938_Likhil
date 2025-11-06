
class exp9 {
    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> arr = new ArrayList<>();
        int N = txt.length();
        int M = pat.length();

        int i = 0;
        while (i <= N - M) {
            int j = 0;

            while (j < M && txt.charAt(i + j) == pat.charAt(j)) {
                j++;
            }
            if (j == M) {
                arr.add(i);
                i++;
            } else {
                i++;
            }
        }
        return arr;
    }
}
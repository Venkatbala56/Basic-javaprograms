class Stringreverse {
    public static void main(String[] args) {

        String s = "venkat";
        String s1 = "";
        char c[] = s.toCharArray();

        for (int j = c.length - 1; j >= 0; j--) {
            s1 += c[j];
        }
        System.out.print(s1);
    }
}
class Solution {
    public boolean compute(Node root) {
        StringBuilder combinedString = new StringBuilder();
        for (Node current = root; current != null; current = current.next) {
            combinedString.append(current.data);
        }

        String str = combinedString.toString();
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

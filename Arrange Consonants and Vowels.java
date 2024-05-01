class Solution {
    public Node arrangeCV(Node head){
        ArrayList<Character> a = new ArrayList<>();
        Node p = head;
        while (p != null) {
            a.add(p.data);
            p = p.next;
        }

        ArrayList<Character> vow = new ArrayList<>();
        ArrayList<Character> con = new ArrayList<>();

        int l = a.size();
        for (int i = 0; i < l; i++) {
            char c = a.get(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vow.add(c);
            } else {
                con.add(c);
            }
        }

        p = head;
        int o = vow.size();
        int temp = 0;
        int gemp = 0;
        while (p != null) {
            if (temp < o) {
                p.data = vow.get(temp++);
            } else {
                p.data = con.get(gemp++);
            }
            p = p.next;
        }
        return head;
    }
}

package JavaProgs.Leetcode;

class Q58 {
    public int lengthOfLastWord(String s) {
        int c=0;
        s=s.trim();
        int l=s.length();
        int pos=s.lastIndexOf(" ");
        s=s.substring(pos+1,l);
        return (s.length());
    }
    public static void main(String args[]){
        Q58 ob=new Q58();
        System.out.println(ob.lengthOfLastWord("Hello World"));
    }
}

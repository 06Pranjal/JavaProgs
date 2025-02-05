package JavaProgs.SelfProgs;
class eggs
{
    public static void main(String args[])
    {
        int n=1342;
        int gross=n/144;
        int dozen=(n%144)/12;
        int left=(n%144)%12;
        System.out.println("The user has "+n+" number of eggs which constitute of "+gross+" gross "+dozen+" dozen "+left+" left eggs");
    }
}

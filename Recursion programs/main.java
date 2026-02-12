class Main {
    public static void main(String[] args) {
        patt(3,3);
    }
    static void patt(int r, int c)
    {
        if (r==1 && c==0)
        {
            return;
        }
        if (c==0) 
        {
            patt(r-1, r-1);
            System.out.println();
            return;
        }
        patt (r, c-1);
        System.out.print(c+"\t");
    }
}

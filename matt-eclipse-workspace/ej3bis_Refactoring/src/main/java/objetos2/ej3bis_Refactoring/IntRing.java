package objetos2.ej3bis_Refactoring;

public class IntRing extends ArrayRing{
    private int[] source;

    public IntRing(int[] src) {
    	super();
        source = src;
    }

    public int next() {
        if (idx >= source.length)
            idx = 0;
        return source[idx++];
    }
}
package objetos2.ej3bis_Refactoring;

public class CharRing extends ArrayRing {
    private char[] source;

    public CharRing(String src) {
    	super();
        source = src.toCharArray();
    }

    public char next() {
        if (idx >= source.length)
            idx = 0;
        return source[idx++];
    }
}
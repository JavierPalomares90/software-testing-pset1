package pset1;

public class D extends C
{
    int g;
    public D(int f, int g)
    {
        super(f);
        this.g = g;
    }

    @Override
    public boolean equals(Object o)
    {
        // assume this method is implemented for you
        return super.equals(o);
    }

    @Override
    public int hashCode()
    {
        // assume this method is implemented for you
        return super.hashCode();
    }
}

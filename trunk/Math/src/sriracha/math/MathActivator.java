package sriracha.math;

import sriracha.math.interfaces.*;
import sriracha.math.wrappers.jscience.JsMathActivator;

public abstract class MathActivator {
	
	
	public static MathActivator Activator = new JsMathActivator();

	public abstract IComplexMatrix complexMatrix(int i, int j);
    public abstract IRealMatrix realMatrix(int i, int j);

	public abstract IRealVector realVector(int length);

    public abstract IComplexVector complexVector(int length);


    public abstract IComplex complex(double real, double imag);
}

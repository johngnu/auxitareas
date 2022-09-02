package ejerviernes;

/**
 *
 * @author helen castillo
 */
public class PilaIES {
     private int max=100;
    private IEducSup v[]=new IEducSup[max+1];
    private int tope;
    
    PilaIES()
    {
     tope=0;       
    }
    boolean esvacia ()
    {
	if (tope == 0)
	    return (true);
	return (false);
    }


    boolean esllena ()
    {
	if (tope == max)
	    return (true);
	return (false);
    }


    int nroelem ()
    {
	return (tope);
    }


    void adicionar (IEducSup elem)
    {
	if (!esllena ())
	{
	    tope++;
	    v [tope] = elem;
	}
	else
	    System.out.println ("Pila llena");
    }


    IEducSup eliminar ()
    {
	IEducSup elem = null;
	if (!esvacia ())
	{
	    elem = v [tope];
	    tope--;
	}
	else
	    System.out.println ("Pila vacia");
	return (elem);
    }


    void mostrar ()
    {
	IEducSup elem = new IEducSup();
	if (esvacia ())
	    System.out.println ("Pila vacia");
	else
	{
	    System.out.println ("\n Datos de la Pila ");
	    PilaIES aux = new PilaIES ();
	    while (!esvacia ())
	    {
		elem = eliminar ();
		aux.adicionar (elem);
		elem.mostrar();
	    }
	    while (!aux.esvacia ())
	    {
		elem = aux.eliminar ();

		adicionar (elem);
	    }
	}
    }


    
    void vaciar (PilaIES a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }
}

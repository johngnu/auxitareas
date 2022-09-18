
package multiples.pilas.eje5;

public class PilaTemperaturas {
	private int max=40;
	private Temperatura v[]=new Temperatura[max+1];
	private int tope;
	public PilaTemperaturas() {
		tope=0;
	}
    boolean esvacia (){
		if (tope == 0)
		    return (true);
		return (false);
    }
    boolean esllena (){
		if (tope == max)
		    return (true);
		return (false);
    }
    int nroelem (){
    	return (tope);
    }
	void adicionar (Temperatura elem){
		if (!esllena ()){
		    tope++;
		    v [tope] = elem;
		}
		else
		    System.out.println ("Pila llena");
	}
	Temperatura eliminar (){
		Temperatura elem = new Temperatura();
		if (!esvacia ()){
		    elem = v[tope];
		    tope--;
		}
		else
		    System.out.println ("Pila vacia");
		return (elem);
	    }
	void mostrar(){
		Temperatura elem;
		if (esvacia ())
		    System.out.println ("Pila vacia");
		else {
		    System.out.println ("\n Datos de la Pila ");
		    PilaTemperaturas aux = new PilaTemperaturas();
		    while (!esvacia ()){
				elem = eliminar ();
				aux.adicionar (elem);
				elem.mostrar();
		    }
		    while (!aux.esvacia ()){
				elem = aux.eliminar ();
				adicionar (elem);
		    }
			}
	    }
	void llenar (int n){
		int i;
		for (i = 1 ; i <= n ; i++){
			Temperatura x=new Temperatura();
            x.leer();
            adicionar(x);
	        }
	    }
	void vaciar (PilaTemperaturas a){
		while (!a.esvacia ())
		    adicionar (a.eliminar ());
	    }

}

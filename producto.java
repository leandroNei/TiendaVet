package TiendaVet;

public class producto{

    private String nombre;
    private int precio;
    
    public producto(String n, int p){
        this.nombre=n;
        this.precio=p;
    }

    public void setnombre(String n){
        this.nombre=n;
    }

    public void setprecio(int p){
        this.precio=p;
    }

    public String getnombre(){
        return this.nombre;
    }

    public int getprecio(){
        return this.precio;
    }  
}
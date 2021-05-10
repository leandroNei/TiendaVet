package TiendaVet;

public class cliente{

    private String[] nombre;
    private String direccion;
    private String sexo;
    private int edad;
    private int tel; //telefono
    private int rut; //id

    private producto canasta[] = new producto[5];
    private int presupuesto;
    private int cantidad;
    

    public cliente(String[] n, String d, String s, int tel, int rut, int p){
        this.nombre = n;
        this.direccion = d;
        this.sexo = s;
        this.tel = tel;
        this.rut = rut;

        this.presupuesto = p;
        this.cantidad = 0;
    }

    public void setNombre(String[] n){
        this.nombre = n;
    }

    public void setDireccion(String d){
        this.direccion = d;
    }

    public void setSexo(String s){
        this.sexo = s;
    }

    public void setRut(int rut){
        this.rut = rut;
    }

    public void setTel(int tel){
        this.tel = tel;
    }

    public void setPres(int monto){
        this.presupuesto = monto;
    }

    public void setProducto(producto p){
        canasta[cantidad] = p;
        cantidad++;
    }

    public String[] getNombre(){
        return this.nombre;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public String getSexo(){
        return this.sexo;
    }
    
    public int getTel(){
        return this.tel;
    }

    public int getRut(){
        return this.rut;
    }

    public int getPresupuesto(){
        return this.presupuesto;
    }

    public void ajustapresupuesto(int valor){
        this.presupuesto = this.presupuesto - valor;
    }

    public int getcantidad(){
        return this.cantidad;
    }
}
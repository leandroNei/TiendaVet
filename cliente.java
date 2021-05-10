package TiendaVet;

public class cliente{

    private String nombre;
    private String direccion;
    private String sexo;
    private int edad;
    private String tel; //telefono
    private String rut; //id

    private producto canasta[] = new producto[5];
    private int presupuesto;
    private int cantidad;
    

    public cliente(String n, String d, String s, String tel, String rut, int p){
        this.nombre = n;
        this.direccion = d;
        this.sexo = s;
        this.tel = tel;
        this.rut = rut;

        this.presupuesto = p;
        this.cantidad = 0;
    }

    public void setNombre(String n){
        this.nombre = n;
    }

    public void setDireccion(String d){
        this.direccion = d;
    }

    public void setSexo(String s){
        this.sexo = s;
    }

    public void setRut(String rut){
        this.rut = rut;
    }

    public void setTel(String tel){
        this.tel = tel;
    }

    public void setPres(int monto){
        this.presupuesto = monto;
    }

    public void setProducto(producto p){
        canasta[cantidad] = p;
        cantidad++;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public String getSexo(){
        return this.sexo;
    }
    
    public String getTel(){
        return this.tel;
    }

    public String getRut(){
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

    /*
    @Override
    public String toString(){
        
        System.out.println("/--nombre del cliente: " + this.nombre + " --/");
        String n = "Productos comprados:\n-";

        for(int i=0;i<this.cantidad;i++){

            n = n + this.canasta[i].getnombre();
            n = n + "\n-";
        }
        System.out.println("/--Dinero sobrante: " + this.presupuesto + " --/");
        return n;
    }*/
}
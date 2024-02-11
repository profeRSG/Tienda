package modelo.usuario;
public class Usuario {
    private String username;
    private String nombre;

    public Usuario(String username, String nombre) {
        this.username = username;
        this.nombre=nombre;
    }

    public String getUsername() {
        return username;
    }
    
    public String getNombre() {
        return "nombre Usuario";//TODO este metodo debe devolver el nombre del usuario
        //y no siempre la misma cadena.
    }
}






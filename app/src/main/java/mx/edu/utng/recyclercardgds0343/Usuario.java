package mx.edu.utng.recyclercardgds0343;

public class Usuario {
    //Definir las propiedades de la clase para el modelo de datos
    private int id;
    private String nombre;
    private String apellidoPaterno;
    private String foto;
    private String email;

    //Generar un constructor con todos los parámetros

    public Usuario(int id, String nombre, String apellidoPaterno, String foto, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.foto = foto;
        this.email = email;
    }

    //Generar otro contructor con el parametro id

    public Usuario(int id) {
        this.id = id;
    }

    //Definir Getter y Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Definir el método toString

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", foto='" + foto + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

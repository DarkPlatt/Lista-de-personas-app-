public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static  int numeroPersonas = 0;

    //constructor vacio

    public  Persona () {
        this.id = ++ Persona.numeroPersonas;
    }

    //contructor con argumentos

    public Persona (String nombre, String tel, String email) {
        this (); // para mandar llamar el constructor vacio
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    public int getId () {
        return id;
    }

    public  void setId () {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() { // este metodo manda imprimir una cadena indicando las clases y valor de los atributos
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}'; // + super.toString(); podemos mandar llamar metodos de la clase padre
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona ("Jorge Osuna", "6671493812", "jorgeosuna360@gmail.com");
        System.out.println(persona1);
    }
}

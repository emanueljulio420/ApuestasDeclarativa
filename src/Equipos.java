public class Equipos {
    private int id;
    private String nombre;
    private String categoria;
    private int victorias;
    private int derrotas;

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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public Equipos(int id, String nombre, String categoria, int victorias, int derrotas) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.victorias = victorias;
        this.derrotas = derrotas;
    }

}

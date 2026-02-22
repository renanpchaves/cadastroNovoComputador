public class Computador {
    // Atributos da classe
    private String marca;
    private String modelo;
    private int memoriaRAM; // em GB
    private int armazenamento; // em GB
    private String sistemaOperacional;

    // Construtor default
    public Computador() {
        this.marca = "Não especificado";
        this.modelo = "Não especificado";
        this.memoriaRAM = 0;
        this.armazenamento = 0;
        this.sistemaOperacional = "Não especificado";
    }

    // Construtor com parametros
    public Computador(String marca, String modelo, int memoriaRAM, int armazenamento, String sistemaOperacional) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
    }

    // get/set
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    // printing
    @Override
    public String toString() {
        return "Marca: " + marca + "\n" +
               "Modelo: " + modelo + "\n" +
               "Memória RAM: " + memoriaRAM + "GB\n" +
               "Armazenamento: " + armazenamento + "GB\n" +
               "Sistema Operacional: " + sistemaOperacional + "\n" +
               "----------------------------------------";
    }
}
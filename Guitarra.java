package unidade_1;

//declaração da classe

      private string numeroSerie, fabricante, modelo, tipo, madeira;
      private double preço;

//criação do construtor da classe guitarra

  public Guitarra(
              string numeroSerie, string fabricante,
              string modelo, string tipo,
              string madeira, double preço) {
         this.numeroSerie = numeroSerie;
         this.fabricante = fabricante;
         this.modelo = modelo;
         this.tipo = tipo;
         this.madeira = madeira;
         this.preço = preço;
         }

  public string getNumeroSerie(){
      return numeroSerie;
      }
  public void setNumeroSerie(String numeroSerie){
      this.numeroSerie = numeroSerie;
      }
  public string getFabricante(){
      return fabricante;
      }
  public void setFabricante(String fabricante){
      this.fabricante = fabricante;
      }
  public string getModelo(){
      return modelo;
      }
  public void setModelo(String modelo){
      this.modelo = modelo;
      {
  public string getTipo(){
      return tipo;
      }
  public void setTipo(String tipo){
      this.tipo = tipo;
      }
  public string getMadeira(){
      return madeira;
      }
  public void setMadeira(String madeira){
      this.madeira = madeira;
      }
  public double getPreço(){
      return preço;
      }
  public void setPreço(double preço){
      this.preço = preço;
      }
//o método main() é o método principal da classe

  public static void main(String[] args){

  //instanciamos um objeto chamado "minhaGuitarra" que será do tipo "Guitarra"
  //Os valores passados são usados pelo construtor da classe para criar o objeto

      Guitarra minhaGuitarra = new Guitarra("0605710", "Fender", "Telecaster", "Elétrica", "Mogno", 2000);

  //Testando os dados da classe, imprimindo a saída simples no terminal

  System.out.println(minhaGuitarra.getNumeroSerie());
  System.out.println(minhaGuitarra.getFabricante());
  System.out.println(minhaGuitarra.getModelo());
  System.out.println(minhaGuitarra.getMadeira());
  System.out.println(minhaGuitarra.getPreco());
  System.out.println(minhaGuitarra.getTipo());
  }

 }

public class Main {
    public static void main(String[] args) {
        Endereco enderecoRestauranteTheus = new Endereco ();

        Endereco enderecoRestauranteTheus2 = new Endereco ("555-8955", "Endereço Theus");
        Endereco enderecoRestauranteFulana = new Endereco ("589-8932", "Endereço Fulana");

        Restaurante restaurante = new Restaurante();
        restaurante.setId(1L);
        restaurante.setNomeFantasia("Restaurante do Theus");
        restaurante.setCnpj("00.00.00.00-30");
        restaurante.setEndereco(enderecoRestauranteTheus2);
        System.out.println(restaurante);

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setId(2L);
        restaurante2.setNomeFantasia("Restaurante da Fulana");
        restaurante2.setCnpj("00.00.00.00-12");
        restaurante2.setEndereco(enderecoRestauranteFulana);
        System.out.println(restaurante2);

    }

}
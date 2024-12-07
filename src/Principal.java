public class Principal {
    public static void main(String[] args) {
        String idade = "22a";
        boolean ehNumerico;
        int idadeConvertida = 0;

        try {
            idadeConvertida = Integer.parseInt(idade);
            ehNumerico = true;
            System.out.printf("%s convertido para %d", idade, idadeConvertida);
        } catch (NumberFormatException e) {
            ehNumerico = false;
            System.out.printf("Erro ao converter '%s' para inteiro. Informe apenas números\n", idade);
        } finally {
            System.out.println("Fim da execução");
        }


    }
}

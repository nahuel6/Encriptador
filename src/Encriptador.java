public class Encriptador {
    private Integer clave = 1;
    public void setClave (Integer clave){
        this.clave = clave;
    }
    public String encriptar(String texto) {
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            //System.out.println(texto.charAt(i));
            int codigolAscii = texto.charAt(i);
            codigolAscii = codigolAscii * clave;
            resultado += codigolAscii + "_" ;
        }

        return resultado;
    }

    public String desencriptar(String texto) {
        String resultado = "";
        String [] numeros = texto.split("_");// arroja array de Strings
        for (int i = 0; i < numeros.length; i++) {
            String strNumero = numeros[i];
            int numero = Integer.parseInt(strNumero);//convierto String a Int
            numero = numero / clave;

            char caracter = (char)numero;
            String letra = Character.toString(caracter);
            resultado += letra;

        }
        return resultado;
    }
}
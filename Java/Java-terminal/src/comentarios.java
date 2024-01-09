public class comentarios {
    
    public static void main(String[] args) {
        //Olá, eu sou um comentario em uma única linha.

        /*Olá,
         * Eu sou um comentario
         * que posso ser mais detalhado
         * quando necessário         */

    }
    /**
     * Estas duas estrelinhas acima
     * servem para identificar que você
     * pretende elaborar um comentario
     * a nivel de documentação.
     * Que incrível!!
     */


    /**
     * Este método foi elaborado as pressas
     * por isso, eu abreviei o nome das variaveis
     * mas olha, ele tem a finalidade de somar ou multiplicar 
     * dois números
     */
     

    public int somaMultiplica(int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ //M = multipliação
            r = n * x;

        }else {
            //se não soma mesmo
            r = n + x;
        }
        return r;
    }
}

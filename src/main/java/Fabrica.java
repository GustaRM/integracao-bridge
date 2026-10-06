public class Fabrica {

    private Fabrica() {};
    private static Fabrica instance = new Fabrica();
    public static Fabrica getInstance() {
        return instance;
    }

    public main.FabricaAbstrata obterFabrica(String fabrica) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName(fabrica);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fabrica inexistente");
        }
        if (!(objeto instanceof main.FabricaAbstrata)) {
            throw new IllegalArgumentException("Fabrica inválida");
        }
        return (main.FabricaAbstrata) objeto;
    }
}
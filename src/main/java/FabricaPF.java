public class FabricaPF implements FabricaAbstrata {

    @Override
    public Contrato createContrato() {
        return new ContratoPF();
    }

    @Override
    public main.Procuracao createProcuracao() {return new main.ProcuracaoPF();}
}

package src;

import java.io.IOException;

public interface AcaoRelatorios {

    void relatorioAdiados () throws IOException;
    void relatorioCancelados() throws IOException;
    void relatorioCompleto();
    void compromissosConfirmados();

}

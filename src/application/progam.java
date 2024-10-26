package application;

import entities.Aeronave;
import entities.Ocorrencia;
import services.AnaliseDeDados;
import util.ReaderCsv;

import java.util.ArrayList;
import java.util.List;

public class progam {
    public static void main(String[] args) {
        ReaderCsv reader = new ReaderCsv();

        List<Ocorrencia> ocorrencias = reader.lerArquivoOcorrencia();

        AnaliseDeDados analise = new AnaliseDeDados(ocorrencias);

        //leitor.lerarquivoAeronave();
        //reader.lerArquivoOcorrencia();
        System.out.println(analise.causasMaisComuns());


    }
}

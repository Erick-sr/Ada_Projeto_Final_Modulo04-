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
        List<Aeronave> aeronaves = reader.lerarquivoAeronave();

        AnaliseDeDados analise = new AnaliseDeDados(ocorrencias, aeronaves);

        //leitor.lerarquivoAeronave();
        //reader.lerArquivoOcorrencia();
        System.out.printf("Causas mais comum de Ocorrencia  %n %s",  analise.causasMaisComuns());
        System.out.println();
        System.out.printf("Ocorrencia por aeronaves  %n %s ", analise.ocorrenciaPorAeronave());
        System.out.println();
        System.out.printf("Ocorrencia por Estado %n %s", analise.ocorrenciaPorEstado());
        System.out.println();
        System.out.printf("Número ocorrencia por ano %n %s",analise.ocorrenciaPorAno());


    }
}

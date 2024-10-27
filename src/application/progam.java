package application;

import entities.Aeronave;
import entities.Ocorrencia;
import services.AnaliseDeDados;
import util.ReaderCsv;

import java.util.List;


public class progam {
    public static void main(String[] args) {

        ReaderCsv reader = new ReaderCsv();

        List<Ocorrencia> ocorrencias = reader.lerArquivoOcorrencia();
        List<Aeronave> aeronaves = reader.lerarquivoAeronave();

        AnaliseDeDados analise = new AnaliseDeDados(ocorrencias, aeronaves);

        
        System.out.printf("Causas mais comum de Ocorrência  %n %s", analise.causasMaisComuns());
        System.out.println();
        System.out.printf("%n Ocorrência por aeronaves  %n %s ", analise.ocorrenciaPorAeronave());
        System.out.println();
        System.out.printf("%n Ocorrência por Estado %n %s", analise.ocorrenciaPorEstado());
        System.out.println();
        System.out.printf("%n Número ocorrência por ano %n %s", analise.ocorrenciaPorAno());
        System.out.println();
        System.out.printf("%n Número de ocorrência por Fabricante %n %s", analise.ocorrenciaPorFabricante());

    }
}

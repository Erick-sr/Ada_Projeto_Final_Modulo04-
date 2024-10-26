package services;

import entities.Aeronave;
import entities.Ocorrencia;
import util.ReaderCsv;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnaliseDeDados {
private List<Aeronave> aeronaves;
private List<Ocorrencia> ocorrencias;

    public AnaliseDeDados(List<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public Map<String, Long > causasMaisComuns(){
    return ocorrencias.stream().collect(Collectors.groupingBy(Ocorrencia::getTipo, Collectors.counting()));
}



}

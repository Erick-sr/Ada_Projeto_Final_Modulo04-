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

    public AnaliseDeDados(List<Ocorrencia> ocorrencias, List<Aeronave> aeronaves) {
        this.ocorrencias = ocorrencias;
        this.aeronaves = aeronaves;
    }

    public Map<String, Long > causasMaisComuns(){
    return ocorrencias.stream().collect(Collectors.groupingBy(Ocorrencia::getTipo, Collectors.counting()));
}
//public Map<String, Long > ocorrenciasPorAno(){


 public Map<String, Long> ocorrenciaPorAno(){
        return ocorrencias.stream().collect(Collectors.groupingBy(year -> year.getDiaOcorrencia()
                .substring(0, 4), Collectors.counting()));
 }

 public Map<String, Long> ocorrenciaPorEstado(){
        return ocorrencias.stream().collect(Collectors.groupingBy(Ocorrencia::getUf, Collectors.counting()));
 }

 public Map<String, Long> ocorrenciaPorAeronave(){
        return aeronaves.stream().collect(Collectors.groupingBy(Aeronave::getEquipamento, Collectors.counting()));
 }
       // return ocorrencias.stream().collect(Collectors.groupingBy())
}



